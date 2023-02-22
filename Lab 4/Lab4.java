import java.util.*;

class Lab4{
    static String accountNum;
    static String holderName;
    static float accountBalance;

    static float[] deposit(Scanner scan) {
        float[] dArr = new float[4];
        dArr[0] = accountBalance;

        System.out.println("Enter the amount you want to deposit: ");
        float deposit = Float.parseFloat(scan.nextLine());
        dArr[1] = deposit;
        accountBalance = deposit + accountBalance;
        dArr[2] = 0;
        dArr[3] = accountBalance;

        return dArr;
    }

    static float[] withdraw(Scanner scan) {
        float[] wArr = new float[4];
        wArr[0] = accountBalance;
        System.out.println("Enter the amount you want to withdraw: ");
        float withdraw = Float.parseFloat(scan.nextLine());
        wArr[1] = 0;
        wArr[2] = withdraw;
        if (withdraw > accountBalance) {
            System.out.println("Insufficient balance! Your balance is " + accountBalance);
        } else {
            accountBalance = accountBalance - withdraw;
            wArr[3] = accountBalance;
        }
        return wArr;
    }

    static void summary() {
        System.out.println("Holder Name: " + holderName);
        System.out.println("Account Number: " + accountNum);
        System.out.println("Account Balance: " + accountBalance);
    }

    static void transaction(float[][] arr, int num) {
        System.out.println("+-------------------------------------------------------------+");
        System.out.println("| No. | Account Balance | Deposit | Withdrawal | Remaining Balance |");
        System.out.println("+-------------------------------------------------------------+");

        for (int i = 0; i < num; i++) {
            System.out.printf("| %3d | %15.2f | %7.2f | %10.2f | %18.2f |\n",
                    i + 1, arr[i][0], arr[i][1], arr[i][2], arr[i][3]);
        }

        System.out.println("+-------------------------------------------------------------+");
    }

    public static void main(String[] args) {
        float[][] trans = new float[1024][4];
        int num = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your account number: ");
        accountNum = scan.nextLine();
        System.out.print("Enter your name: ");
        holderName = scan.nextLine();
        System.out.print("Enter your total balance: ");
        accountBalance = Float.parseFloat(scan.nextLine());
        int choice;

        do {
            System.out.println("To deposit money enter 1");
            System.out.println("To withdraw money enter 2");
            System.out.println("To print the transactions enter 3");
            System.out.println("To print account summary enter 4");
            System.out.println("To exit enter 5");
            choice = Integer.parseInt(scan.nextLine());
            switch (choice) {
                case 1:
                    float[] a = deposit(scan);
                    trans[num] = a;
                    num++;
                    break;

                case 2:
                    float[] b = withdraw(scan);
                    if (b[3] != 0) {
                        trans[num] = b;
                        num++;
                    }
                    break;

                case 3:
                    transaction(trans, num);
                    break;

                case 4:
                    summary();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;
            }
        } while (choice != 5);
    }
}
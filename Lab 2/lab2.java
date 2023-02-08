import java.util.*;

class lab2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] name = new String[1024];
        int count = 0;
        int num;
        String nam;
        String rnam;

        do {
            System.out.println("Enter 1 to add a name");
            System.out.println("Enter 2 to remove a name");
            System.out.println("Enter 3 to search for a name");
            System.out.println("Enter 4 to print all names");
            num = Integer.parseInt(scan.nextLine());

            switch (num) {
                case 1:
                    System.out.println("Enter the name: ");
                    nam = scan.nextLine();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (nam.equals(name[i])) {
                            System.out.println("Name already exists");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        name[count] = nam;
                        count++;
                    }
                    break;
                case 2:
                    System.out.println("Enter the name to remove: ");
                    rnam = scan.nextLine();
                    int index = -1;
                    for (int i = 0; i < count; i++) {
                        if (rnam.equals(name[i])) {
                            index = i;
                            break;
                        }
                    }
                    if (index != -1) {
                        for (int i = index; i < count - 1; i++) {
                            name[i] = name[i + 1];
                        }
                        count--;
                    } else {
                        System.out.println("Name not found");
                    }
                    break;
                case 3:
                    System.out.println("Enter the name to search for: ");
                    nam = scan.nextLine();
                    found = false;
                    for (int i = 0; i < count; i++) {
                        if (nam.equals(name[i])) {
                            System.out.println("Name found");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Name not found");
                    }
                    break;
                case 4:
                    for (int i = 0; i < count; i++) {
                        System.out.println(name[i]);
                    }
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while (num != 4);
    }
}

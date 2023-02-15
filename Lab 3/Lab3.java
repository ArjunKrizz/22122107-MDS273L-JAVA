import java.util.*;
class Lab3 {
    public static void main(String[] args){
        int[] arr=new int[5];
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the "+(i+1)+" th value of the array ");
            arr[i]=scan.nextInt();
        }
        int choice;
        do{
            System.out.println("Enter 1 to find the mean of array : ");
            System.out.println("Enter 2 to find the median of the array : ");
            System.out.println("Enter 3 to find  the mode of the array: ");
            System.out.println("Enter 4 to exist :");
            choice=scan.nextInt();

            switch(choice){
                case 1:
                Mean(arr);

                break;

                case 2:
                Median(arr);

                break;
                
                case 3:
                Mode(arr);

                break;

                case 4:
                System.out.println("Existing......");

                break;

            }

        }while(choice!=4);
    }
    public static void Mean(int[] arr){
        float sum=0;
        float mean;
        for(int i=0;i<arr.length;i++){

            sum+=arr[i];
            }
        mean= sum/arr.length;
        System.out.println("the mean of the given array is "+(mean));

        }//

    public static void Median(int[] arr){
        Arrays.sort(arr);
        int n;
        int median;
        if(arr.length%2==0){
            n=arr.length/2;
        }else{
            n=(arr.length+1)/2;
        }
        median=arr[n];
        System.out.println("the median of the given array is "+(median));

    }//end
    public static void Mode(int[] arr) {
        int mode = 0;
        int maxCounts = 0;
    
        int[] counts = new int[100];
    
        for (int i = 0; i < arr.length; i++) {
            counts[arr[i]]++;
            if (maxCounts < counts[arr[i]]) {
                maxCounts = counts[arr[i]];
                mode = arr[i];
            }
        }
    
        System.out.println("The mode of the given array is " + mode);
    }
    

}

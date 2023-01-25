import java.util.*;


public class Lab1 {
    public static void main(String[] args){


        Scanner obj = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name=obj.nextLine();
        System.out.print("enter ur age: ");
        int age =Integer.parseInt(obj.nextLine());
        System.out.print("Enter your class : ");
        String clas=obj.nextLine();
        System.out.print("choose your gender[f]female,[m]male :");
        char Gender = obj.nextLine().charAt(0);
        System.out.print("choose your Statename :");
        String Loc=obj.nextLine();
        System.out.println("Name:" +name);
        System.out.println("age:" + age);
        System.out.println("class:" +clas);
        if (Gender=='f') {
            System.out.println("You are a FEMALE");
        }
        else if (Gender=='m'){
            System.out.println("You are a MALE");
        }
        else{
            System.out.println("You enterd wrong choice");
        }
    
        switch(Loc){
            case "kerala":
            System.out.println("The Student is from the southern states of India");
            break;
            case "karnataka":
            System.out.println("The Student is from the southern states of India");
            break;
            case "tamilnadu":
            System.out.println("The Student is from the southern states of India");
            break;
            case "goa":
            System.out.println("The Student is from the southern states of India");
            break;
            case "Andhra Pradesh":
            System.out.println("The Student is from the southern states of India");
            break;
            case "telegana":
            System.out.println("The Student is from the southern states of India");
            break;
            default:{
                System.out.println("The Student is from the northern states of India");
                break;
            }



        }

        }
    } 
    
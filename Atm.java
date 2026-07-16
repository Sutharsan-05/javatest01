
// ATM Mine Model Code

import java.util.Scanner;
class Atm{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nCreate Your account : \n");

        System.out.print("Enter your Name : ");
        String name = sc.nextLine();

        System.out.print("Create Your Password : ");
        String passwd = sc.nextLine();

        int n = 1;
        int amount = 0;

        while(n == 1){
            System.out.print("\nEnter your password to login : ");
            String apasswd = sc.nextLine();

            if(apasswd.equals(passwd)){
                System.out.print("\nPls Deposit Your Initial Amount : ");
                amount = sc.nextInt();
                break;
            }
            else{
                System.out.println("\nCheck your pasawd :: Try Again");
            }   
        }

        while(n == 1){
            System.out.println("\n1.Check Balance \n2.Deposit \n3.Withdraw Amount \n4.Exit");
            System.out.println("\nEnter your choice (1 to 4) : ");
            int ch = sc.nextInt();
            switch(ch){
                case 1 :
                    System.out.println("\nUserName = "+name);
                    
                    System.out.println("Balance = "+amount);
                    break;
                case 2 : 
                    System.out.println("\nUserName = "+name);
                    System.out.println("Enter an Amount to be Deposit : ");
                    int am = sc.nextInt();
                    amount += am;
                    System.out.println("Successfully Deposited  :: @_#");
                    break;
                case 3 :
                    System.out.println("\nUserName = "+name);
                    System.out.println("Enter an Amount to Withdraw : ");
                    int with = sc.nextInt();
                    amount -= with;
                    System.out.println("Successfully Withdraw your amount !!");
                    break;
                case 4 :
                    n--;
                    break;
                default:
                    System.out.println("\nInvalid Choice");
                break;        
            }
        }
    }
}


/* 
   *
   * *
   * * * 
*/

import java.util.Scanner;

class Character{
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a Character : ");
        char c = sc.next().charAt(0);

        System.out.print("\nEnter How Many Time to Print : ");
        int a = sc.nextInt();

        for(int i = 0 ; i <= a ; i++){
            for(int j = 1 ; j <= i; j++){
                System.out.print(c);
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
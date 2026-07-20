

//  Constructor Using Class Object  ::: To Get Name 


import java.util.Scanner;

class Name{
    String name;
}

public class ConstructorUsingClassObject{
    public static void main(String[]ar){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter How Many Student to store : ");
        int n = sc.nextInt();

        Name[] s1 = new Name[n];

        for(int i = 0 ; i < n ; i++ ){
            s1[i] = new Name();
        }
        for(int i = 0 ; i < n ; i++){
            System.out.print("\nEnter your name "+(i+1)+" : ");
            s1[i].name = sc.next();
        }
        
        for(int i = 0 ; i < n ; i++){
        System.out.print("\nThe Student name is  : "+s1[i].name);
        }

        sc.close();

    }
}
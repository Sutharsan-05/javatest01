
//  Class Object Student ::: Info 

import java.util.Scanner;

class StdInfo{
    String name;
    int roll ;
    String Department;
}

public class ClassObjectStudentInfo{
    public static void main(String[] ar){

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a number of Student data : ");
        int n = sc.nextInt();

        StdInfo[] std = new StdInfo[n];

        for(int i = 0 ;i < n ;i++){
            std[i] = new StdInfo();
        }

        for(int i = 0 ;i < n ;i++ ){
            System.out.print("\nEnter Student "+(i+1)+" Name : ");
            std[i].name = sc.next();
            System.out.print("\nEnter Student "+(i+1)+" Roll.no. : ");
            std[i].roll = sc.nextInt();
            System.out.print("\nEnter Student "+(i+1)+" Department : ");
            std[i].Department = sc.next();
        }

        System.out.print("\nThe Student Details : \n");
        for(int i = 0 ;i < n ; i++){
            System.out.print("\nStudent "+(i+1)+" Name  = "+(std[i].name)+"\nStudent "+(i+1)+" Roll.no. = "+(std[i].roll)+"\nStudent "+(i+1)+" Department = "+(std[i].Department)+"\n");
        }
        sc.close();
    }
}
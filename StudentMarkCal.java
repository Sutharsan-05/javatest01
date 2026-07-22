
// Student Info by using Class and Object .. . 

import java.util.Scanner;

class Student {
    String name;
    String rollNo;
    int m1, m2, m3;

    Student(String name, String rollNo, int m1, int m2, int m3) {
        this.name = name;
        this.rollNo = rollNo;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
}

class Result {

    int total(Student s) {
        return s.m1 + s.m2 + s.m3;
    }

    int average(Student s) {
        return total(s) / 3;
    }

    String grade(Student s) {
        int avg = average(s);

        if (avg >= 90)
            return "A";
        else if (avg >= 75)
            return "B";
        else if (avg >= 60)
            return "C";
        else
            return "D";
    }
}

public class StudentMarkCal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        String roll = sc.next();

        System.out.print("Enter Mark 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Mark 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Mark 3: ");
        int m3 = sc.nextInt();

        Student s = new Student(name, roll, m1, m2, m3);

        Result r = new Result();

        System.out.println("\n----- Student Result -----");
        System.out.println("Name     = " + s.name);
        System.out.println("Roll No  = " + s.rollNo);
        System.out.println("Total    = " + r.total(s));
        System.out.println("Average  = " + r.average(s));
        System.out.println("Grade    = " + r.grade(s));

        sc.close();
    }
}
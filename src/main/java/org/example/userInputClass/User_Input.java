package org.example.userInputClass;

import java.util.Scanner;

public class User_Input {
    int rollno;
    String name;
    static int salary;




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your rollno");
        int rollno=sc.nextInt();
        //String rollno=sc.nextLine();

        System.out.println("Enter your salary");
        // I
        int salary=sc.nextInt();
        //double salary=sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter your name");
        String name=sc.next();
        System.out.println("Enter your rollno : "+rollno);
        System.out.println("Enter your salary : "+salary);
        System.out.println("Enter your name : "+name);


        /*userInput u=new userInput();
        System.out.println("My roll is: " + u.rollno);
        System.out.println("My name is: " +u.name);
        System.out.println("My salary is: " + u.salary);*/

    }

}

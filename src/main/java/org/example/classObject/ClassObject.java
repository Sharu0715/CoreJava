package org.example.classObject;

import java.util.Scanner;

public class ClassObject {
    int rollno;
    int money;
    String name;

    public static void main(String[] args) {
        ClassObject c1= new ClassObject();
        Scanner sc=new Scanner(System.in);
        System.out.println("Fill First student data: ");
        //sc.nextLine();
        //c1.rollno=1;
        //c1.money=100;
        //c1.name="John";
        System.out.println("Enter rollno: ");
        c1.rollno=sc.nextInt();
        System.out.println("Enter money: ");
        c1.money=sc.nextInt();
        System.out.println("Enter name: ");
        c1.name=sc.next();
        System.out.println("Roll no: "+c1.rollno);
        System.out.println("Money: "+c1.money);
        System.out.println("Name: "+c1.name);
        System.out.println("\n");
        System.out.println("Fill Second student data: ");
        c1.rollno=2;
        c1.money=200;
        c1.name="Jane";
        System.out.println("Roll no: "+c1.rollno);
        System.out.println("Money: "+c1.money);
        System.out.println("Name: "+c1.name);

    }
}

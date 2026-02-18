package org.example.method;

import java.util.Scanner;

public class Method2 {
    int a;
    int b;
    String Myname;
    int age;
    double salary;

    //Method without parameter and without return type
    void name(){
        System.out.println("Hello World");
    }

    //Method with parameter without Returntype
    void name2(String FirstName,String LastName){
        System.out.println("Hello "+FirstName+" "+LastName);
    }

    // Method without parametr with retrun type
    int add(){
        return a+b;
    }
    int sub(){
        return a-b;
    }

    int mult(){
        return  a*b;
    }
    int div(){
        return  a/b;
    }
   /* Mehod2(int a,int b){
        this.a=a;
        this.b=b;

    }*/

    // Method with parameter with return type
    String data(String Myname,int age,double salary){
        String data1="Hello "+Myname+" "+age+" "+salary;
        return data1;
    }
    public static void main(String[] args) {
        Method2 m=new Method2();
        Scanner sc=new Scanner(System.in);
        m.name();
        System.out.println("\n");
        System.out.println("Enter First Name:");
        String FirstName=sc.nextLine();
        System.out.println("Enter Last Name:");
        String LastName=sc.nextLine();
        m.name2(FirstName,LastName);
        System.out.println("\n");
        System.out.println("Enter a number");
        m.a=sc.nextInt();
        System.out.println("Enter b number");
        m.b=sc.nextInt();


        System.out.println("Addtion: "+m.add());
        System.out.println("Subtraction: "+m.sub());
        System.out.println("Multiplication: "+m.mult());
        System.out.println("Division: "+m.div());
        System.out.println("\n");
        //m.data("Sharyu",25, 80000);
        // System.out.println(m.data("Sharyu",25,80000));
        System.out.println("Enter My name is: ");
        m.Myname=sc.next();
        System.out.println("Enter Age is: ");
        m.age=sc.nextInt();
        System.out.println("Enter Salary is: ");
        m.salary=sc.nextDouble();
        System.out.println("Name: "+m.Myname);
        System.out.println("Age: "+m.age);
        System.out.println("Salary: "+m.salary);
        System.out.println("\n");



    }
}

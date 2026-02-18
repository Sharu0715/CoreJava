package org.example.conditionalStat;

import java.util.Scanner;

public class ConditionalStatment {

    //if else statement
    // Exmaple 1 (Wright age to vote)
    int  a ;
    int age;
    int marks;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ConditionalStatment c=new ConditionalStatment();
        System.out.println("Welcome to First Example");
        System.out.println("The value is 10 or less tha 10 ");
        System.out.println("Enter a value ");
        c.a=sc.nextInt();
        //usiing if statment
        if(c.a<10){
            System.out.println("number is less than 10");
        }

        System.out.println("\n");
        System.out.println("Move to another exmaple");
        System.out.println("Eligible for voting or not ");

        System.out.println("Enter The Age");
        int age = sc.nextInt();
        // Using if else statment
        {  if(age>18){
            System.out.println("This is right age to vote");
        }else{
            System.out.println("This is not right age to vote");
        } }
        System.out.println("\n");
        System.out.println("Move to another exmaple");
        System.out.println("Marks and garde");

        //Exmaple 2 (Marks and garde)
        // Using if else ladder
        sc.nextLine();
        System.out.println("Enter your marks");
        int marks=sc.nextInt();
        if(marks>= 90){
            System.out.println("THe grade is O");
            System.out.println("Result is Pass");

        }else if(marks>=80){
            System.out.println("THE grade is A");
            System.out.println("Result is Pass");
        }else if(marks>=70){
            System.out.println("THE grade is B");
            System.out.println("Result is Pass");
        }else if(marks>=60){
            System.out.println("THE grade is C");
            System.out.println("Result is Pass");

        }else if(marks>=50){
            System.out.println("THE grade is D");
            System.out.println("Result is Pass");
        }else{
            System.out.println("THE grade is F+");
            System.out.println("Result is Fail");


        }

        System.out.println("\n");
        System.out.println("Move to another exmaple");
        System.out.println("Calculator");

        // Switch case
        //Exmaple 3)(Calculator)



        System.out.println("Enter first number ");
        int num1=sc.nextInt();
        System.out.println("Enter second number ");
        int num2=sc.nextInt();
        System.out.println("Enter the Operator(+ - * / %)");
        char operator=sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("Addition result is "+(num1+num2));
                break;
            case '-':
                System.out.println("Subtraction result is "+(num1-num2));
                break;
            case '*':
                System.out.println("Multiplication result is "+(num1*num2));
                break;
            case '/':
                System.out.println("Division result is "+(num1/num2));
                break;
            case '%':
                System.out.println("Remainder result is "+(num1%num2));
                break;
            default:
                System.out.println("Invalid operator");

        }

        System.out.println("\n");
        System.out.println("Move to another exmaple");
        System.out.println("HTTP status code");


        // Switch case
        //Exmaple 4)(HTTP status code)

        int statusCode=500;
        sc.nextLine();
        // switch (10*10+100)// Another way to wright
        switch(statusCode){
            case 200:
                System.out.println("StatusCode is 200 then result is: Ok - Success");
                break;
            case 404:
                System.out.println("StatusCode is 404 then result is: Not Found");
                break;
            case 500:
                System.out.println("StatusCode is 500 then result is: Server Error");
                break;
            default:
                System.out.println("StatusCode is not found: unknow status code");
        }
    }
}

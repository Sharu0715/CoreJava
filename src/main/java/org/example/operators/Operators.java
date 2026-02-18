package org.example.operators;

import java.util.Scanner;

public class Operators {
    int a,b ;
    public static void main(String[] args) {

        //User input using scanner class
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your a value");
        int a= sc.nextInt();
        System.out.println("Enter your b value");
        int b=sc.nextInt();
//sc.next() read the input value or strored the value
        int c= a + b;
        int d= a - b;
        int e= a * b;
        int f= a / b;
        System.out.println("Enter your addtion "+c);
        System.out.println("Enter your sub "+d);
        System.out.println("Enter your mul "+e);
        System.out.println("Enter your div "+f);
        if(a>b){
            System.out.println("A is highst value");
        } else{
            System.out.println("B is highst value");
        }
        System.out.println(a>b && a >= b);
    }
}

package org.example.ExampleInheritance.singleInheritance;

import java.util.Scanner;

public class Inheritance2 extends  Inheritance {

    /* void deposit(double ammount){

    }*/
    void  deposit(){

        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        age=sc.nextInt();
        if(age>=18){
            //System.out.println("deposit");
            //deposit();// this method name is alerdy exits in parent method but you can c
            // crate this new for the chiled class this is called override the method
            // this the call this own
            // then you can call the paraent this method you can use super keyword
            super.deposit(100);
        }
        else{
            System.out.println("deposited not successful");
        }
        // deposit(200);// calling void deposit(double ammount) this method you can also call is
        // this.deposit(300);
    }


    void withdraw()
    {

    }

    public static void main(String[] args) {
        Inheritance2 obj=new Inheritance2();
        obj.balance=10000;
        obj.deposit();

    }

}

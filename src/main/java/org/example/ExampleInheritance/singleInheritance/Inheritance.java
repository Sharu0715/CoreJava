package org.example.ExampleInheritance.singleInheritance;

public class Inheritance {

    double balance;

    void deposit(double ammount) {
        if (ammount > 0) {
            balance += ammount;
            System.out.println("deposited Successful       :" + ammount);
            System.out.println("deposited Successful After :" + balance);
        }


    }
}

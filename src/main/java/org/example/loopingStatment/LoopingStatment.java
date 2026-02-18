package org.example.loopingStatment;

import java.util.Scanner;

public class LoopingStatment {

    int n;
    //int num;
    //int pin;

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        //System.out.println("Enter a number");
        //int n=sc.nextInt();
        System.out.println("****First Example*****");
        System.out.println("Print 2 to 50 table");
        //System.out.println("2 to 50 Table");
        System.out.println("\t");
        //Nested for loop
        //first for row(outter loop)
        //secound for coloum(inner loop)
        for (int i = 1; i <= 10; i++) {
            for (int j = 2; j <= 50; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
        System.out.println("\n");
        System.out.println("*****secound Example*****");
        System.out.println("number print 1 to 10");
        System.out.println(" The number is");
        for (int i = 1, j = 1; i <= 10; i++, j++) {
            System.out.print("\t" + j);
        }
        System.out.println("\n");
        System.out.println("*****Third Example*****");
        System.out.println(" My name ");

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("Sharayu \t");
            }
            System.out.println();
        }
        System.out.println("\n");
        System.out.println("*****Fourth Example*****");
        System.out.println(" Pattern ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
        System.out.println("*****Fifth Example*****");
        System.out.println(" Hello World ");
        // While loop
        //System.out.println("Enter a number number: ");
        Scanner sc2 = new Scanner(System.in);
        int num=2;
        while(num<5){
            System.out.println("Hello");
            num++;
        }

        System.out.println("\n");
        System.out.println("*****Sixth Example*****");
        System.out.println(" Positive Number Checke");
        while(true){
            System.out.print("Enter a number : ");
            int num2 = sc2.nextInt();
            if(num2<0){
                System.out.println("Enter  Positive number only ");
            }else{
                System.out.println("Your number is positive");
                break;
            }
        }


        // Do While

        System.out.println("\n");
        System.out.println("*****Seventh Example*****");
        System.out.println(" Print table 1 to 20 ");
        int i=1;
        do{
            //System.out.println("Sharu");


            int j= 2;
            do {
                System.out.print(i *j+"\t");
                j++;
            }
            while(j<=20);
            System.out.println();
            i++;
        }
        while (i<=10);
        System.out.println("\n");
        System.out.println("*****Eighth Example*****");
        System.out.println(" Checking correct Pin ");
        int userpin=1231;
        int attempts=0;
        outer:
        do{
            System.out.println("Enter your pin");
            do{
                int pin= sc.nextInt();
                if(pin==userpin){
                    System.out.println("Welcome");
                    break outer;
                }else{
                    attempts++;
                    System.out.println("Wrong pin Attempts left :"+ (3-attempts));


                    if(attempts == 3){
                        System.out.println("Account blocked");
                        break outer;
                    }
                    System.out.println("Enter your pin");
                }

            }while (true);
        } while (true);
    }
}

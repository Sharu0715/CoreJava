package org.example.AccessModifires.PublicModifire.game;

import java.util.Scanner;

public class Batsman {
    public int run;

   public void checkPerformance(){
       System.out.println("Enter Run");
       Scanner sc=new Scanner(System.in);
       int run=sc.nextInt();

        if(run==100){
            System.out.println("Century");
        }else if(run==50){
            System.out.println("HalfCentury");
        }else{
            System.out.println("Good Performance");
        }

    }
    public void run(){


        System.out.println("Welcome I am Batsman");
    }
}

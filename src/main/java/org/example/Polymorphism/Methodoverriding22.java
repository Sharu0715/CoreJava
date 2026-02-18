package org.example.Polymorphism;

import java.util.Scanner;

class Cricket{
    String name;
    int age;
    Cricket(String name, int age){
        this.name=name;
        this.age=age;
    }
    void play(){
        System.out.println("Playing Games");
        System.out.println("Name    : "+name);
        System.out.println("Age     : "+age);
    }
}
 class Batsmen extends Cricket {


     public Batsmen(String name, int age) {
         super(name, age);
     }

     // @Override // method do not wright overriden alwyas call the super method
         void play() {
         super.play();
         System.out.println("Playing Batsmen");
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Total Run");
         int totalRun = sc.nextInt();
         if(totalRun>=90){
             System.out.println("Best Performance");

         }else if(totalRun>=70){
             System.out.println("Good Performance");
         }else if(totalRun>=50){
             System.out.println("Ok Performance");
         }else {
             System.out.println("Low Performance");
         }


     }
 }
 class Baller extends Cricket {
     public Baller(String name, int age) {
         super(name, age);
     }

     @Override

    void play() {
        super.play();
        System.out.println("Playing Baller");
        System.out.println("Enter Total Wickets");
        Scanner sc = new Scanner(System.in);
        int totalWickets = sc.nextInt();
        if (totalWickets >= 8) {
            System.out.println("Best Performance");

        } else if (totalWickets >= 5) {
            System.out.println("Good Performance");
        } else if (totalWickets >= 2) {
            System.out.println("Ok Performance");
        } else {
            System.out.println("Low Performance");
        }

    }

    }

public class Methodoverriding22 {
    public static void main(String[] args) {
        Cricket c= new Batsmen("Dhoni",55);
        Cricket c1= new Baller("Bhuvneshwar Kumar",45);
        c.play();
        c1.play();

    }
}

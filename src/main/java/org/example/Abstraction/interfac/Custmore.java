package org.example.Abstraction.interfac;

import java.util.Scanner;

public interface Custmore {
    void Input();
    void output();

}

class Devolper1 implements Custmore {
      String name, email, mobile_No;
      @Override
      public void Input() {
        System.out.println("Enter the name of Customer");
        Scanner sc=new Scanner(System.in);
        this.name= sc.nextLine();
        System.out.println("Enter the Email");
         this.email=sc.nextLine();
        System.out.println("Enter the Mobile Number");
         this.mobile_No=sc.nextLine();
    }
    @Override
    public void output() {
        System.out.println("Name           :"+name);
        System.out.println("Email          :"+email);
        System.out.println("Mobile Number  :"+mobile_No);

    }
}
class main{
    public static void main(String[] args) {
        Custmore c=new Devolper1();
        c.Input();
        c.output();
    }
}

// you have to use interface because this the relationship between client and developer
// client is non-tech background they only give there requirements and developer fulfill these requirements using coding
// developer send only .exc file which only public interface Custmore {
//    void Input();
//    void output();
//
//they give only result not entire background code this is using of interfaces
//this the abstraction work using interfaces

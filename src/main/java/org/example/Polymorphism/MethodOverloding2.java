package org.example.Polymorphism;

import java.util.Scanner;

public class MethodOverloding2 {

    Scanner sc = new Scanner(System.in);
    //private String username;
   // private String password;

    void login(long mobileno, int otp) {
        int SystemOtp = 1231;

        if (SystemOtp == otp) {
            System.out.println(" Login Successful");

        } else {
            System.out.println(" Login Failed");
        }

    }
    boolean login(String username, String password){
        String Systemusername = "Sharu07";
        String Systempassword = "Sh#07";

        if (username.equals(Systemusername) && password.equals(Systempassword)) {
            System.out.println(" Login Successful");
            return true;

        } else {
            System.out.println(" Login Failed");
            return false;
        }

    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        MethodOverloding2 obj = new MethodOverloding2();
        System.out.println("Choose Login method");
        System.out.println("1. MobileNo + Otp");
        System.out.println("2. Username + Password");

        int choice = sc.nextInt();
        sc.nextLine();
        if(choice==1){
            System.out.println("Enter your mobile no");
            long mobileno = sc.nextLong();
            System.out.println("Enter your otp");
            int otp = sc.nextInt();
            obj.login(mobileno, otp);
        } else if(choice==2){
            System.out.println("Enter your username");
            String username = sc.nextLine();
            System.out.println("Enter your password");
            String password = sc.nextLine();
            obj.login(username,password);
        }else{
            System.out.println("Wrong choice");
        }
        sc.close();

    }
}
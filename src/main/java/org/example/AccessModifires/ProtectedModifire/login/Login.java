package org.example.AccessModifires.ProtectedModifire.login;

import java.util.Scanner;

public class Login {
    protected String username;
    protected String password;

       protected  void login(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter username:");
            String username=sc.nextLine();
            System.out.println("Enter password:");
            String password=sc.nextLine();
            String systemusername="sharayu";
            String systempassword="sharayu07";
            if(systemusername.equals(username) && password.equals(password)){
            System.out.println("Successfully login");
            }else{
            System.out.println("Invalid username or password");
        }

    }


}
// protected access modifires variable, method and constrctor but not a class
//protected access modifires access within a package only
// you can access a protected variables, method and constrctor you can put import and chiled class
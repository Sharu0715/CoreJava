package org.example.AccessModifires.ProtectedModifire.register;

import org.example.AccessModifires.ProtectedModifire.login.Login;

public class Register extends Login {
    public static void main(String[] args) {
       // Login login = new Login();
        //login.login();
        Register r =new Register();
        r.login();
    }
}
// this is the another class with differnt package and access Login.java class access
//you can mention  import org.example.AccessModifires.ProtectedModifire.login.Login; package first one
// and then  a put a currunt class with chiled and you can access modifire this class shoud be a parent
// class public class Register extends Login like that
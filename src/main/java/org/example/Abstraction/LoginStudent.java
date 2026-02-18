package org.example.Abstraction;

import java.util.Scanner;

public class LoginStudent extends Student {


void loginStudent(int age)
{

    if(age==18){

        System.out.println("Eligible to Vote");
    }

}

// override the method of super parent abstract class
@Override
void teach() {
    System.out.println("Teacher is teaching");
}

//override the method of parent abstract class
@Override
void test(){
    System.out.println("testing");
}


LoginStudent(){
 // call the all parent abstract class constructor in super method;
    super("sharayu",25);

    System.out.println("LoginStudent constructor");

}
public  static void main(String[] args){
    LoginStudent obj=new LoginStudent();

    //calling the all methods
    obj.study();
    obj.teach();
    obj.test();
    obj.loginStudent(18);
    System.out.println();
}
}
//in chiled class inheritance to the parent abstract  class and child class not need to mention as abstract
//parent abstarct class in abstract method there are no body so you want to call this method you create a child class and call them
//This call as an abstraction because in parent class they show only methos name but in entire wotk or code they do not show they alswyas hidden in parent abstract class
// and  child class this all method are represent their work represnt all code be the visible and they call
package org.example.AccessModifires.Default;

public class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
 void method(){
        System.out.println("Name : "+this.name);
        System.out.println("Age  : "+this.age);
 }


}
// defult means no any datatype are metioned in any veriable,
// any method , constructor etc
//defult constructor only call within a same package
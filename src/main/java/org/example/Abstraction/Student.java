package org.example.Abstraction;

public abstract  class Student extends Teacher {
    int age;

    static void study() {
        System.out.println("Student is studying");
    }

     abstract  void test();

    abstract void loginStudent(int age);

    Student(String name, int age) {
        System.out.println("Student name is " + name);
        System.out.println("Student age is " + age);

    }

}
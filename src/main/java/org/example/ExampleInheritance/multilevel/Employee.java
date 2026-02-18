package org.example.ExampleInheritance.multilevel;

public class Employee {
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void coompanyDetail(){
        System.out.println("Name      : "+name);
        System.out.println("Age       : "+age);
        System.out.println("Salary    : "+salary);
    }

}

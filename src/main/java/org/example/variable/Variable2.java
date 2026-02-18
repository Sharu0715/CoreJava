package org.example.variable;

public class Variable2 {
    //Instance Variable
    String name;
    int age;
    double salary;


    // instance method (method without static keyword called instance method)
    void reset(){
        //qus- can we access instance variable in instance method = YES
        //Qus- can we access static variable in instance method = YES
        System.out.println(name);
        System.out.println(CompanyName);
    }

    //static method
    static void getCount(){
        // instance variable can access static method ? = NO but Indirctly(Using Object) = YES
        // can we access static variable in sttaic method = YES
        Variable2 v = new Variable2();
        System.out.println(v.name);
        System.out.println(CompanyID);
    }

    // Another instance method
    void reset1(){
        //Qus- can we access instance method in another instance method = YES
        reset();
        //Qus - can we call static method in  another instance method = YES
        getCount();

    }

    // Another static method
    static void getCount1(){
        //Qus- can we call instance method in another sttaic method = NO but Indirctly yes creating a object
        Variable2 v3= new Variable2();
        v3.reset();
        //Qus - can we access static method in another static method = YES
        getCount();
    }


    // Static Variable
    static String CompanyName;
    static int CompanyID;

    void show(){
        System.out.println("Comapny Name : "+CompanyName);
        System.out.println("Company ID   : "+CompanyID);
        System.out.println("Name         : "+name);
        System.out.println("Age          : "+age);
        System.out.println("Salary       : "+salary);
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        Variable2.CompanyName="ABC IT SOLUTION";
        Variable2.CompanyID=278;
        Variable2 v = new Variable2();
        v.name="Dhoni";
        v.age=40;
        v.salary=100;
        Variable2 v2 = new Variable2();
        v2.name="Virat";
        v2.age=35;
        v2.salary=200;
        v2.show();
        v.show();
        v.getCount();
        v.reset();
        v.reset1();
        v.getCount1();
    }
}

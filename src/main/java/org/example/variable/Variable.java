package org.example.variable;

public class Variable {
    //instance variable ( global variable )
    // Instance variable can be access object refernce
    int age =30;
    int Weight ;//(this is only decalre not nallise this is my instance varibale that means java compliee give bydefalt 0 value)
    int hight=900;
    String name="Sharayu kamble";




    // static variable
    //static variable are realated to class
    //static variable value is common for all object
    // Static variable we can access directly using class name
    static String  ComapnyName="ABC IT SOLUTION";
    static String dicripttion="This the good company";
    static int price=8900;
    static int ComapnyID;
    //private boolean sallry;


    public static void main(String[] args){

        // //(This is my all local variable)
        //inside variable
        // Decalration only
        // int sallry=200;
        int mysallry;
        // Initialization

        mysallry=566;

        //(This is deaclare+intialise)
        int x=10, y=90, p=60;
        String King="Dhoni";

        //(calling to all local variable )
        System.out.println("x=" +x +",y=" +y+",p="+p);
        System.out.println( +x+y+p);
        System.out.println(King);
        System.out.println("This is my  Sallary: "+mysallry);
        // System.out.println("Total Sllary: "+sallry);


        //(Create object for instance variables and call )
        Variable a=new Variable();
        System.out.println("Age is: " +a.age);
        System.out.println("Name is: " +a.name);
        System.out.println("Weight is: "+a.Weight);
        System.out.println("Hight is: " + a.hight +"cm");
        Variable b=new Variable();
        b.age=40;
        b.name="Dhoni";
        b.Weight=100;
        b.hight=100;
        System.out.println("Age is: " +b.age);
        System.out.println("Name is: " +b.name);
        System.out.println("Weight is: "+b.Weight);
        System.out.println("Hight is: " + b.hight);


        //(calling static variable);
        Variable.ComapnyID=100;
        System.out.println("Company Name: " +ComapnyName);
        System.out.println("Company ID: "+ComapnyID);
        System.out.println("Dicripation: "+dicripttion);
        System.out.println("Total Price: "+ price);


        //(calling static varibale using obiject)
        System.out.println(a.ComapnyName);
        System.out.println(a.dicripttion);


        //(calling local varibale using objects this is not posible)

        System.out.println(a.price);
        //System.out.println(a.sallry);
        System.out.print(p);


    }
}

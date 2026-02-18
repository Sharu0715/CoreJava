package org.example.constructors.constructorChaining;

public class ConstructorChaining {
    // Nonparamarize constrctor
   /* ConstructorChaining(){
        System.out.println("ConstructorChaining");
    }

    //Paramarize constrctor

    ConstructorChaining(int a){
        System.out.println("Hello Java");
    }
    ConstructorChaining(int a,int b){
        System.out.println("Addition: "+(a+b));

    }*/


    ConstructorChaining(){
        this(10);//call to constructor which taking one int type parameter
        //that means this constructor called ConstructorChaining(int a)

        System.out.println("ConstructorChaining");

    }

    //Paramarize constrctor

    ConstructorChaining(int a){
        this(10,20);//call to constructor which taking two int type parameter
        //that means this constructor called ConstructorChaining(int a,int b)
        System.out.println("Hello Java");

    }
    ConstructorChaining(int a,int b){
        System.out.println("Addition: "+(a+b));

    }

    public static void main(String[] args){
        ConstructorChaining c=new ConstructorChaining();//First Counstrctor
        /*ConstructorChaining c2=new ConstructorChaining(2);//Secound Counstrctor
        ConstructorChaining c3=new ConstructorChaining(1,2);//Tird Counstrctor*/
        // using only one object to calling three constructor
        //Constructor chaining menas constructor calling another constrctor
    }
}

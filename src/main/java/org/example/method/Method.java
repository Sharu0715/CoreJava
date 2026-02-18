package org.example.method;

public class Method {
    int id;
    String name;
    int mark;
    int age;
    int a,b;

    void display(){
        System.out.println("Id is: "+id);
        System.out.println("Name is: "+name);
        System.out.println("Mark is: "+mark);
        System.out.println ("Age is: "+age);
    }
    /*int add(){
        int sum=a+b;
        return sum;

    }*/
    Method(int id, String name, int mark, int age){

        this.id=id;
        this.name=name;
        this.mark=mark;
        this.age=age;
    }
    /* Method(int a,int b){
           this.a=a;
           this.b=b;


     }*/
    public static void main(String[] args){
        Method d=new Method(2,"Sharu",10,25);
        Method d2=new Method(3,"Priyanka",15,26);
        // Method d3=new Method(12,67);
        System.out.println("First Student");
        d.display();
        System.out.println("\n");
        System.out.println("Second Student");
        d2.display();
        //System.out.println("\n");
        //System.out.println("Sum is number: "+d3.add());
        //d3.add();

    }
}

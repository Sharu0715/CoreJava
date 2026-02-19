package org.example.Abstraction.interfac;

public interface  Test{
    String name="Sharayu";
    void study();
    static  void rest()
    {
        System.out.println("test");
    }
}
//This the another class Implements the interface class
class exam implements Test{
    public void study()
    {
        System.out.println("study");
    }
    public static void main(String[] args){
        //create interface class using  reference and child class use object creation
        Test t=new exam();
        t.study();
        // the variable is static or final do not change it and public that means access anywhere
        System.out.println(t.name);


    }
}
// the variable alwyas public+static+final

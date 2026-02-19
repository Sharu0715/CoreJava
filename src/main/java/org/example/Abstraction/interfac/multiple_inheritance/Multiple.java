package org.example.Abstraction.interfac.multiple_inheritance;

interface A{
    int add(int a,int b);

}
interface B{
    int sub(int a,int b);
}
public class Multiple implements A,B {


    @Override
    public int add(int a,int b) {
         return a+b;
    }
    @Override
    public int sub(int a,int b) {
        return a-b;
    }
    void display(){
        System.out.println("Addition      :"+add(10,90));
        System.out.println("Subtraction   :"+sub(25,67));
    }
}
class Main{
    public static void main(String[] args) {
        Multiple a1=new Multiple();
       // Multiple b1=new Multiple();
        a1.display();
    }
}
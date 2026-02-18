package org.example.Polymorphism;

public class MethodOverloding {
    void add(){
        int a=7;
        int b=5;
        int c=a+b;
        System.out.println(a+b);
    }

    void add(int a,int b){
        int c=a+b;
        System.out.println(a+b);
    }
    void add(int a,double b){
        System.out.println(a+b);
    }



    public static void main(String[] args) {
        MethodOverloding obj=new MethodOverloding();
        obj.add(2,3.5);
        obj.add();
        obj.add(1,2);

    }

}

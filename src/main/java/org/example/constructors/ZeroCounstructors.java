package org.example.constructors;


public class ZeroCounstructors {
    //(instance objects , static object)
    int money=7;
    int price;
    static int count=0;
    boolean speed=true;
    boolean info;
    int p;
    void show(boolean info){

        info=true;
        //int p;
        System.out.println(info);
    }



    //(Intialize ZeroCounstrctor)
    ZeroCounstructors(){
        System.out.println("ZeroCounstructors");

        //info=true;
        price=80000;
    }

    public static void main(String[] args) {
        //System.out.println("ZeroCounstructors");

        ZeroCounstructors z=new ZeroCounstructors();
        z.show(true);
        z.p=89;
        System.out.println(z.money);
        System.out.println("My price: " +z.price);
        //System.out.println(count);
        System.out.println(z.count);
        System.out.println(z.speed);
        System.out.println("p value: "+z.p);




    }
}

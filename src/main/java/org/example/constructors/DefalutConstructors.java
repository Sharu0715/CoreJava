package org.example.constructors;

public class DefalutConstructors {
    private boolean age;
    private boolean call;
    int roll;
    double money;
    boolean salary;
    char gender;
    String familyname;
    static String name="Sharayu";


    public static void main(String[] args) {
        int pg = 9;
        System.out.println(pg);
        //DefalutConstructors c=null;

        //(Inalitize the constructor )
        DefalutConstructors c = new DefalutConstructors();
        c.roll=7;
        System.out.println("my roll: "+c.roll);
        System.out.println("my money: "+c.money);
        System.out.println("my name: "+c.name);




//(Class_name variabel_name = new_keyword constructor_name)
        DefalutConstructors c1 = new DefalutConstructors();
        System.out.println("my salary: "+c1.salary);
        c.gender = 'F';
        System.out.println("my gender: " +c.gender);
        System.out.println("my roll: "+c1.roll);
        DefalutConstructors c2 = new DefalutConstructors();
        System.out.println("my familyname: "+c2.familyname);
        System.out.println("my name: "+c2.name);
        System.out.println("my roll: "+c1.roll);
    }
}
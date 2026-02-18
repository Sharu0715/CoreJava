package org.example.AccessModifires;

public class AcessModifire {
    public String name="Everyone can see me";
    private String Myname="Hello Myself";
    protected  String Fmaily="Only my family memeber can accsee me";


    public static void main(String[] args) {
        AcessModifire am=new AcessModifire();
        System.out.println(am.name);
        System.out.println(am.Myname);
        System.out.println(am.Fmaily);
    }
}

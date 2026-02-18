package org.example.ExampleInheritance.multilevel;

public class Teamlead extends Devloper{
    public Teamlead(String name, int age, double salary, String tool) {
        super(name, age, salary, tool);
    }

    void lead(){
        System.out.println("Teamlead Lead");
    }
    public static void main(String[] args) {
        Teamlead teamlead = new Teamlead("sharayu",25,75000.00,"Devloper Tool");
        teamlead.coompanyDetail();
        teamlead.roll();
        teamlead.lead();


    }
}

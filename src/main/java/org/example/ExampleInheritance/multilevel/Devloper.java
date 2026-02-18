package org.example.ExampleInheritance.multilevel;

public class Devloper extends Employee {
    String tool;

    public Devloper(String name, int age, double salary, String tool) {
        super(name, age, salary);
        this.tool = tool;
    }

    void roll(){
        System.out.println("ToolName  : " + tool);
    }
}

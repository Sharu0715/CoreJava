package org.example.ExampleInheritance;

public class Student {
    String name;
    int id;
    int age;
    String email;
    String Birthday;
    double mark;

    public Student(String name, int id, int age, String email, String birthday, double mark) {
        //super();//but this class also parent so who is calling super() == object class(object class is all parent class of java)
        this.name = name;
        this.id = id;
        this.age = age;
        this.email = email;
        Birthday = birthday;
        this.mark = mark;

    }
//repsent the object into string
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", Birthday='" + Birthday + '\'' +
                ", mark=" + mark +
                '}';
    }

    void study(){
        System.out.println("Student is studying");
    }
    void result(){
        if(mark>= 90){
            System.out.println("THe grade is O");
            System.out.println("Result is Pass");

        }else if(mark>=80){
            System.out.println("THE grade is A");
            System.out.println("Result is Pass");
        }else if(mark>=70){
            System.out.println("THE grade is B");
            System.out.println("Result is Pass");
        }else if(mark>=60){
            System.out.println("THE grade is C");
            System.out.println("Result is Pass");

        }else if(mark>=50){
            System.out.println("THE grade is D");
            System.out.println("Result is Pass");
        }else{
            System.out.println("THE grade is F+");
            System.out.println("Result is Fail");


        }
    }
}

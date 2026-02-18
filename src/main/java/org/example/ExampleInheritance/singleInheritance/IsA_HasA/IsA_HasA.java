package org.example.ExampleInheritance.singleInheritance.IsA_HasA;

public class IsA_HasA {
    int id;
    String name;
    String email;
    IsA_HasA2 course;
    public IsA_HasA(int id, String name, String email,IsA_HasA2 cours) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.course = cours;
    }
    void display(){
        System.out.println("Id       :"+id);
        System.out.println("Name     :"+name);
        System.out.println("Email    :"+email);
        //System.out.println("Course: "+course);
        course.DisplayData();
    }

    public static void main(String[] args){
        IsA_HasA2 aa= new IsA_HasA2("JavaFullStack","2000INR","3 Hours");
        IsA_HasA a=new IsA_HasA(1,"Sharayu","sharayu07@gmail.com",aa);
        a.display();


    }
}

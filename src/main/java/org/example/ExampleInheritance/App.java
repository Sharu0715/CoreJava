package org.example.ExampleInheritance;

public class App {
    public static void main(String[] args) {
        CollegeStudent collegeStudent=new CollegeStudent("Sharayu",7,25,"sharayu07@gmail.com","7 April 2001",90,"CS IT","2122000566",123,"KITMH09",9.1);
        System.out.println(collegeStudent);
        collegeStudent.result();
        collegeStudent.placement();
    }
}

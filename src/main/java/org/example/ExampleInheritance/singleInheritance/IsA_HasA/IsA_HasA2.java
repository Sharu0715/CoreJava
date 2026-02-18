package org.example.ExampleInheritance.singleInheritance.IsA_HasA;

public class IsA_HasA2 {
    String CourseName;
    String CoursePrice;
    String CourseDuration;
    public  IsA_HasA2(String CourseName,String CoursePrice,String CourseDuration){
        super();
        this.CourseName=CourseName;
        this.CoursePrice=CoursePrice;
        this.CourseDuration=CourseDuration;

    }

    /*@Override
    public String toString() {
        return "IsA_HasA2{" +
                "CourseName='" + CourseName + '\'' +
                ", CoursePrice='" + CoursePrice + '\'' +
                ", CourseDuration='" + CourseDuration + '\'' +
                '}';*/


    void DisplayData(){
        System.out.println("Name     :"+CourseName);
        System.out.println("Price    :"+CoursePrice);
        System.out.println("Duration :"+CourseDuration);
    }
}

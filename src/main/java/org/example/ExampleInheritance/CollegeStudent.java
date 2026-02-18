package org.example.ExampleInheritance;

public class CollegeStudent extends Student{
   static  String collegeName;
   String courseName;
   String PRNNO;
   int StudentID;
   String CourseID;
   double CGPA;

    public CollegeStudent(String name, int id, int age, String email, String birthday, double mark, String courseName, String PRNNO, int studentID, String courseID, double CGPA) {
        super(name, id, age, email, birthday, mark);
        this.courseName = courseName;
        this.PRNNO = PRNNO;
        StudentID = studentID;
        CourseID = courseID;
        this.CGPA = CGPA;
    }

    @Override
    public String toString() {
        return "CollegeStudent{" +
                "CourseID='" + CourseID + '\'' +
                ", courseName='" + courseName + '\'' +
                ", PRNNO='" + PRNNO + '\'' +
                ", StudentID=" + StudentID +
                ", CGPA=" + CGPA +
                '}';
    }

    void placement(){
       if(CGPA>9){
           System.out.println("Placement chance is very high");

       } else if (CGPA>8) {
           System.out.println("Placement chance is  high");

       }else if (CGPA>7) {
           System.out.println("Placement chance is modarte");
       }else if (CGPA>6) {
           System.out.println("TPlacement chance is less");

       }else if (CGPA>5) {
           System.out.println("Placment chance is very less");
       }

   }
    
}

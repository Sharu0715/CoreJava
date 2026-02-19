import java.util.Scanner;

public class Class {
    //String A;

    public static void main(String[] args) {

      int a, b, temp;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a");
      a = sc.nextInt();
      System.out.println("Enter b");
      b = sc.nextInt();
      System.out.println("Before Swapping");
      System.out.println("Enter a : "+a);
      System.out.println("Enter b : "+b);
      temp=a;
      a=a+b;
      b=a-b;
      a=a-b;
      System.out.println("After Swapping");
      System.out.println("Enter a  : "+a);
      System.out.println("Enter b  : "+b);





    }
}
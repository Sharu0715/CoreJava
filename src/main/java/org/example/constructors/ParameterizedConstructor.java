package org.example.constructors;

public class ParameterizedConstructor {
    int hight;
    String name;
    int roll_no;
    static int count=0;
    int speed;
    int hight1;
    String familyname;
    public ParameterizedConstructor(){
        hight1=100;
        count=9;
        count++;
    }

    //(Setter Method not Using any constructor)
    void setName(String name){
        this.familyname=familyname;
    }


    //(Static method this cannot be use in sattaic context)
    static  void  setNumber(int count){
        count=count;

    }

    public ParameterizedConstructor(String name, int roll_no,  int speed, int myhight)
    {
        //(you can remove  this keyword so atomatticalu the value is null)
        this();//(Calling zero counstrctor using this(); and rule is must be  first line in constructor)
        name = name;//(you not use this keyword instance variable remains null)
        this.roll_no = roll_no;
        this.count = count;
        hight =myhight;//(without this you can inntialised but only spical case but this is not a good way bad readability//)
        this.speed = speed;
    }

    public static void main(String[] args) {
        //(local variable with same as instance variable )
        String name;
        name="sharu";
        ParameterizedConstructor p = new ParameterizedConstructor("Sharayu", 7,  99,200);
        // ParameterizedConstructor p1 = new ParameterizedConstructor();
        System.out.println("My name is: " + p.name);
        System.out.println("My name is: " + name);
        System.out.println("My roll number is: " + p.roll_no);
        System.out.println("My hight is: " + p.hight1);
        System.out.println("My hight 2 is: " + p.hight);
        System.out.println("My  speed is: " + p.speed);

        //)(And    directly call setter methos  using object)
        System.out.println("My  speed is: " + p.familyname);



        System.out.println("My  count is: " + count );
    }
}



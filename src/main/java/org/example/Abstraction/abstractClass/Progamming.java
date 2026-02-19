package org.example.Abstraction.abstractClass;

public abstract class Progamming {
    abstract public void Developer();
    abstract public void rank();
}
class Html extends Progamming {
    @Override
    public void Developer() {
        System.out.println(" HTML Developer");

    }
    public void rank(){
        System.out.println(" HTML Rank is 3rd");}

}

class Java extends Progamming {
    @Override
    public void Developer() {
        System.out.println(" Java Developer");

    }
    public void rank(){
        System.out.println(" Java Rank is 1st");
    }
}
class main{
    public static void main(String[] args) {
        Progamming prog = new Html();
        prog.Developer();
        prog.rank();
        Progamming prog2 = new Java();
        prog2.Developer();
        prog2.rank();

        // another way to callling
       /* Java d = new Java();
        d.Developer();
        d.rank();
        Html h = new Html();
        h.Developer();
        h.rank();*/
    }
}

package org.example.AccessModifires.PublicModifire.game;

public class Cricket {
    //String name;
    public void game(){
        System.out.println("Welcome to Cricket");
    }
    public static void main(String[] args) {
        Cricket cricket = new Cricket();
        cricket.game();
        Batsman batsman = new Batsman();
        batsman.run();
        batsman.checkPerformance();
        Baller baller = new Baller();
        baller.wicket();

        
    }
}
// you can see that cricket, baller, batsman are thee differnt classes
// but same  package
// there is all method is public and assess any wher so in cricket class i can access both baller and batsman
// creating a object and using this Batsman batsman = new Batsman();
//        Baller baller = new Baller();
//        cricket.game();
//        batsman.run();
//        baller.wicket();
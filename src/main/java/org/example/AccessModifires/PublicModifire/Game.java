package org.example.AccessModifires.PublicModifire;

import org.example.AccessModifires.PublicModifire.game.Baller;
import org.example.AccessModifires.PublicModifire.game.Batsman;
import org.example.AccessModifires.PublicModifire.game.Cricket;

public class Game {
    void mygame(){
        System.out.println("I am game");
    }
    public static void main(String[] args) {
        Game game = new Game();
        game.mygame();
        Cricket cricket = new Cricket();
        cricket.game();
        Batsman batsman = new Batsman();
        batsman.run();
        Baller baller = new Baller();
        baller.wicket();

    }
}
// in this method i can see the all method is public so I can access anywhere in within ths package but my Game class is another package
// but method is public then you want to access the  public method in very with differnt package using import this package on your code and access it
// I can import import org.example.AccessModifires.PublicModifire.game.Baller;
//import org.example.AccessModifires.PublicModifire.game.Batsman;
//import org.example.AccessModifires.PublicModifire.game.Cricket;
// like that
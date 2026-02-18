package org.example.Polymorphism;
class Animal {
       String color;
        Animal(String color) {
        this.color = color;
    }

    void quality(){
            System.out.println("Animal Class");

    }

}

class Cat extends Animal{
    String voice;

    public Cat(String color, String voice) {
        super(color);
        this.voice = voice;
    }
    @Override
       void quality(){
        super.quality();
        System.out.println("Colore : "+color);
        System.out.println("Voice  : "+voice);
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Animal animal = new Cat("Gray","Mow-Mow");
        animal.quality();

    }
}

package org.example.Abstraction.interfac.whyabstractMethods;

// Interface Method abstract
public interface Client {

    void webDesign();
    void webDevelopment();
}
abstract class developer1 implements Client {
    @Override
    public void webDesign() {
        System.out.println("WebDesign-TechStack      : REACT.JS, HTML, CSS, FIGMA, PHOTOSHOP. ");

    }


}
class developer2 extends developer1 {

    @Override
    public void webDevelopment() {
        System.out.println("WebDevelopment-TechStack : JAVA, SPRING BOOT, RESTAPI, POSTMAN, POSTGRESQL.");
    }
}

class Main{
    public static void main(String[] args){
        Client c=new developer2();
        c.webDesign();
        c.webDevelopment();
    }
}

// why the method become an abstract
//  class developer1 implements Client  This method is abstract because they not fulfill
// the requirement of the client they only override one method but actually two methods are exits
// so that's why this method become abstract and developer2 fulfil the requirement,
//but they not need to complete all entire work because already developer1 complete the 50% work they only extend the method
// and work this is the seniro of this code

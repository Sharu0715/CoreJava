package org.example.Abstraction.interfac.excendsClass;

public class Main_file implements Client3 {
    @Override
    public void webDesign() {
        System.out.println("webDesign");
    }
    @Override
    public void webDevelop() {
        System.out.println("webDevelop");
    }
    @Override
    public void handleAPI() {
        System.out.println("handleAPI");
    }
    @Override
    public void handleDatabse() {
        System.out.println("handleDatabse");
    }
    public static void main(String[] args) {
        Client3 c=new Main_file();
        c.webDesign();
        c.webDevelop();
        c.handleAPI();
        c.handleDatabse();

    }

}

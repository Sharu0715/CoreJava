package org.example.AccessModifires.PrivateModifire;

public class Login {

    private String username;
    private String password;
    private Login(String username, String password) {
        this.username = username;
        this.password = password;

    }
    public static void main(String[] args) {
        Login login = new Login("admin", "admin");
        System.out.println(login.username);
        System.out.println(login.password);
    }

}
// private access modifire acccess only within this class only

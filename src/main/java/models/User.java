package models;

public class User {
    String mail;
    String pass;
    public User(String mail, String pass){
        mail = this.mail;
        pass = this.pass;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}

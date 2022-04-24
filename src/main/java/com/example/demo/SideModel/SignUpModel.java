package com.example.demo.SideModel;



public class SignUpModel {
    private String User;
    private String Pass;
    String Email;
    public SignUpModel(String user, String pass, String email) {
        User = user;
        Pass = pass;
        Email = email;
    }
    public SignUpModel(){}
    public String getUser() {
        return User;
    }
    public void setUser(String user) {
        User = user;
    }
    public String getPass() {
        return Pass;
    }
    public void setPass(String pass) {
        Pass = pass;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    
    
}

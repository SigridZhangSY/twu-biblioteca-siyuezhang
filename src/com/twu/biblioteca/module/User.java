package com.twu.biblioteca.module;

public class User {
    private String id;
    private String pass;

    private String name;
    private String email;
    private String phone;

    public User(String id, String pass, String name, String email, String phone) {
        this.id = id;
        this.pass = pass;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public User(String id, String pass) {
        this.id = id;
        this.pass = pass;
    }


    public String getId() {
        return id;
    }

    public String getPass() {
        return pass;
    }

    public Boolean checkPass(String pass){
        if (this.pass == pass)
            return true;
        else
            return false;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}

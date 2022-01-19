package fr.iutv.springboot.mvc.exemple_01.model;

public class User {
    public User(String name, String login){
        this.name = name;
      this.login = login;
    }
    public String getLogin(){
      return this.login;
    }
    String login;

    public String getName(){
        return this.name;
    }
    String name;
  }
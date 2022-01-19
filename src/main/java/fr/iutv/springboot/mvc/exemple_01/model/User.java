package fr.iutv.springboot.mvc.exemple_01.model;

public class User {
    public User(String login){
      this.login = login;
    }
    public String getLogin(){
      return this.login;
    }
    String login;
  }
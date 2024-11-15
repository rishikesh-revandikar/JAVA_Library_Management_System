package com.rishikesh.library;

import java.util.ArrayList;

public class Database {

    ArrayList<User> users = new ArrayList<>();
    ArrayList<String> usernames = new ArrayList<>();

    public void addUser(User s){
        users.add(s);
        usernames.add(s.getName());
    }

    public int login(String phoneNumber, String email){
       for(User s: users){
           if(s.getPhoneNumber().matches(phoneNumber) && s.getEmail().matches(email)){
               return users.indexOf(s);
           }
       }
         return -1;
    }

    public User getUser(int n){
        return users.get(n);
    }
}

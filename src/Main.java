import com.rishikesh.library.Admin;
import com.rishikesh.library.Database;
import com.rishikesh.library.User;

import java.util.Scanner;

public class Main {
    static Scanner sc;
    static Database database;

    public static void main(String[] args) {

        System.out.println("""
                Welcome to Library Management System
                0. Exit
                1. Login
                2. New user""");

        sc = new Scanner(System.in);
        database = new Database();

        int n;

        do{
            n = sc.nextInt();
            switch(n){
                case 0:
                    break;
                case 1:
                    login();
                    break;
                case 2:
                    newUser();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while (n==1 || n==2);

    }

    public static void login(){
        System.out.println("Enter phone number :: ");
        String phoneNumber = sc.next();
        System.out.println("Enter email :: ");
        String email = sc.next();
        int idx = database.login(phoneNumber, email);

        if(idx!=-1){
            User user = database.getUser(idx);
            System.out.println("Welcome "+user.getName());
        }else{
            System.out.println("Invalid credentials");
            return;
        }
    }

    public static void newUser(){
        System.out.println("Enter name :: ");
        String name = sc.next();
        System.out.println("Enter phone number :: ");
        String phoneNumber = sc.next();
        System.out.println("Enter email :: ");
        String email = sc.next();
        System.out.println("1. Admin\n2. Normal User");
        int n2 = sc.nextInt();

        if(n2==1){
            User admin = new Admin(name, email, phoneNumber);
            database.addUser(admin);
        }else{
            User normalUser = new User(name, email, phoneNumber);
            database.addUser(normalUser);
        }
        System.out.println("User added successfully");
    }


}
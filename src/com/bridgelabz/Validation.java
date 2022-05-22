package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validation {
     public static void userFirstName() {

        String firstNamePattern = "[A-Z]{1}[a-z]{2,}";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name:");
        String firstName = scanner.next();

        Pattern pattern = Pattern.compile(firstNamePattern);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();

        if(result == true){
            userLastName();
        }

        else
            System.out.println("First Name is Invalid");
    }

    public static void userLastName() {

        String lastNamePattern = "[A-Z]{1}[a-z]{2,}";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Last Name:");
        String lastName = scanner.next();

        Pattern pattern1 = Pattern.compile(lastNamePattern);
        Matcher matcher1 = pattern1.matcher(lastName);
        boolean result1 = matcher1.matches();

        if(result1 == true)
            userEmail();
        else
            System.out.println("Last Name is Invalid");
    }
    public static void userEmail(){
        String emailPattern= "[a-zA-Z0-9.+-]+[0-9a-zA-Z]*@[a-z0-9]+[.][a-z]{2,4}[.a-z]*";
        System.out.println("Enter your Email:");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.next();

        Pattern pattern2=Pattern.compile(emailPattern);
        Matcher matcher2=pattern2.matcher(email);
        boolean result2=matcher2.matches();

        if(result2== true){
            System.out.println("Email is valid");
        }else{
            System.out.println("Email is not valid");
        }

    }




    public static void main(String[] args) {
        System.out.println("Welcome to User Registration program");
        userFirstName();

    }
}



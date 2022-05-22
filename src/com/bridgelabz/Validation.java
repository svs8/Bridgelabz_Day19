package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validation {
//     public static void userFirstName() {
//
//        String firstNamePattern = "[A-Z]{1}[a-z]{2,}";
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter First Name:");
//        String firstName = scanner.next();
//
//        Pattern pattern = Pattern.compile(firstNamePattern);
//        Matcher matcher = pattern.matcher(firstName);
//        boolean result = matcher.matches();
//
//        if(result == true){
//            userLastName();
//        }
//
//        else
//            System.out.println("First Name is Invalid");
//    }
//
//    public static void userLastName() {
//
//        String lastNamePattern = "[A-Z]{1}[a-z]{2,}";
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Last Name:");
//        String lastName = scanner.next();
//
//        Pattern pattern1 = Pattern.compile(lastNamePattern);
//        Matcher matcher1 = pattern1.matcher(lastName);
//        boolean result1 = matcher1.matches();
//
//        if(result1 == true)
//            userEmail();
//        else
//            System.out.println("Last Name is Invalid");
//    }
//    public static void userEmail(){
//        String emailPattern= "[a-zA-Z0-9.+-]+[0-9a-zA-Z]*@[a-z0-9]+[.][a-z]{2,4}[.a-z]*";
//        System.out.println("Enter your Email:");
//        Scanner scanner = new Scanner(System.in);
//        String email = scanner.next();
//
//        Pattern pattern2=Pattern.compile(emailPattern);
//        Matcher matcher2=pattern2.matcher(email);
//        boolean result2=matcher2.matches();
//
//        if(result2== true){
//            mobileNumberValidation();
//        }else{
//            System.out.println("Email is not valid");
//        }
//
//    }
//
//    public static void mobileNumberValidation(){
//        Scanner scanner = new Scanner(System.in);
//         String MobileNumberPattern="(91-)?[0-9]{10}";
//        System.out.println("Enter the phone number");
//        String phoneNumber=scanner.next();
//
//        Pattern pattern3=Pattern.compile(MobileNumberPattern);
//        Matcher matcher3=pattern3.matcher(phoneNumber);
//        Boolean result3=matcher3.matches();
//
//        if(result3==true){
//           passwordValidation1();
//        }else{
//            System.out.println("Mobile number is invalid");
//        }
//
//    }
//
//    public static void passwordValidation1(){
//        Scanner scanner = new Scanner(System.in);
//        String PasswordPattern1="[a-zA-Z0-9~!@#$]{8,}";
//        System.out.println("Enter the Password to check Rule1");
//        String passWord1=scanner.next();
//
//        Pattern pattern4=Pattern.compile(PasswordPattern1);
//        Matcher matcher4=pattern4.matcher(passWord1);
//        Boolean result4=matcher4.matches();
//
//        if(result4==true){
//            passwordValidation2();
//        }else{
//            System.out.println("Password is invalid,please enter minimum 8 character");
//        }
//
//    }
//
//    public static void passwordValidation2(){
//        Scanner scanner = new Scanner(System.in);
//        String PasswordPattern2="[A-Z]+[a-zA-Z0-9~!@#$]{7,}";
//        System.out.println("Enter the Password to check Rule2");
//        String passWord2=scanner.next();
//
//        Pattern pattern5=Pattern.compile(PasswordPattern2);
//        Matcher matcher5=pattern5.matcher(passWord2);
//        Boolean result5=matcher5.matches();
//
//        if(result5==true){
//            passwordValidation3();
//        }else{
//            System.out.println("Password is invalid,please enter atleast one uppercase");
//        }
//
//    }
//
//    public static void passwordValidation3(){
//        Scanner scanner = new Scanner(System.in);
//        String PasswordPattern3="[A-Z][0-9][a-zA-Z0-9~!@#$]{6,}";
//        System.out.println("Enter the Password to check Rule3");
//        String passWord3=scanner.next();
//
//        Pattern pattern6=Pattern.compile(PasswordPattern3);
//        Matcher matcher6=pattern6.matcher(passWord3);
//        Boolean result6=matcher6.matches();
//
//        if(result6==true){
//            PasswordValidation4();
//        }else{
//            System.out.println("Password is invalid,please enter atleast one numeric");
//        }
//
//    }
//    private static void PasswordValidation4() {
//
//        String PasswordPattern4 = "([0-9a-zA-Z]*[~!@#$]){1}[0-9a-zA-Z~!@#$]*";
//        System.out.println("Enter your Password for Rule4:");
//        Scanner scanner = new Scanner(System.in);
//        String password4 = scanner.next();
//
//        Pattern pattern7 = Pattern.compile(PasswordPattern4);
//        Matcher matcher7 = pattern7.matcher(password4);
//        boolean result7 = matcher7.matches();
//
//        if(result7 == true)
//            System.out.println("Password is Valid");
//        else
//            System.out.println("Password is invalid & plz enter at least one Special character");
//    }

    public static void multipleEmailValidation() {
        //UC9 Should clear all email samples
        String email1 = "abc@yahoo.com";
        String email2 = "abc-100@yahoo.com";
        String email3 = "abc.100@yahoo.com";
        String email4 = "abc111@abc.com";
        String email5 = "abc-100@abc.net";
        String email6 = "abc.100@abc.com.au";
        String email7 = "abc@1.com";
        String email8 = "abc@gmail.com";
        String email9 = "abc+100@gmail.com";
        String email10 = "abc";

        String multipleEmailePattern = "[a-zA-Z0-9.+-]+[0-9a-zA-Z]*@[a-z0-9]+[.][a-z]{2,4}[.a-z]*";

        Pattern patterns1 = Pattern.compile(multipleEmailePattern);
        Matcher matchers1 = patterns1.matcher(email1);
        boolean results1 = matchers1.matches();

        if(results1 == true)
            System.out.println("results1 is Valid");
        else
            System.out.println("results1 is Invalid");

        Pattern patterns2 = Pattern.compile(multipleEmailePattern);
        Matcher matchers2 = patterns2.matcher(email2);
        boolean results2 = matchers2.matches();

        if(results2 == true)
            System.out.println("results2 is Valid");
        else
            System.out.println("results2 is Invalid");

        Pattern patterns3 = Pattern.compile(multipleEmailePattern);
        Matcher matchers3 = patterns3.matcher(email3);
        boolean results3 = matchers3.matches();

        if(results3 == true)
            System.out.println("results3 is Valid");
        else
            System.out.println("results3 is Invalid");

        Pattern patterns4 = Pattern.compile(multipleEmailePattern);
        Matcher matchers4 = patterns4.matcher(email4);
        boolean results4 = matchers4.matches();

        if(results4 == true)
            System.out.println("results4 is Valid");
        else
            System.out.println("results4 is Invalid");

        Pattern patterns5 = Pattern.compile(multipleEmailePattern);
        Matcher matchers5 = patterns5.matcher(email5);
        boolean results5 = matchers5.matches();

        if(results5 == true)
            System.out.println("results5 is Valid");
        else
            System.out.println("results5 is Invalid");

        Pattern patterns6 = Pattern.compile(multipleEmailePattern);
        Matcher matchers6 = patterns6.matcher(email6);
        boolean results6 = matchers6.matches();

        if(results6 == true)
            System.out.println("results6 is Valid");
        else
            System.out.println("results6 is Invalid");

        Pattern patterns7 = Pattern.compile(multipleEmailePattern);
        Matcher matchers7 = patterns7.matcher(email7);
        boolean results7 = matchers7.matches();

        if(results7 == true)
            System.out.println("results7 is Valid");
        else
            System.out.println("results7 is Invalid");

        Pattern patterns8 = Pattern.compile(multipleEmailePattern);
        Matcher matchers8 = patterns8.matcher(email8);
        boolean results8 = matchers8.matches();

        if(results8 == true)
            System.out.println("results8 is Valid");
        else
            System.out.println("results8 is Invalid");

        Pattern patterns9 = Pattern.compile(multipleEmailePattern);
        Matcher matchers9 = patterns9.matcher(email9);
        boolean results9 = matchers9.matches();

        if(results9 == true)
            System.out.println("results9 is Valid");
        else
            System.out.println("results9 is Invalid");

        Pattern patterns10 = Pattern.compile(multipleEmailePattern);
        Matcher matchers10 = patterns10.matcher(email10);
        boolean results10 = matchers10.matches();

        if(results10 == true)
            System.out.println("results10 is Valid");
        else
            System.out.println("results10 is Invalid");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration program");
        multipleEmailValidation();

    }
}



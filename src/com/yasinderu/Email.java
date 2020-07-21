package com.yasinderu;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String department;
    private String alternateEmail;
    private String companySuffix = "mydcompany.com";
    private int mailBoxCapacity;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = department();

        this.email = createEmail();

        this.password = createPassword(10);
    }

    private String department() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Department Name : ");
        String department = in.nextLine();
        return department;
    }

    private String createEmail() {
        String companyEmail = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;;
        System.out.print("Your company email : " + companyEmail);
        return companyEmail;
    }

    private String createPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#!$";
        char[] password = new char[length];
        for (int i=0; i<length; i++) {
            int randIndex = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(randIndex);
        }
        System.out.println("Your password : " + new String (password));
        return new String(password);
    }

    public void changePassword() {
        Scanner in = new Scanner(System.in);
        String newPassword = in.nextLine();
        if (newPassword.length() <= 10) {
            password = newPassword;
            System.out.println("Password changed");
        } else {
            System.out.println("Password length must less than 10 characters");
        }
    }

    public void setAlternateEmail() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your alternate email : ");
        this.alternateEmail = in.nextLine();
    }

    public void setMailBoxCapacity() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter mail box capacity capacity : ");
        this.mailBoxCapacity = in.nextInt();
    }

    public void getInfo() {
        System.out.println("Welcome " + firstName + " " + lastName + ",");
        System.out.println("Your Department : " + department);
        System.out.println("Your company email : " + email);
        if (alternateEmail != null) {
            System.out.println("Your alternate email : " + alternateEmail);
        }
        System.out.println("Your Password : " + password);
    }
}

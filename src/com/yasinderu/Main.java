package com.yasinderu;

public class Main {

    public static void main(String[] args) {
        Email staffEmail = new Email("Muhammad", "Yasin");
        staffEmail.setAlternateEmail();
        staffEmail.setMailBoxCapacity();
        staffEmail.getInfo();
    }
}

/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 20-02-2023
 *Created With : IntelliJ IDEA Community Edition
 */


package org.example;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        /* write a Java program that creates a password of less than 15 characters,
        ensure that username is "James" and the password entered is "password@123",
        display the welcome message with username in uppercase? */

        Scanner input = new Scanner(System.in);

        String username = "James";
        String password = "password@123";

        System.out.print("Enter your username: ");
        String enteredUsername = input.nextLine();

        System.out.print("Enter your password: ");
        String enteredPassword = input.nextLine();

        if (enteredUsername.equals(username) &&
                enteredPassword.equals(password) && enteredPassword.length() < 15) {
            String welcomeMessage = "Welcome, " + username.toUpperCase() + "!";
            System.out.println(welcomeMessage);
        } else {
            System.out.println("Access denied.");
        }
    }
}
package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static boolean isPasswordComplex(String password) {
        if (null == password || password.length() < 6) {
            return false;
        }

        boolean hasNumber = false, hasLower = false, hasUpper = false;
        for (int i = 0, len = password.length(); i < len; ++i) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                hasNumber = true;
            }
            if (Character.isLowerCase(c)) {
                hasLower = true;
            }
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            }
        }
        return hasNumber && hasLower && hasUpper;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String userInput = scanner.nextLine();
        System.out.println("Is the password complex? "
                + isPasswordComplex(userInput));

        scanner.close();
    }
}

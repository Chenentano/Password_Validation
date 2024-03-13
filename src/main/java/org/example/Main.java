package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String password = "fasfaSsd$2";
        System.out.println(checkPassword(password));

        System.out.println(generateSafePassword(20));

    }

    public static String generateSafePassword(int length){

        String symbol = "-/.^&*_!@%=+>)";
        String upperLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerLetter = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";

        String finalString = upperLetter + lowerLetter + numbers + symbol;

        Random random = new Random();

        char [] Password = new char[length];
        StringBuilder password = new StringBuilder(length);
        for(int i = 0 ; i < length ; i++){
            password.append(finalString.charAt(random.nextInt(finalString.length())));
        }
        return password.toString();
    }


    public static String checkPassword(String password) {
        if (!checkPasswordLength(password)) {
            return "Password muss min. 8 Zeichen enthalten!";
        } else if (!checkIfPasswordContainsDigits(password)) {
            return "Passwort muss mindestens eine Zahl enthalten!";
        } else if (!checkIfPasswordContainsUpperAndLowerCase(password)) {
            return "Passwort muss sowohl Groß- als auch Kleinbuchstaben enthalten!";
        } else if (!checkIfPasswordIsStrong(password)) {
            return "Das Passwort ist zu schwach!";
        } else if (!checkIfPasswordContainsSpecialChars(password)) {
            return "Passwort muss mindestens ein Sonderzeichen enthalten!";
        } else {
            return "Tolles Passwort!";
        }
    }

    private static boolean checkPasswordLength(String password) {
        return password.length() >= 8;
    }

    private static boolean checkIfPasswordContainsDigits(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkIfPasswordContainsUpperAndLowerCase(String password) {
        boolean containsUpperCase = false;
        boolean containsLowerCase = false;

        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                containsLowerCase = true;
            }
            if (Character.isUpperCase(c)) {
                containsUpperCase = true;
            }
        }
        return containsLowerCase && containsUpperCase;
    }

    private static boolean checkIfPasswordIsStrong(String password) {
        String[] badWords = {"test", "123", "qwertz", "12345", "hallo", "abc"};

        for (String badWord : badWords) {
            if (password.contains(badWord)) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkIfPasswordContainsSpecialChars(String password) {
        String[] specialChars = {"!", "§", "$", "%", "&", "/", "(", ")", "=", "@", "?", "-", ".", "+", "#", "*"};

        for (String specialChar : specialChars) {
            if (password.contains(specialChar)) {
                return true;
            }
        }
        return false;
    }

    public static String passwordStrength(String password) {
        if (password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#\\$%\\^&\\*])(?=.{8,})")) {
            return "Sehr gut!";
        } else if (password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.{8,})")) {
            return "Gut!";
        } else if (password.matches("^(?=.*[a-z])(?=.*[0-9])(?=.{8,})")) {
            return "Schlecht!";
        } else if (password.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.{8,})")) {
            return "Schlecht!";
        } else {
            return "Hast du überhaupt eine Tastatur?";
        }
    }


}
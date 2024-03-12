package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkIfPasswordContainsDigits("tes2%t"));
        System.out.println(passwordStrength("test123"));

    }


    public static String checkPasswordLength(String password) {
        if(password.length()< 8){
            return "Password muss min. 8 Zeichen enthalten!";
        }
            return "Tolles Passwort!";
    }

    public static String checkIfPasswordContainsDigits(String password) {

        for(char c : password.toCharArray()){
            if(Character.isDigit(c)){
                return "Tolles Passwort!";
            }
        }
                return "Keine Sonderzeichen gefunden";
    }

    public static String checkIfPasswordContainsUpperAndLowerCase(String password){
        boolean containsUpperCase = false;
        boolean containsLowerCase = false;

        for (char c : password.toCharArray()){
            if(Character.isLowerCase(c)){
                containsLowerCase = true;
            }
            if(Character.isUpperCase(c)){
                containsUpperCase = true;
            }
        }
            if(containsLowerCase && containsUpperCase){
                return "Tolles Passwort!";
            }else{
                return "Das Passwort beinhaltet nur upper oder lowercase";
            }

    }

    public static String checkIfPasswordIsWeak(String password){
        return "yoyo";
    }
    public static String passwordStrength(String password) {
        if (password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#\\$%\\^&\\*])(?=.{8,})")) {
            return "Strong";
        } else if (password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.{8,})")) {
            return "Medium";
        } else if (password.matches("^(?=.*[a-z])(?=.*[0-9])(?=.{8,})")) {
            return "Meh";
        } else if (password.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.{8,})")) {
            return "Weak";
        } else {
            return "WTF?";
        }
    }


}
package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkIfPasswordContainsDigits("tes2%t"));

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

}
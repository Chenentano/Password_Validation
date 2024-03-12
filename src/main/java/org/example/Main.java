package org.example;

public class Main {
    public static void main(String[] args) {


        System.out.println(checkIfPasswordIsWeak("qwertz2"));

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

        String [] badWords = {"test","123","qwertz","12345","hallo"};
        //String lowerCasePassword = password.toLowerCase();

        for(String badWord : badWords){
           // String lowerCaseBadWord = badWord.toLowerCase();
            if(password.contains(badWord)){
                return "Das Passwort ist zu schwach!";
            }
        }
        return "Gutes Passwort!";
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
            return "Hast du überhaupt eine Tastatur?s";
        }
    }


}
package miniProjects;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Password ");
        String password = scanner.next();
        System.out.println(isValidPassword(password) ? "Valid Password" : "Invalid Password");
    }

    private static boolean isValidPassword(String password) {
        String specialCharacters = "!@#$%&";
        if ((null == password) || ((password.length() < 8) || (password.length() > 15))) {
            return false;
        }
        boolean isLowerCase = false;
        boolean isUpperCase = false;
        boolean isspecialCharacters = false;
        boolean isDigit = false;
        for (char ch : password.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                isLowerCase = true;
            }
            if (ch >= 'A' && ch <= 'Z') {
                isUpperCase = true;
            }
            if (specialCharacters.contains(String.valueOf(ch))) {
                isspecialCharacters = true;
            }
            if (ch >= '0' && ch <= '9') {
                isDigit = true;
            }
        }
        return isDigit && isLowerCase && isUpperCase && isspecialCharacters;
    }
}


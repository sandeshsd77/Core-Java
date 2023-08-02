package exceptionHandling;

import java.util.Scanner;

public class DemoAgeException {
    public static void main(String[] args) throws InvalidAgeException {
        System.out.println("Enter the Age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
            if (age < 18) {
                throw new InvalidAgeException("Your are Under age");
            } else{
                    System.out.println("Your Eligible to Vote");
                }
            }
        }

/*if (age < 18) {
        try {
        throw new InvalidAgeException("Under age");
        } catch (InvalidAgeException e) {
        throw new RuntimeException(e);
        }
        } else{
        System.out.println("Your Eligible to Vote");
        }*/
package org.pjatk.homework.zad05;

/*
    Napisz program obliczający iloczyn dowolnej pary
    liczb całkowitych, nie korzystając z operatora *.
    Do dyspozycji masz operatory + i --.
 */

import java.util.Scanner;

public class NonStandardMultiplierProgram {
    static boolean validateInput(String input) {
        int parsedInput;
        try {
            parsedInput = Integer.parseInt(input);
        } catch (NumberFormatException exception) {
            return false;
        }
        return true;
    }

    static int takeInput(String info) {
        System.out.println(info);
        while (true) {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            if (validateInput(input)) {
                return Integer.parseInt(input);
            } else {
                System.out.println("To nie jest liczba, spróbuj jeszcze raz");
            }
        }
    }

    public static void main(String[] args){
        int num1 = takeInput("podaj pierwszą liczbę");
        int num2 = takeInput("podaj drugą liczbę");
        int sum = 0;
        if (num2 < 0){
        for (int i = 0; i > num2; i--){
                sum -= num1;
                System.out.println("i: "+i+" num2: " +sum);
        }
        }else{
            for (int i = 1; i <= num2; i++){
                sum += num1;
                System.out.println("i: "+i+" num2: " +sum);
            }
        }
        System.out.println(sum);
    }
}

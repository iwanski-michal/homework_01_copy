package org.pjatk.homework.zad04;

import java.util.Scanner;

public class NonStandardSumProgram {

    /*
        Użytkownik wprowadza z klawiatury dwie liczby całkowite.
        Napisz program obliczający sumę tych liczb, korzystając
        z operatorów inkrementacji (++) i dekrementacji (--).
        Użycie operatora dodawania (+) jest zabronione.
     */
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

    public static void main(String[] args) {
        int num1 = takeInput("podaj pierwszą liczbę");
        int num2 = takeInput("podaj drugą liczbę");
        if (num2 <= 0) {
            for (int i = 0; i > num2; i--) {
                num1--;
            }

        } else {
            for (int i = 0; i < num2; i++) {
                num1++;
            }
        }
        System.out.println("Suma to: "+num1);
    }
}

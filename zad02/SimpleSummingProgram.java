package org.pjatk.homework.zad02;

import java.util.Scanner;

public class SimpleSummingProgram {

    /*
        Użytkownik wprowadza z klawiatury serię liczb różnych od zero,
        zero natomiast jest sygnałem zakończenia wprowadzania danych.
        Napisz program, który obliczy sumę tych liczb
     */
    int arrayOfNumbers[];

    public static void main(String[] args) {
            int sum = 0;
            while (true) {
            System.out.println("Podaj liczbę do zsumowania. Podaj [0], jeśli Ci już tych liczb wystarczy i chcesz poznać wynik");
            try {
                String input = new Scanner(System.in).nextLine();
                int parsedInput = Integer.parseInt(input);
                if (parsedInput == 0) {
                    System.out.println("Twoja suma to: "+sum);
                    break;
                }
                sum += parsedInput;
            } catch (NumberFormatException exception) {
//                System.exit(1);
                System.out.println("To nie jest liczba, lub liczba jest za duża :C");
            }
        }
    }
}

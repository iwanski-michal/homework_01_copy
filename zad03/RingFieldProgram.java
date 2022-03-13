package org.pjatk.homework.zad03;

import java.util.Scanner;

public class RingFieldProgram {

    /*
        Napisz program obliczający pole powierzchni pierścienia kołowego
        o promieniu zewnętrznym R i wewnętrznym r. Długości promieni użytkownik
        wprowadza z klawiatury. Program powinien zasygnalizować błędne dane
        i ponownie zapytać o potrzebną wartość.
     */

    //Pytanie, czy zakładamy na sztywno, że piersza dana, jaką użytkownik poda to zewnętrzny promień a druga zawsze wewnętrzny? Czy w razie potrzeby zamieniamy

    static boolean validateInput(String input) {
        float parsedInput;
        try {
            parsedInput = Float.parseFloat(input);
        } catch (NumberFormatException exception) {
            return false;
        }
        if (parsedInput <= 0) {
            return false;
        }
        return true;
    }

    static float takeInput() {
        System.out.println("Podaj promień koła");
        while (true) {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            if (validateInput(input)) {
                return Integer.parseInt(input);
            } else {
                System.out.println("Nieprawidłowa wartość, spróbuj jeszcze raz");
            }
        }
    }

    static double circleArea(float r) {
        return Math.PI*(r*r);
    }

    public static void main(String[] args) {
        double Field;
        float radius1 = takeInput();
        float radius2 = takeInput();
//        System.out.println("radius1:" + radius1 + "radius2: " + radius2);
        double Area1 = circleArea(radius1);
        double Area2 = circleArea(radius2);
        if (radius1 < radius2) {
            Field = Area2 - Area1;
        } else {
            Field = Area1 - Area2;
        }
        System.out.println("Pole pierścienia wynosi: " + Field);


    }
}

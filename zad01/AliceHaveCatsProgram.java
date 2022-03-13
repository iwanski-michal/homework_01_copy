package org.pjatk.homework.zad01;

import java.util.Scanner;
public class AliceHaveCatsProgram {


    /*
        Użytkownik wprowadza z klawiatury liczbę kotów, które posiada pani Ala.
        Napisz program który poprawnie wyświetli zdanie typu 'Ala ma kota'

        np. dla liczby 1 - "Ala ma jednego kota"
            dla liczby 2 - "Ala ma 2 koty"
            dla liczby 9 - "Ala ma 9 kotów"
            dla liczby 23 - "Ala ma 23 koty"
            dla liczby 25 - "Ala ma 25 kotów"
            dla liczby 11 - "Ala ma 11 kotów"
            dla liczby 12 - "Ala ma 12 kotów"
            dla liczby 16 - "Ala ma 16 kotów"
            dla liczby 21 - "Ala ma 21 kotów"
            itd.
     */
    public static void main(String[] args) {
        System.out.println("Give me below number of cats, that ms Ala has.");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        try {
            int catsCount = Integer.parseInt(input);
//            System.out.println("Proper number, proceeding.");
            if (catsCount == 1) {
                System.out.println("Ala ma jednego kota");
                System.exit(0);
            }else if (catsCount == 0){
                System.out.println("Ala nie ma kotów");
            }else if(catsCount < 0){
                System.out.println("Nie żartuj sobie, Ala nie może mieć długu kotowego");
            }
            else if (catsCount % 10 >= 2 && catsCount % 10 <= 4 && (catsCount % 100 >= 20 || catsCount % 100 < 10)) {
                System.out.println("Ala ma " + catsCount + " koty");
            } else {
                System.out.println("Ala ma " + catsCount + " kotów");
            }
        } catch (NumberFormatException exception) {
            System.out.println("It isn't a number, shutting down.");
            System.exit(1);
        }
    }

}

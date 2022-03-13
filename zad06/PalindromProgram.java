package org.pjatk.homework.zad06;

import java.util.Locale;
import java.util.Scanner;

/*
    Napisz program który sprawdzi, czy wprowadzone zdanie
    jest palindromem, czyli brzmi tak samo czytane od strony lewej do prawej
    i od prawej do lewej.
    Przykład zdania-palindromu jest 'Kobyła ma mały bok' (bez rozróźniania wielkości
    liter i uwzględniania odstępów miezy słowami)
 */
public class PalindromProgram {

    public static void main(String[] args){
        Scanner cs = new Scanner(System.in);
        String palindromeUnnormalized = cs.nextLine();
        String palindromeNormalized = palindromeUnnormalized.replaceAll("\\s","").toLowerCase();
//        System.out.println(palindromeNormalized);
        String palindromeReversed = new StringBuilder(palindromeNormalized).reverse().toString();
//        System.out.println(palindromeReversed);
        if (palindromeReversed.equals(palindromeNormalized)){
            System.out.println("ciąg znaków: "+ palindromeUnnormalized +" jest palindromem. Wow!");
        }else{
            System.out.println("ciąg znaków: "+ palindromeUnnormalized +" Nie jest palindromem. Smutek :(");
        }
    }

}

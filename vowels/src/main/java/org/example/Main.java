package org.example;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir cümle giriniz.");
        String sentence =scanner.nextLine();
        char[] lowerSentence=sentence.toLowerCase().trim().toCharArray();

        for (Character vovels: lowerSentence) {
           switch (vovels){
               case 'a':
               case 'o':
               case 'u':
               case 'ı':
                   System.out.println(vovels + " => kalın sesli harftir. ");
                   break;
               case 'e':
               case 'ö':
               case 'ü':
               case 'i':
                   System.out.println(vovels+ " => ince sesli harftir.");
                   break;
               default:
                   System.out.println(vovels+ " => sessiz harftir.");
           }
        }
    }
}
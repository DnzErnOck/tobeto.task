package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int sayi =scanner.nextInt();
        if (sayi == 1 || sayi == 0){
            System.out.println("Sayı değeri 1 veya 0 girilemez. Geçersiz durum.");
        }
        else {

            if (isPrime(sayi)){
                System.out.println(sayi + " bir asal sayıdır.");
            }
            else {
                System.out.println(sayi + " bir asal sayı değildir.");
            }
        }
    }
    public static boolean isPrime(int sayi){
        for (int i = 2; i < sayi; i++) {
            if (sayi%i == 0){
                return false;
            }
        }
        return true;
    }
}
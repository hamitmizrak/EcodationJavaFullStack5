package com.hamitmizrak.javase;

import java.util.Scanner;

// Kullanıcıdan aldığımız bir sayının asal olup olmadığı hesaplayan Java algoritmasını yazalım ?
// Dikkat: metotlarla yapalım.
// Asalsayı 1 ve kendisine bölünebilen sayılara denir: 3 1 ve 3 asaldır.  4: 1 , 4 ,2 =asal değildir
// 2 : aynı zamadan çift ve tek asal sayıdır.
public class _25_AsalSayi {
    public static int userScannerData() throws _00_HamitMizrakException {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int number = klavye.nextInt();
        if (number < 0)
            throw new _00_HamitMizrakException("Sıfırdan küçük sayı giremezsiniz");
        else if (number == 0 || number == 1)
            return 1;
        return number;
    }

    public static Boolean isPrime(int number) throws _00_HamitMizrakException {
        boolean result = false;
        if (number < 0)
            throw new _00_HamitMizrakException("Sıfırdan küçük giremezsiniz");
        else if (number == 2) {
            System.out.println("2: En küçük ve tek çift sayıdır");
        } else {
            // 2 3 5 7 11 13 17 19 ...
            for (int i = 2; i < number; i++) {
                if (number % i == 0)
                    result = true;
            }

            if (result) {
                System.out.println(number + " Asal sayı değildir");
            } else {
                System.out.println(number + " Asal sayıdır.");
            }
        }
        return false;
    }

    static void isPrimeResult() throws _00_HamitMizrakException {
        int number= userScannerData();
        isPrime(number);
    }

    public static void main(String[] args) throws _00_HamitMizrakException {
        while(true){
            isPrimeResult();
        }
    }
}

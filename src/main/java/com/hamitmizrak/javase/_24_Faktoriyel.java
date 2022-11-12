package com.hamitmizrak.javase;

import java.util.Scanner;

// Kullanıcıdan aldığımız bir sayının faktoriyeli hesaplayan Java algoritmasını yazalım ?
// Dikkat: metotlarla yapalım.
// 4!=4*3*2*1=24
public class _24_Faktoriyel {
    // Clean codes
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

    //Iterative faktoriyel
    private static int iterativeMethod(int number) throws _00_HamitMizrakException {
        int result = 1;
        for (int i = number; i >= 1; i = i - 1) {
            result = result * i;
        }
        return result;
    }

    // Recursive
    private static int recursiveMethod(int number) {
        if (number == 0 || number == 1)
            return 1;
        return number * recursiveMethod(number - 1);
    }


    static void chooiseMethod() throws _00_HamitMizrakException {
        Scanner klavye = new Scanner(System.in);
        int number = userScannerData();
        System.out.println("1-)Iterative\n2-)Recursive\n3-)Exit");
        int chooise = klavye.nextInt();
        switch (chooise) {
            case 1:
                int iterativeResult = iterativeMethod(number);
                System.out.println(number + " sayısının faktöriyel sonucu: " + iterativeResult);
                break;
            case 2:
                int recursiveResult = recursiveMethod(number);
                System.out.println(number + " sayısının faktöriyel sonucu: " + recursiveResult);
                break;
            case 3:
                System.out.println("Çıkış yapılıyor");
                System.exit(0);
                break;
            default:
                System.out.println("Belitileni seçiniz");
                break;
        }
    }


    //Encapsulation
    public static void main(String[] args) throws _00_HamitMizrakException {
        for (;;){
            chooiseMethod();
        }

       /* while(true){
            chooiseMethod();
        }*/
    }
}

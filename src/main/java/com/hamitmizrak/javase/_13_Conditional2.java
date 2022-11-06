package com.hamitmizrak.javase;

import java.util.Random;
import java.util.Scanner;

//Casting: Dönüşüm
public class _13_Conditional2 {
    //object field
    private static int COUNTER=1;

    public static void main(String[] args) {
     // kullanıcıdan aldığımız bir sayıyı tahmin eden bir oyun algoritması yazınız ?
     // Bilgisayar rastgele 1-10 arasında bir sayı üretsin. bu üretilen sayıyı tahmin sayısı en fazla 5 olsun

        //sonsuz döngü: for(;;){}  while(true){}
        for(;;){
            Scanner klavye=new Scanner(System.in);
            System.out.println("\nlütfen 1-10 arasında bir sayı giriniz");
            char number= klavye.nextLine().charAt(0);

            if(Character.isDigit(number)){
                if(number<0){
                    System.out.println("Lütfen negatif girmeyiniz");
                }else{
                    //Rastgele sayı
                    Random random=new Random();
                    int computerNumber= random.nextInt(10)+1;
                    System.out.println(computerNumber);

                    if(COUNTER>5){
                        System.out.println("Sayı tahmin sayınız 5 oldu ve sistemden çıkarıldınız");
                        break;
                    }
                    if(Math.abs(number)==computerNumber){
                        System.out.println("Girdiğiniz giriş sayısı: "+COUNTER);
                        System.out.println("tahmin sayınız: "+number+ " bilgisayar sayıyı: "+computerNumber+" EŞLEŞTİ:");
                    }else if(number!=computerNumber){
                        System.out.println("Girdiğiniz giriş sayısı: "+COUNTER);
                        System.out.println("tahmin sayınız: "+number+ " bilgisayar sayıyı: "+computerNumber+" EŞLEŞMEDİ:");
                        COUNTER++;
                    }  else{
                        System.out.println("lütfen sayı giriniz");
                    }
                }
            }else if(Character.isLetter(number))
                System.out.println("Bu bir harftir lütfen sayı giriniz");
            else
                System.out.println("Bu bir özel simge  lütfen sayı giriniz");
        }
    }
}

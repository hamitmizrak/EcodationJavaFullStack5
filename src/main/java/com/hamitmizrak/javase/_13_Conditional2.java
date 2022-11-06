package com.hamitmizrak.javase;

import java.util.Random;
import java.util.Scanner;

//Casting: Dönüşüm
public class _13_Conditional2 {

    public static void main(String[] args) {
     // kullanıcıdan aldığımız bir sayıyı tahmin eden bir oyun algoritması yazınız ?
     // Bilgisayar rastgele 1-10 arasında bir sayı üretsin. bu üretilen sayıyı tahmin sayısı en fazla 5 olsun
        Scanner klavye=new Scanner(System.in);
        System.out.println("lütfen 1-10 arasında bir sayı giriniz");
        int number=  klavye.nextInt();
        if(number<0){
            System.out.println("Lütfen negatif girmeyiniz");
        }else{
            //Rastgele sayı
            Random random=new Random();
            int computerNumber= random.nextInt(10)+1;
            System.out.println(computerNumber);

            if(Math.abs(number)==computerNumber){
                System.out.println("bilgisayar:"+computerNumber+" kişi: "+number+"Doğru tahmin ettiniz:");
            }else if(number!=computerNumber){
                System.out.println("bilgisayar:"+computerNumber+" kişi: "+number+"!!!! Doğru tahmin etmediniz:");
            }  else{
                System.out.println("lütfen sayı giriniz");
            }
        }
    }
}

package com.hamitmizrak.javase;

import java.util.Random;

// Örnek: 1-10 arasında 5 tane random sayı üretelim ?
// Bu sayılar nelerdir
// Bu sayıları toplayalım
// Bu sayılar içinde tek sayı toplamı
// Bu sayılar içinde tek sayı adeti
public class _20_RandomNumberSum {

    public static void main(String[] args) {
        Random random=new Random();
        int sum=0,oddSum=0,oddCounter=0;
        String number = "",oddNumber=""; //null pointer exception almamak
        for (int i = 1; i <=5 ; i++) {
            int randomNumber=random.nextInt(10)+1;
            //sayı toplamları
            sum+=randomNumber;

            //Sayılar
            number+=randomNumber+" ";

            // Bu sayılar içinde tek sayı adeti ve tek sayı toplamı
            if(randomNumber%2==1){
                oddNumber+=randomNumber+" ";
                oddCounter++;
                oddSum+=randomNumber;
            }

        }
        System.out.println("Sayılar: "+number);
        System.out.println("Sayı toplamı: "+sum);

        System.out.println("Tek Sayılar: "+oddNumber);
        System.out.println("Tek Sayılar sayı adedi: "+oddCounter);
        System.out.println("Tek Sayı toplamı: "+oddSum);
    }
}

package javase;

import java.util.Scanner;
public class _16_Loop {

    public static void main(String[] args) {

        // break: döngünün çalışmasını durdurur
        // continue: döngünün bir kereye mahsus çalışmasını engelliyor
        // return: metodun çalışmasını durdurur

        for (int i = 2; i <=10 ; i=i+2) {
            System.out.print(i+" ");
        }

        System.out.println("\n+++++++++++++++++++++");
        int k = 2; ;
        while( k <=10){
            System.out.print(k+" ");
            k=k+2;
        }
    }
}

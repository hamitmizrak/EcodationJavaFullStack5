package javase;

import java.util.Random;
import java.util.Scanner;

//Casting: Dönüşüm
public class _13_Conditional1 {

    public static void main(String[] args) {

        int number=4;
        switch (number){
            case 1:
                System.out.println("sayı 1");
                break;

            case 2:
                System.out.println("sayı 2");
                break;

            case 3:
                System.out.println("sayı 3");
                break;

            default:
                System.out.println("lütfen sayı giriniz");
                break;
        }

    }
}

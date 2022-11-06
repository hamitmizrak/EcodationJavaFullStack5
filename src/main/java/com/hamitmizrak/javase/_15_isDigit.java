package com.hamitmizrak.javase;

import java.util.Scanner;

//Casting: Dönüşüm
public class _15_isDigit {

    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("lütfen birşey yazınız");
        char value= klavye.nextLine().charAt(0);
        if(Character.isDigit(value)){
            System.out.println("Bu bir sayıdır");
        }else if(Character.isLetter(value))
            System.out.println("Bu bir harftir");
        else
            System.out.println("Bu bir özel simge");
    }
}

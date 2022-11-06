package com.hamitmizrak.javase;

import java.util.Random;
import java.util.Scanner;

//Casting: Dönüşüm
public class _14_examples {

    public static void main(String[] args) {
        // kullanıcıdan aldığımız şifre ve tekrar aldığımız şifreyi  ile karşılaştırma password-repassword ?
        String password,repassword;
        Scanner klavye=new Scanner(System.in);

        System.out.println("Lütfen bir şifre giriniz");
        password= klavye.nextLine();

        System.out.println("Lütfen şifreyi tekrar giriniz");
        repassword= klavye.nextLine();

        /*if(password.equals(repassword)){
            System.out.println("Şifreler aynı");
        }else{
            System.out.println("Şifreler farklı");
        }*/

        //ternary
        String result = (password.equals(repassword)) ? "Şifreler aynı" : "Şifreler farklı";
        System.out.println(result);

    }

}

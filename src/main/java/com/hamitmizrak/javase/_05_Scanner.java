package com.hamitmizrak.javase;

import java.util.Scanner;

public class _05_Scanner {

    public static void main(String[] args) {
        //consolden klavyeden veri almak
        Scanner klavye=new Scanner(System.in);
        System.out.println("Lütfen birşeyler yazınız");
        String value=klavye.nextLine();
        System.out.println(value.length());
        System.out.println(value.toLowerCase());
        System.out.println(value.toUpperCase());
    }
}

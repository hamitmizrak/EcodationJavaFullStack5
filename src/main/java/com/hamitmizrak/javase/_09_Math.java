package com.hamitmizrak.javase;

public class _09_Math {

    public static void main(String[] args) {
        //Math: static
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.sqrt(16));
        System.out.println(Math.pow(2,5));
        System.out.println(Math.abs(-16));
        System.out.println(Math.min(-2,444));
        System.out.println(Math.max(-2,444));

        System.out.println(Math.floor(2.9));
        System.out.println(Math.ceil(2.1));
        System.out.println(Math.round(3.4));
        System.out.println(Math.round(3.5));

        //ÖDEV:
        // hipotenüs
        // Kullanıcıdan alınan 2 sayı üçgenin dik kenarlarıdır hipotenüs uzunluğunu
        // bulalım
        //1.dikkenar:3
        //2.dikkenar:4
        //hipotenüs: 3*3+4*4 => karekökü
        //double int


        System.out.println(Math.random()*4+1);
    }
}

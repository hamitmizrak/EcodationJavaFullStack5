package com.hamitmizrak.javase;

//single comment
/*
multiple comment
 */
public class _01_JavaVariable {
    // psvm ==> TAB
    public static void main(String[] args) {
        //sout => TAB
        //System.out.println("Hello World !");

        String $_degiskenAdi44üğşçö = "java öğreniyorum";
        System.out.println($_degiskenAdi44üğşçö);

        //primitive type (ilkel Tipler)
        //tamsayılar: byte < short<int<long
        byte b1 = 125;
        //b1=null;
        short s1 = 255;
        int i1 = 1551515;
        long l1 = 15551515154L;

        //virgüllü sayı
        float f1 = 1425.52f;
        double d1 = 1515151.4545;

        //karar
        boolean b3 = true;

        //char
        char c4 = '&';

        //pritimitive type
        /*
        stack memory ( hafızası belli olandır).
        RAM
        Daha hızlıdır
        null veremezsiniz
        daha az yer kaplar
        */

        //wrapper type
        /*
        objedir
        Heap memory ( hafızası belli olmayan)
        null verebilirim
        daha fazla yer kaptlar
        RAM
        */

        //primitive type (ilkel Tipler)
        //tamsayılar: byte < short<int<long
        Byte wb1 = 125;
        wb1=null;
        Short ws1 = 255;
        Integer wi1 = 1551515;
        Long wl1 = 15551515154L;

        //virgüllü sayı
        Float wf1 = 1425.52f;
        Double wd1 = 1515151.4545;

        //karar
        Boolean wb3 = true;

        //char
        Character wc4 = '&';



    }
}

package com.hamitmizrak.javase;

import java.util.Random;

public class _10_Random {

    public static void main(String[] args) {
        System.out.println(Math.random()*4+1);
        System.out.println( Math.floor(Math.random()*4+1));

        //Random object
        Random rastgele=new Random();
        int number= rastgele.nextInt(10)+1; //1<=X<=4
        System.out.println(number);
    }
}

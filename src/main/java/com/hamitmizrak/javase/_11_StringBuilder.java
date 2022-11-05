package com.hamitmizrak.javase;

import java.util.Random;

public class _11_StringBuilder {

    public static void main(String[] args) {
        String str1="Javase",str2="javaee",str3="javame";
        //birleştirmek

        //1
        String birlestir1=str1+str2+str3;
        System.out.println(birlestir1);

        //2
        String birlestir2=str1.concat(str2).concat(str3);
        System.out.println(birlestir2);

        //3
        StringBuilder birlestir3=new StringBuilder();
        birlestir3.append(str1).append(str2).append(str3);
        String toStringData=birlestir3.toString();
        System.out.println(toStringData);
    }
}

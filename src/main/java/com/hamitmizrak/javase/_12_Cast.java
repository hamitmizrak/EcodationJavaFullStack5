package com.hamitmizrak.javase;

//Casting: Dönüşüm
public class _12_Cast {

    public static void main(String[] args) {
        //casting:
        //1-) float ,Long
        float f1=14.53f;
        long l1=14531923L;

        //2-)
        //byte short int long  bsil
        byte b2=127;
        long l2=b2;

        //3-)
        //byte short int long  bsil
        long l3=1425252666116L;
        byte b3=(byte)l3;

        //4-) sayıyı => String'e
        int number4=44;
        String str4=String.valueOf(number4);
        String str44=Integer.toString(number4);
        System.out.println(str4+str44);

        //5-) String'i => sayıya
        String str5="25";
        int number5=Integer.valueOf(str5);
        int number55=Integer.parseInt(str5);
        System.out.println(number5+number55);
    }
}

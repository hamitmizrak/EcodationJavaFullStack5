package com.hamitmizrak.javase;

import java.util.Base64;
import java.util.Scanner;

public class _28_DecoderEncoder {

    //ÖDEV isminizi ve soyisiminizi scanner alarak encoder decoder yapalım ?

   //Scanner
    private static String getDataFromUser(){
        Scanner klavye=new Scanner(System.in);
        System.out.println("Birşeyler yazınız");
        return  klavye.nextLine();
    }
    //Encoder(Şifreleme)
    private static String encoderData(String value){
        java.util.Base64.Encoder encoder= java.util.Base64.getEncoder();
        String encrypted=encoder.encodeToString(value.getBytes());
        return  encrypted;
    }

    // Decoder(Şifre Çöz)
    // String asd="merhabalar";  String asd=new String(); arasındaki fark nedir ?
    private static String decoderData(String value){
        java.util.Base64.Decoder decoder= java.util.Base64.getDecoder();
        String solved=new String(decoder.decode(value));
        return solved;
    }

    public static void main(String[] args) {
        //Decoder-Encoder: password
        String userData=getDataFromUser();
        String encrypted= encoderData(userData);
        String solved=decoderData(encrypted);

        System.out.println("ilk data: "+userData);
        System.out.println("Şifrelenmiş: "+encrypted);
        System.out.println("Çözülmüş: "+solved);
    }
}

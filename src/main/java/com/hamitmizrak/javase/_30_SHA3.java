package com.hamitmizrak.javase;

import com.google.common.hash.Hashing;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

// SHA
// 64  hexadecimal
public class _30_SHA3 {
//Kullanıcıdan alınan isim soyisimi Decoder-Encoder sonra MD5 ile kodluyoruz sonra SHA ile kodluyoruz.

    //Scanner
    private static String getDataFromUser(){
        Scanner klavye=new Scanner(System.in);
        System.out.println("Birşeyler yazınız");
        return  klavye.nextLine();
    }

    //SHA
    private static String getSha(String user){
        return Hashing.sha256().hashString(user, StandardCharsets.UTF_8).toString();
    }

    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        try{
            String userData= getDataFromUser();
            String encrpyted= getSha(userData);
            System.out.println("ilk hali: "+userData+" Şifrelenmiş: "+encrpyted);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

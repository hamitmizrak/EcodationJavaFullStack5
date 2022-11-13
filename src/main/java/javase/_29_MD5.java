package javase;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

// MD5
// Kriptografik özet fonksiyonu
// 1991(md4)
// 128 bit
// Brute Force
public class _29_MD5 {

    //Scanner
    private static long getDataFromUser(){
        Scanner klavye=new Scanner(System.in);
        System.out.println("Sayı yazınız");
        return  klavye.nextLong();
    }

    private static String longGetMd5(long number) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String userData=Long.toString(number);
        byte[] lang=userData.getBytes("UTF-8");
        MessageDigest messageDigest=MessageDigest.getInstance("MD5");
        byte[] data=messageDigest.digest(lang);
        BigInteger bigInteger=new BigInteger(1,data);
        String hashData=bigInteger.toString(16);
        while(hashData.length()<32){
            hashData="0"+hashData;
        }
        return hashData;
    }

    private static String shortGetMd5(long number) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String hashData=new BigInteger(1,MessageDigest.getInstance("MD5").digest(Long.toString(number).getBytes("UTF-8"))).toString(16);
        while(hashData.length()<32){
            hashData="0"+hashData;
        }
        return hashData;
    }

    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        long userData=getDataFromUser();
       String md5Data= longGetMd5(userData);
        System.out.println(md5Data);
    }
}

package com.hamitmizrak.javase;

import java.util.Scanner;

// Kullanıcıdan aldığımız password ve repassword datasını
// step 1: password -repassword eğer eşitse eşleşti yazsın yoksa eşleşmedi
// step 2: kullanıcının eşleştirmediği süre zarfında tek boyutlu diziye atasın
// step 3: ancak kullanıcın yanlış yapma hakkı 5 olsun (tek boyutlu dizi eleman sayısı:5)
// w3school Java
public class _34_ArrayExamples {

    private static String[] getDataFromUser() {
        Scanner klavye = new Scanner(System.in);
        String[] array = new String[2];
        String password, repassword;
        System.out.println("Şifreyi  yazınız");
        password = klavye.nextLine();
        System.out.println("Şifreyi tekrar yazınız");
        repassword = klavye.nextLine();
        array[0] = password;
        array[1] = repassword;
        return array;
    }

    private static boolean getPasswordRePasswordEquals() {
        String[] array = getDataFromUser();
        String[] isError=new String[5];
        String password = array[0];
        String rePassword = array[1];
        if (password.equals(rePassword))
            return true;
        else{
           if(isError[0]!=null){
               System.out.println("Bir önceki şifre hatanız: "+isError[0]);
           }
            System.out.println("Eşleşmedi !!!");
            //for loop
            isError[0]=rePassword;
        }
            return false;
    }

    private static void getResult() {
        boolean data=getPasswordRePasswordEquals();
        String[] isError;
        if (data) {
            System.out.println("Admin Sayfasına yönlendiriliyor");
            System.exit(0);
        } else {
            System.out.println("Register !!!");
        }
    }

    public static void main(String[] args) {

        while(true){
            getResult();
        }

    }

}

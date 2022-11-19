package dev.project.atm.controller;

import dev.project.atm.util.IAtm;
import dev.project.atm.util.RegisterStaticData;

import java.io.Serializable;
import java.util.Scanner;

public class BankBranchController implements IAtm, Serializable {

    // serialVersionUID
    public static final long serialVersionUID = 1L;

    //Metotlar
    public String scannerValue() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen seçim yapınız");
        System.out.println("1-)Para Görüntüle\n2-)Para Yatır\n3-)Para çek\n4-)Eft Gönder" +
                "\5-)Havale Gönder\6-)Mail Gönder\7-)Müşteri Hizmetleri\n8-) Çıkış");
        return klavye.nextLine();
    }

    //login
    @Override
    public boolean isLogin() {
        Scanner klavye = new Scanner(System.in);
        // login false
        boolean result = false;
        String userName = "", userPassword = "", passwordMask = "";

        //database geldi
        String dbUser = RegisterStaticData.USERNAME;
        String dbPassword = RegisterStaticData.PASSWORD;

        //4 hak verelim.
        int attempt = 4;
        while (attempt >= 0) {
            System.out.println("\nLütfen Kullanıcı adını giriniz");
            userName = klavye.nextLine();
            //boşlukları aldım
            userName = userName.trim();

            System.out.println("\nLütfen Kullanıcı Şifresini giriniz");
            userPassword = klavye.nextLine().trim();

            //masking
            for (int i = 0; i < userPassword.length(); i++) {
                passwordMask += "*";
            }
            System.out.println("Şifrenizin maskelenmiş hali: " + passwordMask);
            if (userName.equals(dbUser) && userPassword.equals(dbPassword)) {
                System.out.println("Kullanıcı verileriniz doğrudur");
                result = true;
            } else {
                --attempt;
                System.out.println("username veya password yanlış tekrar giriniz");
                System.out.println("Kalan hakkınız: " + attempt);
                if (attempt == 0) {
                    System.out.println("Hakkınız kalmadı Kartınız bloke oldu Müşteri hizmetrelini aramak ister misiniz ? 111 222 3344");
                    break;
                }
            }
        } //end attempt
        return result;
    }//end isLogin

    //para ekle
    @Override
    public void addMoney() {

    }

    //para göster
    @Override
    public void showMoney() {

    }

    //para çek
    @Override
    public void reduceMoney() {

    }

    //Havale gönder
    @Override
    public void sendTransactionMoney() {

    }

    //Eft Gönder
    @Override
    public void sendEFTMoney() {

    }

    //Mail Gönder
    @Override
    public void mailSend(String emailAddress) {

    }
}

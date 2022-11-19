package dev.project.atm.controller;

import dev.project.atm.util.IAtm;
import dev.project.atm.util.RegisterStaticData;

import java.io.Serializable;
import java.util.Scanner;

public class BankBranchController implements IAtm, Serializable {

    // serialVersionUID
    public static final long serialVersionUID = 1L;

    //Metotlar
    @Override
    public int userScannerValue() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen seçim yapınız");
        System.out.println("1-)Para Görüntüle\n2-)Para Yatır\n3-)Para çek\n4-)Eft Gönder" +
                "\5-)Havale Gönder\6-)Mail Gönder\7-)Müşteri Hizmetleri\n8-) Çıkış");
        return klavye.nextInt();
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

    @Override
    public void register() {
        //register işlemleri
        System.out.println("Regsiter sayfası");

        //
        allProcess();
    }

    @Override
    public void allProcess() {
        if (isLogin()) {
            int userValue = userScannerValue();
            switch (userValue) {
                case 1:
                    System.out.println("\n### Para Görüntüle ###");
                    showMoney();
                    break;
                case 2:
                    System.out.println("\n### Para Yatır ###");
                    addMoney();
                    break;
                case 3:
                    System.out.println("\n### Para Çek ###");
                    reduceMoney();
                    break;
                case 4:
                    System.out.println("\n### EFT ###");
                    sendEFTMoney();
                    break;
                case 5:
                    System.out.println("\n### Havale ###");
                    sendTransactionMoney();
                    break;
                case 6:
                    System.out.println("\n### Mail Gönder ###");
                    Scanner klavye=new Scanner(System.in);
                    System.out.println("Mail adresinizi giriniz");
                    String mailAddress=klavye.nextLine();
                    mailSend(mailAddress);
                    break;
                case 7:
                    System.out.println("\n### Müşteri Hizmetleri ###");
                    break;
                case 8:
                    System.out.println("\n### ÇIKIŞ ###");
                    showMoney();
                    break;
            }

        } else {
            System.out.println("Öncelikle Register olmalısınız");
            register();
        }
    }


    //para ekle
    @Override
    public void addMoney() {

    }//addMoney

    //para göster
    @Override
    public void showMoney() {

    }//showMoney

    //para çek
    @Override
    public void reduceMoney() {

    }// end reduceMoney

    //Havale gönder
    @Override
    public void sendTransactionMoney() {

    } //end sendTransactionMoney

    //Eft Gönder
    @Override
    public void sendEFTMoney() {

    } //sendEFTMoney

    //Mail Gönder
    @Override
    public void mailSend(String emailAddress) {
        System.out.println("Mailiniz Gönderildi ...");
    } //end mailSend

    @Override
    public void logout(){
        System.exit(0);
    }
}

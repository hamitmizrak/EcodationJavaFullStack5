package dev.project.atm.controller;

import dev.project.atm.dao.BankBranchDao;
import dev.project.atm.dto.SafeDto;
import dev.project.atm.utils.IAtm;
import dev.project.atm.utils.RegisterStaticData;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;

public class BankBranchController implements IAtm, Serializable {

    // serialVersionUID
    public static final long serialVersionUID = 1L;

    private BankBranchDao bankBranchDao;
    private SafeDto safeDto;

    private static final String URL = "C:\\io\\ecodation\\safe.txt";

    //parametresiz constructor
    public BankBranchController() {
        bankBranchDao = new BankBranchDao();
        safeDto = new SafeDto();
    }
    //Metotlar

    private void safeFileWriter(SafeDto safeDto) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(URL, true))) {
            bufferedWriter.write(new Date(System.currentTimeMillis()) + " " + safeDto + "\n");
            bufferedWriter.flush();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
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

            //contional Login
            if (userName.equals(dbUser) && userPassword.equals(dbPassword)) {
                System.out.println("Kullanıcı verileriniz doğrudur");
                result = true;
            } else {
                --attempt;
                System.out.println("username veya password yanlış tekrar giriniz");
                System.out.println("Kalan hakkınız: " + attempt);
                if (attempt == 0) {
                    System.out.println("Hakkınız kalmadı Kartınız bloke oldu Müşteri hizmetrelini aramak ister misiniz ? 111 222 3344");
                    logout();
                    //break;
                }
            }
        } //end attempt
        return result;
    }//end isLogin

    // REGISTER
    @Override
    public void register() {
        //register işlemleri
        System.out.println("Register sayfası");

        //regsiter işleminden sonrasında tekrar Bütün metotlara gitsin
        allProcess();
    }

    //user data Scanner
    @Override
    public int userScannerValue() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("\nLütfen seçim yapınız");
        System.out.println("1-)Para Görüntüle\n2-)Para Yatır\n3-)Para çek\n4-)Eft Gönder" +
                "\n5-)Havale Gönder\n6-)Mail Gönder\n7-)Müşteri Hizmetleri\n8-) Çıkış");
        return klavye.nextInt();
    }

    // ###############################################################################################################
    // ###############################################################################################################

    // BÜTÜN METOTLAR
    @Override
    public void allProcess() {
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
                Scanner klavye = new Scanner(System.in);
                System.out.println("Mail adresinizi giriniz");
                String mailAddress = klavye.nextLine();
                mailSend(mailAddress);
                break;
            case 7:
                System.out.println("\n### Müşteri Hizmetleri ###");
                break;
            case 8:
                System.out.println("\n### ÇIKIŞ ###");
                logout();
                break;
        } //end switch

       /* if (isLogin()) {
        } else {
            System.out.println("Öncelikle Register olmalısınız");
            register();
        }*/
    }


    //para ekle
    @Override
    public void addMoney() {
        Scanner klavye = new Scanner(System.in);
        String moneyType, moneyCurrency;
        int moneyAmount;

        System.out.println("para türünü giriniz");
        moneyType = klavye.nextLine();
        System.out.println("para birimi giriniz");
        moneyCurrency = klavye.nextLine();
        System.out.println("miktar giriniz");
        moneyAmount = klavye.nextInt();

        SafeDto safeDto = new SafeDto();
        safeDto.setMoneyAmount(moneyAmount);
        safeDto.setMoneyType(moneyType);
        safeDto.setMoneyCurrency(moneyCurrency);
        bankBranchDao.create(safeDto);

        safeFileWriter(safeDto);

        //Database
    }//addMoney

    //para göster
    @Override
    public void showMoney() {
        //Database
        System.out.println("Toplam Para: " + bankBranchDao.sumAmount());
        bankBranchDao.list();
    }// end showMoney

    //para çek
    @Override
    public void reduceMoney() {
        //Dikkat:
        // 1-) negatif sayı vermezsiniz ?
        // 2-) Toplam miktardan büyük para çekemeyiz ?
        // 3-) Günlük çekme miktarı en fazla 5000TL olabilir.
        Scanner klavye = new Scanner(System.in);
        showMoney();
        System.out.println("Hangi hesabınızdaki id ile para çekeceksiniz");
        long id = klavye.nextLong();

        System.out.println("çekilecek para miktar giriniz");
        double moneyAmount = klavye.nextDouble();
       /* if(moneyAmount<0){

        }else if(){

        }else if(){

        }*/

        SafeDto safeDto = new SafeDto();
        safeDto.setId(id);
        safeDto.setMoneyAmount(moneyAmount);
        safeDto.setMoneyType("tr");
        safeDto.setMoneyCurrency("tr");
        bankBranchDao.update(safeDto);

        //Ödev ? delete ile yapalım ?
        System.out.println("Kalan Toplam Para: " + bankBranchDao.sumAmount());
    }// end reduceMoney

    //Havale gönder
    @Override
    public void sendTransactionMoney() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("gönderilecek havale miktarını giriniz");
        int moneyAmount = klavye.nextInt();
        //Database
    } // end sendTransactionMoney

    //Eft Gönder
    @Override
    public void sendEFTMoney() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("gönderilecek eft miktarını giriniz");
        int moneyAmount = klavye.nextInt();
        //Database
    } //sendEFTMoney

    //Mail Gönder
    @Override
    public void mailSend(String emailAddress) {
        System.out.println("Mailiniz Gönderildi ...");
    } //end mailSend

    //LOGOUT
    @Override
    public void logout() {
        System.exit(0);
    }
}

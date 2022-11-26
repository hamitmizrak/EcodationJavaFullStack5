package atm.controller;



import atm.dao.BankBranchDao;
import atm.dto.SafeDto;
import atm.util.IAtm;
import atm.util.RegisterStaticData;

import java.io.*;
import java.util.Scanner;

public class BankBranchController implements IAtm, Serializable {
    // login-register active
    // transaction (Database)
    // composition nedir ?
    // Mail Göndermek

    // serialVersionUID
    public static final long serialVersionUID = 1L;

    //URL
    private static final String URL = "C:\\io\\ecodation\\safe.txt";

    //field
    private BankBranchDao bankBranchDao;
    private SafeDto safeDto;

    //parametresiz constructor
    public BankBranchController() {
        bankBranchDao = new BankBranchDao();
        safeDto = new SafeDto();
    }

    //FILE WRITER
    private void safeFileWriter(SafeDto safeDto) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(URL, false))) {
            bufferedWriter.write(safeDto + "\n");
            bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //FILE READER
    private void safeFileReader() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(URL))) {
            StringBuilder stringBuilder = new StringBuilder();
            String okunan = "", satir = "";
            while ((satir = bufferedReader.readLine()) != null) {
                stringBuilder.append(satir);
            }
            System.out.println("Toplam para: " + stringBuilder.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Metotlar
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
                return result;
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
                "\n5-)Havale Gönder\n6-)Mail Gönder\n7-)Müşteri Hizmetleri\n8-)Toplam Miktar\n9-)Çıkış");
        return klavye.nextInt();
    }

    // ###############################################################################################################
    // ###############################################################################################################

    //DECISION
    public void decision() {

            if (isLogin()) {
                while (true) {
                    allProcess();
                }
            } else {
                System.out.println("Öncelikle Register olmalısınız");
                register();
            }
    }

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
                customerService();
                break;
            case 8:
                System.out.println("\n### TOPLAM###");
                sumAmountSafe();
                break;
            case 9:
                System.out.println("\n### ÇIKIŞ ###");
                logout();
                break;
        } //end switch
    }

    //customerService
    private void customerService() {
        System.out.println("\n### Müşteri Hizmetleri ###");
    }

    //Toplam para
    private void sumAmountSafe() {
        bankBranchDao.sumAmount();
    }

    //para ekle
    @Override
    public void addMoney() {
        Scanner klavye = new Scanner(System.in);
        String moneyType, moneyCurrency;
        double moneyAmount;

        System.out.println("para türünü giriniz");
        moneyType = klavye.nextLine();

        System.out.println("para birimi giriniz");
        moneyCurrency = klavye.nextLine();

        System.out.println("para tutarı giriniz");
        moneyAmount = Math.abs(klavye.nextDouble());

        safeDto.setMoneyAmount(moneyAmount);
        safeDto.setMoneyType(moneyType);
        safeDto.setMoneyCurrency(moneyCurrency);
        bankBranchDao.create(safeDto);
        safeFileWriter(safeDto);
        showMoney();
    }//addMoney

    //para göster
    @Override
    public void showMoney() {
        bankBranchDao.sumAmount();
        bankBranchDao.list();
        //FileReader
        safeFileReader();
    }// end showMoney

    //para çekmek, EFT, Havale
    public void reduceCommonMoney(String data) {
        Scanner klavye = new Scanner(System.in);
        double moneyAmount, sumAmount, specialSafeId;
        showMoney();
        System.out.println(data + " işlemi");
        System.out.println("Hangi id hesabınızdan işlem yapacaksınız ?");
        long id = klavye.nextInt();
        System.out.println("Miktar  ?");
        moneyAmount = klavye.nextDouble();

        safeDto.setId(id);
        sumAmount = bankBranchDao.safeSpecialIdsumAmount(id);
        //id olan parası
        specialSafeId = sumAmount - moneyAmount;

        //1-) negatif sayı giremeyiz
        if (moneyAmount < 0) {
            System.out.println("Negatif sayı giremezsiniz");
            reduceMoney();
            //2-) günlük en fazla 5000TL çekilebilir.
        } else if (moneyAmount > 5000) {
            System.out.println("5000TL üstünü çekemezsiniz");
            reduceMoney();
        }
        //else if eğer bizim çekeceğimiz miktar toplam paradan büyükse

        //3-) Toplam paradan fazla çekemeyiz.
        if (moneyAmount > sumAmount) {
            System.out.println("Toplam paranız: " + sumAmount + " üstünde bir rakam çekemeyiz");
            reduceMoney();
        }

        //Toplam Miktar
        //sumAmount=bankBranchDao.sumAmount();
        //sumAmount=sumAmount-moneyAmount;
        safeDto.setMoneyAmount(specialSafeId);
        bankBranchDao.update(safeDto);
        safeFileWriter(safeDto);
        showMoney();
    }

    //para çek
    @Override
    public void reduceMoney() {
        reduceCommonMoney("para çekmek");
    }// end reduceMoney

    //Havale gönder
    @Override
    public void sendTransactionMoney() {
        reduceCommonMoney("Havale");
    } // end sendTransactionMoney

    //Eft Gönder
    @Override
    public void sendEFTMoney() {
        reduceCommonMoney("EFT");
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

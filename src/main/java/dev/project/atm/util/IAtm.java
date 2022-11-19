package dev.project.atm.util;

// interface [ Access-Modifier(public-friendly) ve static field verebiliriz. )
// Dummy Code: interface kullanmayacağız başka classlara implement edeceğimiz gövdesiz metotlardır.
public interface IAtm {

    //user data
    int userScannerValue();

    //login
    boolean isLogin();

    //register
    void register();

    // bütün metotlar
    void allProcess();

    // para ekle
     void addMoney();

    // para görüntüle
     void showMoney();

    // para çekmek
     void reduceMoney();

    // Havale yapmak
     void sendTransactionMoney();

    // EFT yapmak
     void sendEFTMoney();

    // Mail Göndermek
     void mailSend(String emailAddress);

     //logout
    void logout();
}

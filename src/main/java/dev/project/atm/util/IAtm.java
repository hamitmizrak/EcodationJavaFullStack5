package dev.project.atm.util;

// interface [ Access-Modifier(public-friendly) ve static field verebiliriz. )
// NOT: interface Java8 beraber gövdeli metotda yazabiliyoruz.
// Dummy Code : interface kullanmayacağız başka classlara implement edeceğimiz gövdesiz metotlardır.
public interface IAtm {
    //login
    boolean isLogin();

    //register
    void register();

    //user data
    int userScannerValue();

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


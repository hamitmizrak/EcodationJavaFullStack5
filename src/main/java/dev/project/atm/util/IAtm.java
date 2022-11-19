package dev.project.atm.util;

// interface [ Access-Modifier(public-friendly) ve static field verebiliriz. )
// Dummy Code: interface kullanmayacağız başka classlara implement edeceğimiz gövdesiz metotlardır.
public interface IAtm {

    //login
    boolean isLogin();

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
}

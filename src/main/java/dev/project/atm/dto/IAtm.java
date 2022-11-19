package dev.project.atm.dto;

// interface [ Access-Modifier(public-friendly) ve static field verebiliriz. )
// Dummy Code: interface kullanmayacağız başka classlara implement edeceğimiz gövdesiz metotlardır.
public interface IAtm {

    // para ekle
    public void addMoney();

    // para görüntüle
    public void showMoney();

    // para çekmek
    public void reduceMoney();

    // Havale yapmak
    public void sendTransactionMoney();

    // EFT yapmak
    public void sendEFTMoney();

    // Mail Göndermek
    public void mailSend(String emailAddress);
}

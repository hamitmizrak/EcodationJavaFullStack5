package tutorials.io;

public class Description {

    // step.1 -) form.txt dosyasını default olarak oluştururmamız gerekiyor ?

    // step.2 -) Roller belirliyoruz (D=sil(Delete),W=yazmak(Write) R=okumak(Read)
    // kişi adminse direk rol değiştirebilir, eğer kişi Writer ise username ve password girdikten sonra değiştireebilir ancak user değiştiremez)
    // 1-)ADMIN(D+,W+,R+)  2-)WRITER(D-,W+,R+)  3-)USER(D-, W- ,R+) d=delete w=write r=read

    // step.3 -) Sonrasında ekranda Seçim için
    // ### SEÇIM YAPINIZ ###
    // 1-) Dosya oluştur
    // 2-) Dosya Sil
    // 3-) Dosya  Bilgileri
    // 4-) Dosya Rol Değiştir (ancak)
    // 5-) Rol  bilgisi
    // 6-) Bütün Dosyalar
    // 7-) YAZMAK
    // 8-) OKUMAK
    // 9-) ÇIKIŞ YAP

    // step.4 -) File için CRUD işlemi yapacak bir algoritma yapınız ?

    // step.5 -) oluşturulan her bir dosyaya enum ile
    // ADMIN(yazma,okuma,oluşturmadır),WRITER(yazma veokumadaır),USER(okumak)
    // rollerini en sola yazalım ==> ADMIN 30/Haziran/2022 12:26:01 yazdım.

    // step.6 -) Bir Dosya okuyacak başka bir dosyaya verileri yazacak ( Object)

    // step.7 -) Bu projemiz şunuda yapsın ?
    // person.txt ve homework.txt diye bir dosyamız olsun bu dosyalar
    // person.txt dosyasında ==> kişi ismi ve soyisimi olacak
    // homework.txt dosyasında ==> verilecek ödevler olacak
    // Bilgisayar random olarak kişiye ödev verecek
}

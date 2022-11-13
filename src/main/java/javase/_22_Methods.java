package javase;

//Method: kendimizi tekrar yapmamak , aynı kodları yazmamak için düzenli kod blokları görmek için oluştururuz.
// AP:aynı paket  FP:farklı paket
// AC:aynı class  FC:farklı class
// SC:subClass
//               AP  FP   AC  FC SC
// public    =>  +   +    +   +  +
// protected =>  +  -/+?  +   +  +
// private   =>  -   -    +   -  -
// -         =>  +   -    +   +  -
public class _22_Methods {

    //void
    public static void voidParametresiz() {
        System.out.println("voidli Parametresiz");
    }

    //Overloading: aşırı yüklemek
    public static void voidParametreli(String adi, int sayi) { //parametre
        System.out.println("voidli Parametreli " + adi + " sayı: " + sayi);
    }

    private static void voidParametreli(String adi) { //parametre
        System.out.println("voidli Parametreli " + adi);
    }

    //return
    static String voidsizParametresiz() {
        return "voidsiz Parametresiz";
    }

    static String voidsizParametreli(String data) {
        return "voidsiz Parametreli "+data;
    }

    public static void main(String[] args) {
        // voidParametresiz();
        //voidParametreli("Yusuf",23); //argüman
        //voidParametreli("Yusuf"); //argüman

        //String result1 = voidsizParametresiz();
        //System.out.println(result1);

        String result2 = voidsizParametreli("Ankara");
        System.out.println(result2);
    }
}

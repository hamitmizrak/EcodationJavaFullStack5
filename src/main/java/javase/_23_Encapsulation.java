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
public class _23_Encapsulation {

    private String data="Kalem";

    //okumak
    public String getData() {
        return data;
    }

    //yazmak
    public void setData(String data) {
        this.data = data;
    }

    public static void main(String[] args) {
        //instance
        _23_Encapsulation encapsulation=new _23_Encapsulation();
        System.out.println(encapsulation.getData());
    }
}

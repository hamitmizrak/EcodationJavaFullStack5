package com.hamitmizrak.javase;

// Haftanın günlerini Enum ile oluşturalım
// Haftanın günlerinin ilk 3 karakteri gösterelim
// eğer 3 karakter sonra harf varsa , o harf sayısı kadar yıldız(*) koyalım
// examples: PAZ******
// ipucu: length-3 =5(FOR) concat(*)


public enum _27_Enum {
PAZARTESI,SALI,CARSAMBA,PERSEMBE,CUMA,CUMARTESI,PAZAR
}

//SOLID
 class EnumTutorials{
    public static void main(String[] args) {
        System.out.println(_27_Enum.PAZARTESI);
        System.out.println(_27_Enum.PAZARTESI.toString().substring(0,6).concat("...."));
        System.out.println(_27_Enum.SALI.ordinal());
        System.out.println(_27_Enum.values()[1]);
        String weekDayIn=_27_Enum.PERSEMBE.toString();
    }
}


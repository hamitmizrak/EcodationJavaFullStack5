package javase;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class _18_Date {
    // Date
    // Calendar
    // DateTime
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);

        //GETTER
        //günlerden pazar sıfırdan başlar
        System.out.println(date.getDay());
        //aylar  sıfırdan başlar
        System.out.println(date.getMonth());
        System.out.println(date.getHours());
        System.out.println(date.getMinutes());
        System.out.println(date.getSeconds());
        System.out.println(date.getYear()+1900);
        System.out.println(date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());
        ///////////////////////////////////////

        //currentTimeMillis: 1 ocak 1970 yılından şimdiye kadar geçen milisaniye
        //1000ms=1sn
        long nowMs=System.currentTimeMillis();
        System.out.println(nowMs);
        System.out.println(new Date(nowMs));
        System.out.println("***************************");
        ///////////////////////////////////////

        //SETTER
        Date date2=new Date();
        System.out.println(date2.getMonth());
        //aylar: 0<=AY<=11
        //günler 0<=GÜN<=6
        date2.setMonth(0);
        System.out.println(date2.getMonth());


        ///////////////////////////////////////

        //LOCALE pattern
        Locale locale=new Locale("tr","TR");
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss",locale);
        Date date3=new Date();
        String turkisTime1=simpleDateFormat.format(date3);
        System.out.println(turkisTime1);

        //LOCALE short pattern
        String turkisTime2=new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss", new Locale("tr","TR")).
                format(new Date());
        System.out.println(turkisTime2);

        System.out.println(new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss", new Locale("tr","TR")).
                format(new Date()));

    }

}

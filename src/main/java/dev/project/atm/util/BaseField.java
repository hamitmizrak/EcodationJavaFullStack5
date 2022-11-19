package dev.project.atm.util;

import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

//lombok
@Data
abstract public class BaseField {
    //field
    protected Long id;
    protected String date;

    // constructorda: overloading yaptık
    //parametresiz constructor
    public BaseField() {
        date=getNowDate();
    }

    //parametreli constructor
    public BaseField(Long id) {
        this.id = id;
        date=getNowDate();
    }

    // now date
    public String getNowDate(){
        Locale locale=new Locale("tr","TR");
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss",locale);
        Date date1=new Date();
        String format=simpleDateFormat.format(date1);
        return format;
    }
}

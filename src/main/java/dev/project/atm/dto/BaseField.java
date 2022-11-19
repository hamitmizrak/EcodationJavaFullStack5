package dev.project.atm.dto;

import lombok.Data;

import java.util.Date;

//lombok
@Data
abstract public class BaseField {
    //field
    private Long id;
    private Date date;

    //parametresiz constructor
    public BaseField() {
    }

    //parametreli constructor
    public BaseField(Long id, Date date) {
        this.id = id;
        this.date = date;
    }
}

package dev.project.atm.dto;

//İmportant:
// Classlarda sadece 1 tane public vardır.
// Javada classlarda sadece 1 tane extends kullanabilirsiniz.

import dev.project.atm.utils.BaseField;
import lombok.Data;

//lombok
@Data
public class EftDto extends BaseField {

    //Field
    private String eftName;
    private String eftAmount;

    //parametresiz constructor
    public EftDto() {
    }

    //parametresiz constructor
    public EftDto(Long id, String eftName, String eftAmount) {
        super(id);
        this.eftName=eftName;
        this.eftAmount=eftAmount;
    }

    //toString


    @Override
    public String toString() {
        return "EftDto{" +
                "eftName='" + eftName + '\'' +
                ", eftAmount='" + eftAmount + '\'' +
                ", id=" + id +
                ", date='" + date + '\'' +
                "} " + super.toString();
    }

    //my special diffent codes
    public void specialCode(){
        System.out.println(new EftDto().hashCode());
    }
}

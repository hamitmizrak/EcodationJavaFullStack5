package dev.project.atm.dto;

//İmportant:
// Classlarda sadece 1 tane public vardır.
// Javada classlarda sadece 1 tane extends kullanabilirsiniz.

import lombok.Data;

//lombok
@Data
public class TransactionDto extends BaseField {

    //Field
    private String transactionName;
    private String transactionAmount;

    //parametresiz constructor
    public TransactionDto() {
    }

    //parametreli constructor
    public TransactionDto(Long id, String transactionName, String transactionAmount) {
        super(id);
        this.transactionName=transactionName;
        this.transactionAmount=transactionAmount;
    }

    //toString


    @Override
    public String toString() {
        return "TransactionDto{" +
                "transactionName='" + transactionName + '\'' +
                ", transactionAmount='" + transactionAmount + '\'' +
                ", id=" + id +
                ", date='" + date + '\'' +
                "} " + super.toString();
    }

    //my special diffent codes
    public void specialCode(){
        System.out.println(new TransactionDto().hashCode());
    }
}

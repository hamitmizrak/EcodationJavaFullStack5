package tutorials.atm.dto;

import tutorials.atm.util.BaseField;
import lombok.Data;

//lombok
@Data
public class SafeDto extends BaseField {

    //field
    //para türü; kağıt para, bozuk para
    private String moneyType;
    // para birimi
    private String moneyCurrency;
    //para miktarı
    private double moneyAmount;

    //parametresiz constructor
    public SafeDto() {
        this.moneyAmount=0.0;
    }

    //parametreli constructor
    public SafeDto(Long id, String moneyType, String moneyCurrency, double moneyAmount) {
        super(id);
        this.moneyType = moneyType;
        this.moneyCurrency = moneyCurrency;
        this.moneyAmount = moneyAmount;
    }

    //toString
    @Override
    public String toString() {
        return "SafeDto{" +
                "moneyType='" + moneyType + '\'' +
                ", moneyCurrency='" + moneyCurrency + '\'' +
                ", moneyAmount=" + moneyAmount +
                ", id=" + id +
                ", date='" + date + '\'' +
                "} " + super.toString();
    }
}

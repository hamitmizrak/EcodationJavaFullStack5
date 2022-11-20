package dev.project.atm.dto;


// Merkez: CenterBankDto(1)  - Şubeler BankBranchDto(N)

import dev.project.atm.utils.BaseField;
import lombok.Data;

//lombok
@Data
public class CenterBankDto extends BaseField {

    //field
    private String centerBankName;
    private String centerCityName;
    private String centerCityLogo;
    private boolean bankCheck=false;

    //composition

    //parametresiz constructor
    public CenterBankDto() {
        this.centerBankName="bank adını girmediniz";
        this.centerCityName="bank şehir adını girmediniz";
        this.centerCityLogo="bank logosunu girmediniz";
        this.bankCheck=false;
    }

    //parametreli constructor
    public CenterBankDto(Long id, String centerBankName, String centerCityName, String centerCityLogo,boolean bankCheck) {
        super(id);
        this.centerBankName = centerBankName;
        this.centerCityName = centerCityName;
        this.centerCityLogo = centerCityLogo;
        this.bankCheck = bankCheck;
    }

    //toString
    @Override
    public String toString() {
        return "CenterBankDto{" +
                "check BankName='" + bankCheck + '\'' +
                "centerBankName='" + centerBankName + '\'' +
                ", centerCityName='" + centerCityName + '\'' +
                ", centerCityLogo='" + centerCityLogo + '\'' +
                ", id=" + id +
                ", date='" + date + '\'' +
                "} " + super.toString();
    }
}

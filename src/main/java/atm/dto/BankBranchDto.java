package atm.dto;
// Merkez: CenterBankDto(1)  - Şubeler BankBranchDto(N)

import atm.util.BaseField;
import lombok.Data;
import java.util.List;
//S-OLID
//lombok
@Data
public class BankBranchDto  extends BaseField {

    //field
    private String branchBankName;
    private String branchCityName;
    private String branchCityLogo;

    //bank Eft class
    private List<EftDto> bankEftList;
    private List<TransactionDto> bankTransactionList;

    //composition

    //parametresiz constructor
    public BankBranchDto() {}

    //parametreli constructor
    public BankBranchDto(Long id, String branchBankName, String branchCityName, String branchCityLogo) {
        super(id);
        this.branchBankName = branchBankName;
        this.branchCityName = branchCityName;
        this.branchCityLogo = branchCityLogo;
    }

    @Override
    public String toString() {
        return "BankBranchDto{" +
                "branchBankName='" + branchBankName + '\'' +
                ", branchCityName='" + branchCityName + '\'' +
                ", branchCityLogo='" + branchCityLogo + '\'' +
                ", id=" + id +
                ", date='" + date + '\'' +
                "} " + super.toString();
    }
}

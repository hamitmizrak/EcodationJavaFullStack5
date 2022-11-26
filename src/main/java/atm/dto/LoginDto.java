package atm.dto;

import atm.util.BaseField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class LoginDto extends BaseField {

    //field
    private String emailAddress;
    private String password;

    //parametresiz constructor
    public LoginDto() {}

    //parametreli constructor
    public LoginDto(Long id, String emailAddress, String password) {
        super(id);
        this.emailAddress = emailAddress;
        this.password = password;
    }

    //toString
    @Override
    public String toString() {
        return "LoginDto{" +
                "emailAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                ", date='" + date + '\'' +
                "} " + super.toString();
    }
}

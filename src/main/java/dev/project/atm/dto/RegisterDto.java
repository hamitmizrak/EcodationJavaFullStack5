package dev.project.atm.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterDto extends  BaseField{

    //field
    private String username;
    private String password;
    private String telephoneNumber;
    private String emailAddress;

    //parametresiz constructor
    public RegisterDto() {
    }

    //parametreli constructor
    public RegisterDto(Long id, String username, String password, String telephoneNumber, String emailAddress) {
        super(id);
        this.username = username;
        this.password = password;
        this.telephoneNumber = telephoneNumber;
        this.emailAddress = emailAddress;
    }

    //toString

    @Override
    public String toString() {
        return "RegisterDto{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", id=" + id +
                ", date='" + date + '\'' +
                "} " + super.toString();
    }
}

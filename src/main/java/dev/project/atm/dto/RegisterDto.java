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
}

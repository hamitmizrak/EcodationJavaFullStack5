package com.hamitmizrak.business.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
//@SneakyThrows
//@RequiredArgsConstructor
public class RegisterDto {

    private Long id;

    @NotEmpty(message = "{register.name.validation.constraints.NotNull.message}")
    private String name;

    @NotEmpty(message = "{register.surname.validation.constraints.NotNull.message}")
    private String surname;

    @NotEmpty(message = "{register.email.validation.constraints.NotNull.message}")
    @Email(message = "email doğru formatta girmediniz")
    private String emailAddress;

    @NotEmpty(message = "{register.password.validation.constraints.NotNull.message}")
    @Size(min=7,max=20,message = "Şifre en az 7 en fazla 20 olmalıdır.")
    private String password;

    private Date createdDate;
}

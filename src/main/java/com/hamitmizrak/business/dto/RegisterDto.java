package com.hamitmizrak.business.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

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
    private String name;
    private String surname;
    private String emailAddress;
    private String password;
    private Date createdDate;
}

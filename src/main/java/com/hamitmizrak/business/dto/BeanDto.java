package com.hamitmizrak.business.dto;

import lombok.*;
import lombok.extern.log4j.Log4j2;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
//@SneakyThrows
//@RequiredArgsConstructor

public class BeanDto {
    private Long id;
    private String beanName;
    private String beanData;
}

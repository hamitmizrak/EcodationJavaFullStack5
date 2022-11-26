package com.hamitmizrak.bean;

import com.hamitmizrak.business.dto.BeanDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public BeanDto beanDtoMethod(){
        return BeanDto.builder().beanData("bean data44").beanName("bean name44").id(1L).build();
    }
}

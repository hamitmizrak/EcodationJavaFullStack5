package com.hamitmizrak.controller.mvc;

import com.hamitmizrak.bean.BeanConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class BeanMvc {

    //1.YOL Field Injection
    /*
    @Autowired
    BeanConfig beanConfig;
    */

    //2.YOL Constructor Injection
    /*BeanConfig beanConfig;
    @Autowired
    public BeanMvc(BeanConfig beanConfig) {
        this.beanConfig = beanConfig;
    }*/

    //3.YOL (Lombok)
    private final BeanConfig beanConfig;

    // http:localhost:8080/bean/beandto
    @GetMapping("bean/beandto")
    @ResponseBody
    public String getBeanConfigMethod(){
        return beanConfig.beanDtoMethod().toString();
    }
}

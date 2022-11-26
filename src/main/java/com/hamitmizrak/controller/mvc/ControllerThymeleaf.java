package com.hamitmizrak.controller.mvc;

import com.hamitmizrak.business.dto.RegisterDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerThymeleaf {

    // http://localhost:8080/thymeleaf1
    @GetMapping("thymeleaf1")
    @ResponseBody
    public String thymeleaf1(){
        return "Thymeleaf1";
    }

    // http://localhost:8080/thymeleaf2
    @GetMapping("thymeleaf2")
    public String thymeleaf2(){
        return "thymeleaf2";
    }

    // http://localhost:8080/thymeleaf3
    @GetMapping("thymeleaf3")
    public String thymeleaf3(Model model){
        model.addAttribute("key_thymeleaf3","Ben javadan geldim");
        return "thymeleaf3";
    }

    // http://localhost:8080/thymeleaf4
    @GetMapping("thymeleaf4")
    public String thymeleaf4(Model model){
        RegisterDto registerDto=new RegisterDto();
        registerDto.setId(1L);
        registerDto.setName("kullanıcı adı");
        registerDto.setSurname("kullanıcı soyadı");
        registerDto.setPassword("Password");
        registerDto.setEmailAddress("Email@xyz.com");
        model.addAttribute("key_thymeleaf4",registerDto);
        return "thymeleaf4";
    }


}

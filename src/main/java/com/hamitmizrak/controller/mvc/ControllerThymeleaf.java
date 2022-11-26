package com.hamitmizrak.controller.mvc;

import com.hamitmizrak.business.dto.RegisterDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/controller")
public class ControllerThymeleaf {

    // http://localhost:8080/controller/thymeleaf1
    @GetMapping("thymeleaf1")
    @ResponseBody
    public String thymeleaf1(){
        return "Thymeleaf1";
    }

    // http://localhost:8080/controller/thymeleaf2
    @GetMapping("thymeleaf2")
    public String thymeleaf2(){
        return "thymeleaf2";
    }

    // http://localhost:8080/controller/thymeleaf3
    @GetMapping("thymeleaf3")
    public String thymeleaf3(Model model){
        model.addAttribute("key_thymeleaf3","Ben javadan geldim");
        return "thymeleaf3";
    }

    // http://localhost:8080/controller/thymeleaf4
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


    // http://localhost:8080/controller/thymeleaf5
    @GetMapping("thymeleaf5")
    public String thymeleaf5(Model model){
        List<RegisterDto> registerDtoList=new ArrayList<>();
        for (long i = 1; i <=10 ; i++) {
            UUID uuid=UUID.randomUUID();
            registerDtoList.add(RegisterDto.builder()
                    .id(i)
                    .name("adı "+i)
                    .surname("soyadı "+i)
                    .emailAddress("email@"+i)
                    .createdDate(new Date(System.currentTimeMillis()))
                    .password(uuid.toString()).build());
        }
        model.addAttribute("key_thymeleaf5",registerDtoList);
        return "thymeleaf5";
    }

}

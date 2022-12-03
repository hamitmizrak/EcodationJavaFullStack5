package com.hamitmizrak.controller.mvc;

import com.hamitmizrak.business.dto.RegisterDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/controller")
public class ControllerThymeleaf {

    // http://localhost:8080/thymeleaf1
    @GetMapping("thymeleaf1")
    @ResponseBody
    public String thymeleaf1() {
        return "Thymeleaf1";
    }

    // http://localhost:8080/controller/thymeleaf2
    @GetMapping("thymeleaf2")
    public String thymeleaf2() {
        return "thymeleaf2";
    }

    // http://localhost:8080/controller/thymeleaf3
    @GetMapping("thymeleaf3")
    public String thymeleaf3(Model model) {
        model.addAttribute("key_thymeleaf3", "Ben javadan geldim");
        return "thymeleaf3";
    }

    // http://localhost:8080/controller/thymeleaf4
    @GetMapping("thymeleaf4")
    public String thymeleaf4(Model model) {
        RegisterDto registerDto = new RegisterDto();
        registerDto.setId(1L);
        registerDto.setName("kullanıcı adı");
        registerDto.setSurname("kullanıcı soyadı");
        registerDto.setRegisterPassword("Password");
        registerDto.setEmailAddress("Email@xyz.com");
        model.addAttribute("key_thymeleaf4", registerDto);
        return "thymeleaf4";
    }


    // http://localhost:8080/controller/thymeleaf5
    @GetMapping("thymeleaf5")
    public String thymeleaf5(Model model) {
        List<RegisterDto> registerDtoList = new ArrayList<>();
        for (long i = 1; i <= 10; i++) {
            UUID uuid = UUID.randomUUID();
            registerDtoList.add(RegisterDto.builder()
                    .id(i)
                    .name("adı " + i)
                    .surname("soyadı " + i)
                    .emailAddress("email@" + i)
                    .createdDate(new Date(System.currentTimeMillis()))
                    .registerPassword(uuid.toString()).build());
        }
        model.addAttribute("key_thymeleaf5", registerDtoList);
        return "thymeleaf5";
    }


    // http://localhost:8080/controller/thymeleaf6
    // http://localhost:8080/controller/thymeleaf6/1/soyadı4452
    @GetMapping({"thymeleaf6", "thymeleaf6/{id}", "thymeleaf6/{surname}", "thymeleaf6/{id}/{surname}"})
    public String thymeleaf6(
            @PathVariable(name = "id", required = false) Long id,
            @PathVariable(name = "surname", required = false) String surName,
            Model model) {
        RegisterDto registerDto = RegisterDto.builder()
                .id(id)
                .name("kullanıcı adı44")
                .surname(surName)
                .registerPassword("Password")
                .emailAddress("Email44@xyz.com")
                .build();
        model.addAttribute("key_thymeleaf6", registerDto);
        return "thymeleaf6";
    }


    // http://localhost:8080/controller/thymeleaf7
    // http://localhost:8080/controller/thymeleaf7/1
    @GetMapping({"/thymeleaf7","/thymeleaf7/{id}"})
    public String thymeleaf7( @PathVariable(name = "id",required = false) Long id, Model model) {
        if (id == null) {
            System.out.println("not found");
            model.addAttribute("key_thymeleaf7", "not found");

        } else if (id == 0) {
            System.out.println("bad request");
            model.addAttribute("key_thymeleaf7", "bad request");
        }else{
            RegisterDto registerDto = RegisterDto.builder()
                    .id(id)
                    .name("kullanıcı adı44")
                    .surname("soyadı 44")
                    .registerPassword("Password")
                    .emailAddress("Email44@xyz.com")
                    .build();
            model.addAttribute("key_thymeleaf7", registerDto);
        }
        return "thymeleaf7";
    }


    // http://localhost:8080/controller/thymeleaf8?id=44
    @GetMapping("thymeleaf8")
    public String thymeleaf8(@RequestParam(name = "id") Long id, Model model) {
        RegisterDto registerDto = RegisterDto.builder()
                .id(id)
                .name("kullanıcı adı44")
                .surname("kullanıcı soyadı44")
                .registerPassword("Password")
                .emailAddress("Email44@xyz.com")
                .build();
        model.addAttribute("key_thymeleaf8", registerDto);
        return "thymeleaf8";
    }

}

package com.hamitmizrak.controller.mvc;

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

    // http://localhost:8080/thymeleaf2
    @GetMapping("thymeleaf3")
    public String thymeleaf3(Model model){
        model.addAttribute("key_thymeleaf3","Ben javadan geldim");
        return "thymeleaf3";
    }



}

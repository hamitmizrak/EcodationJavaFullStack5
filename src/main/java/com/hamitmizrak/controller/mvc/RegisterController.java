package com.hamitmizrak.controller.mvc;

import com.hamitmizrak.bean.ModelMapperBean;
import com.hamitmizrak.bean.PasswordEncodeBean;
import com.hamitmizrak.business.dto.RegisterDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

//Lombok
@RequiredArgsConstructor
@Log4j2

//Controller
@Controller
@RequestMapping("/controller")
public class RegisterController {

    // Inject
    private final ModelMapperBean modelMapperBean;
    private final PasswordEncodeBean passwordEncodeBean;


    // CREATE
    // http://localhost:8080/controller/register/create
    @GetMapping("/register/create")
    public String validationCreateGetRegister(Model model){
        model.addAttribute("create_register",new RegisterDto());
        return "register/register_create";
    }

    @PostMapping("/register/create")
    public String validationCreatePostRegister(@Valid @ModelAttribute("create_register") RegisterDto registerDto, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            log.error("HATA: "+bindingResult);
            return "register/register_create";
        }
        //DATABASE
        model.addAttribute("register_success","Kullanıcı kayıt edildi"+registerDto);
        log.info("Success: "+registerDto);
        return "redirect:/register/list";
    }

    /*
    {
    "name":null,
    "surname":null,
    "emailAddress":null,
    "password":null
     }
     */

    // LIST
    // http://localhost:8080/controller/register/list
    @GetMapping("/register/list")
    public String validationListRegister(Model model){
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
        model.addAttribute("list_register",registerDtoList);
        registerDtoList.forEach((temp)-> {
            System.out.println(temp);});
        return "register/register_list";
    }

    // FIND
    // http://localhost:8080/controller/register/find/1
    @GetMapping("register/find/{id}")
    public String validationFindRegister(@PathVariable(name="id") Long id, Model model){
        return "register/register_find";
    }

    //UPDATE
    // http://localhost:8080/controller/register/update/1
    @GetMapping("/register/update/{id}")
    public String validationUpdateGetRegister(@PathVariable(name="id") Long id,   Model model){
       //FILE
        //DATABASE
        return "register/register_update";
    }

    //NOT: Dto ile Binding Result arasına birşey girmesin
    @PostMapping("/register/update/{id}")
    public String validationUpdatePostRegister( @PathVariable(name="id") Long id, @Valid @ModelAttribute("update_register") RegisterDto registerDto, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            log.error("HATA: "+bindingResult);
            return "register/register_create";
        }
        //DATABASE
        model.addAttribute("register_success","Kullanıcı kayıt edildi"+registerDto);
        log.info("Success: "+registerDto);
        return "redirect:/register/list";
    }

    //DELETE
    // http://localhost:8080/controller/register/delete/1
    @GetMapping("register/delete/{id}")
    public String validationDeleteRegister(@PathVariable(name="id",required = false) Long id, Model model){
        return "redirect:/register/list";
    }

}

package com.hamitmizrak.controller.mvc;

import com.hamitmizrak.bean.ModelMapperBean;
import com.hamitmizrak.bean.PasswordEncodeBean;
import com.hamitmizrak.business.dto.RegisterDto;
import com.hamitmizrak.data.entity.RegisterEntity;
import com.hamitmizrak.data.repository.IRegisterRepository;
import com.hamitmizrak.exception.HamitMizrakException;
import com.hamitmizrak.exception.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;

//Lombok
@RequiredArgsConstructor
@Log4j2

//Controller
@Controller
//@RequestMapping("/controller")
public class RegisterController {

    // Inject
    private final ModelMapperBean modelMapperBean;
    private final PasswordEncodeBean passwordEncodeBean;
    private final IRegisterRepository repository;

    //FILE-WRITER / FILE-READER

    //Speed Data Create
    // http://localhost:8080/validation/speeddata
    @GetMapping("/validation/speeddata")
    public String createRegisterSpeedData(Model model) {
        int counter = 1;
        for (long i = 1; i <= 5; i++) {
            UUID uuid = UUID.randomUUID();
            RegisterEntity registerEntity = RegisterEntity.builder()
                    .name("adı " + i)
                    .surname("soyadı " + i)
                    .password(passwordEncodeBean.passwordEncoderMethod().encode(uuid.toString()))
                    .emailAddress(uuid + "@deneme.com")
                    .build();
            repository.save(registerEntity);
            counter++;
        }
        model.addAttribute("key_dataset", counter + " tane veri eklendi");
        return "redirect:/register/list";
    }


    //Speed Data Create
    // http://localhost:8080/validation/speeddata
    @GetMapping("/validation/deletespeeddata")
    public String deleteRegisterSpeedData(Model model) {
            repository.deleteAll();
        model.addAttribute("key_dataset",   "Bütün veriler silindi");
        return "redirect:/register/list";
    }

    // LIST
    // http://localhost:8080/register/list
    @GetMapping("/register/list")
    public String validationListRegister(Model model) {
        Iterable<RegisterEntity> list = repository.findAll();
        model.addAttribute("register_list", list);
        list.forEach((temp) -> {
            System.out.println(temp);
        });
        return "register/register_list";
    }

    // CREATE
    // http://localhost:8080/validation/create
    @GetMapping("/validation/create")
    public String validationCreateGetRegister(Model model) {
        model.addAttribute("key_register_validation", new RegisterDto());
        return "register/register_create";
    }

    @PostMapping("/validation/create")
    public String validationCreatePostRegister(@Valid @ModelAttribute("key_register_validation") RegisterDto registerDto, BindingResult bindingResult, Model model) throws HamitMizrakException {
        if (bindingResult.hasErrors()) {
            log.error("HATA: " + bindingResult);
            return "register/register_create";
        }else{
            //DATABASE
            log.info("Success: " + registerDto);
            registerDto.setPassword(passwordEncodeBean.passwordEncoderMethod().encode(registerDto.getPassword()));
            RegisterEntity registerEntity = modelMapperBean.modelMapperMethod().map(registerDto, RegisterEntity.class);
            if (registerEntity != null){
                repository.save(registerEntity);
                model.addAttribute("register_success", "Kullanıcı kayıt edildi" + registerDto);
            }  else {
                throw new HamitMizrakException("Kayıt eklemenedi");
            }
        }
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


    // FIND - ID   ==> 1.YOL (optional)
    // http://localhost:8080/register/step1/id/1
    // http://localhost:8080/register/step1/id
    @GetMapping({"register/find/step1/{id}", "register/step1/id"})
    public String validationFindStep1Register(@PathVariable(name = "id", required = false) Long id, Model model) {
        Optional<RegisterEntity> findRegister = repository.findById(id);
        if (findRegister.isPresent()) {
            model.addAttribute("register_find", findRegister.get());
        } else {
            model.addAttribute("register_find_not_find", id + " nolu data bulunamadı");
        }
        return "register/register_find";
    }

    // FIND - ID   ==> 2.YOL (orElseThrow)
    // http://localhost:8080/register/step2/id/1
    // http://localhost:8080/register/step2/id
    @GetMapping({"register/find/step2/{id}", "register/step2/id"})
    public String validationFindStep2Register(@PathVariable(name = "id", required = false) Long id, Model model) {
        RegisterEntity findRegister = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id + " register is not data"));
        model.addAttribute("register_find", findRegister);
        return "register/register_find";
    }


    //UPDATE
    // http://localhost:8080/register/update/1
    @GetMapping("/register/update/{id}")
    public String validationUpdateGetRegister(@PathVariable(name = "id") Long id, Model model) {
        //1.YOL
        /*Optional<RegisterEntity> findRegister = repository.findById(id);
        if (findRegister.isPresent()) {
            model.addAttribute("register_update", findRegister.get());
        } else {
            model.addAttribute("register_update", id + " nolu data bulunamadı");
        }*/
        //2.YOL
        RegisterEntity findRegister = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id + " register is not data"));
        if (findRegister != null) {
            model.addAttribute("register_update", findRegister);
        } else {
            model.addAttribute("register_update", id + " nolu data bulunamadı");
        }
        System.out.println(findRegister.getPassword());
        return "register/register_update";
    }

    //NOT: Dto ile Binding Result arasına birşey girmesin
    @PostMapping("/register/update/{id}")
    public String validationUpdatePostRegister(@PathVariable(name = "id") Long id, @Valid @ModelAttribute("register_update") RegisterDto registerDto, BindingResult bindingResult, Model model) throws HamitMizrakException {
        if (bindingResult.hasErrors()) {
            log.error("HATA: " + bindingResult);
        }
        RegisterEntity registerEntity = modelMapperBean.modelMapperMethod().map(registerDto, RegisterEntity.class);
        if (registerEntity != null) {
            log.info("Success: " + registerDto);
            repository.save(registerEntity);
            model.addAttribute("register_success", "Kullanıcı kayıt edildi" + registerDto);
            return "redirect:/register/list";
        }
        //throw new HamitMizrakException("Kayıt eklemenedi");
        return "register/register_update";
    }

    //DELETE
    // http://localhost:8080/register/delete/1
    @GetMapping("register/delete/{id}")
    public String validationDeleteRegister(@PathVariable(name = "id", required = false) Long id, Model model) {
        RegisterEntity registerEntityFind = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id + " id bulunamadı"));
        if (registerEntityFind != null) {
            repository.deleteById(id);
        } else {
            model.addAttribute("register_delete_not_find", id + " nolu data bulunamadı");
        }
        return "redirect:/register/list";
    }

}

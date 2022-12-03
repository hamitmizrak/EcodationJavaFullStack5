package com.hamitmizrak.controller.api;

import com.hamitmizrak.business.dto.AdminDto;
import com.hamitmizrak.business.dto.RegisterDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("admin")
@CrossOrigin
@Log4j2
public class AdminApi {

    // http://localhost:8080/admin/adminDto1
    @GetMapping("/adminDto1")
    public AdminDto adminDto1() {
        return AdminDto.builder().name("adı").surname("soyadı").build();
    }

    // http://localhost:8080/admin/adminDto2
    @GetMapping(value = "/adminDto1", produces = MediaType.APPLICATION_JSON_VALUE)
    public AdminDto adminDto2() {
        return AdminDto.builder().name("adı").surname("soyadı").build();
    }

    // http://localhost:8080/admin/adminDto3
    @GetMapping("adminDto3")
    public List<AdminDto> adminDto3() {
        List<AdminDto> registerDtoList = new ArrayList<>();
        for (long i = 1; i <= 10; i++) {
            UUID uuid = UUID.randomUUID();
            registerDtoList.add(AdminDto.builder()
                    .id(i)
                    .name("adı " + i)
                    .surname("soyadı " + i).build());
        }
        return registerDtoList;
    }

    // http://localhost:8080/admin/adminDto4
    // http://localhost:8080/admin/adminDto4/1
    @GetMapping({"adminDto4", "adminDto4/{id}"})
    public AdminDto adminDto4(@PathVariable(name = "id", required = false) Long id) {
        AdminDto adminDto = null;
        if (id == null) {
            log.error("Null değer verildi");
        } else if (id == 0) {
            log.error("Sıfır değer verildi");
        } else {
            adminDto = AdminDto.builder()
                    .id(id)
                    .name("kullanıcı adı44")
                    .surname("kullanıcı soyadı44")
                    .build();
        }
        return adminDto;
    }


    // http://localhost:8080/admin/adminDto5
    // http://localhost:8080/admin/adminDto5/0
    // http://localhost:8080/admin/adminDto5/1
    @GetMapping({"adminDto5", "adminDto5/{id}"})
    public ResponseEntity<AdminDto>  adminDto5(@PathVariable(name = "id", required = false) Long id) {
        AdminDto adminDto = null;
        if (id == null) {
            log.error("Null değer verildi");
            return ResponseEntity.notFound().build();
        } else if (id == 0) {
            log.error("Sıfır değer verildi");
            return ResponseEntity.badRequest().build();
        } else {
            adminDto = AdminDto.builder()
                    .id(id)
                    .name("kullanıcı adı44")
                    .surname("kullanıcı soyadı44")
                    .build();
        }
        return ResponseEntity.ok(adminDto);
    }

}

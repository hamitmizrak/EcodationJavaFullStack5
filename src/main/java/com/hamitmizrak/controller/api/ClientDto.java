package com.hamitmizrak.controller.api;

import com.hamitmizrak.business.dto.AdminDto;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class ClientDto {

    // http://localhost:8080/client3
    @GetMapping("client3")
    @ResponseBody
    public List<AdminDto> client3() {
        String URL = "http://localhost:8080/admin/adminDto3";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<AdminDto>> responseEntity = restTemplate.exchange(URL, HttpMethod.GET, HttpEntity.EMPTY, new ParameterizedTypeReference<List<AdminDto>>() {});

            List<AdminDto> listData = responseEntity.getBody();
            listData.forEach((temp) -> System.out.println(temp));
            return listData;
        }


    }

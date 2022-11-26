package com.hamitmizrak.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GlobalHandlingException {

    @ExceptionHandler({HamitMizrakException.class})
    public String handlingNotFoundException(){
        return "Böyle bir data yoktur";
    }

    @ExceptionHandler({NullPointerException.class})
    public String handlingNullPointerException(){
        return "Null değer girildi";
    }
}

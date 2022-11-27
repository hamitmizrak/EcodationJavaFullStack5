package com.hamitmizrak.exception;

import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GlobalHandlingException {

    @ExceptionHandler({HamitMizrakException.class})
    public String handlingMySpecialException(){
        return "kendi exception";
    }

    @ExceptionHandler({NullPointerException.class})
    public String handlingNullPointerException(){
        return "Null değer girildi";
    }

    @ExceptionHandler({ChangeSetPersister.NotFoundException.class})
    public String handlingNotFoundException(){
        return "Böyle bir object yoktur";
    }
}

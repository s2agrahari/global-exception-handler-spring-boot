package com.suraj.exceptionhandler.controller;

import com.suraj.exceptionhandler.exception.CustomException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/throw-exception")
    public ResponseEntity throwException(){
        throw new CustomException("My Exception");
    }
}

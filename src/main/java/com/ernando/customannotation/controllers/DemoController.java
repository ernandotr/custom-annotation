package com.ernando.customannotation.controllers;

import com.ernando.customannotation.requests.TestRequest;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("annotation")
public class DemoController {

    @PostMapping
    public String valida(@RequestBody @Validated TestRequest testRequest){
        return "válido";
    }
}

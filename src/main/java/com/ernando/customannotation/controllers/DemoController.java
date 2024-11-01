package com.ernando.customannotation.controllers;

import com.ernando.customannotation.requests.TestRequest;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("annotation")
public class DemoController {

    @PostMapping
    public String validate(@RequestBody @Validated TestRequest testRequest){
        return "Congratulations! The name is valid.";
    }

    @GetMapping
    public String home(){
        return "Welcome!!!";
    }
}

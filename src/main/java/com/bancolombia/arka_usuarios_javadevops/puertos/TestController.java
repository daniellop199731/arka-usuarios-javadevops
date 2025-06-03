package com.bancolombia.arka_usuarios_javadevops.puertos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/hellow")
    public String hellow(@RequestParam String text){
        return "Hellow ".concat(text);
    }

}

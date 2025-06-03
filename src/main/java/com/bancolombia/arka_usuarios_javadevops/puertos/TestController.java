package com.bancolombia.arka_usuarios_javadevops.puertos;

import com.bancolombia.arka_usuarios_javadevops.usecases.interfaces.ITestService;
import com.bancolombia.arka_usuarios_javadevops.utils.ResponseObject;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {

    private final ITestService testService;

    @GetMapping("/hellow")
    public ResponseEntity<ResponseObject> hellow(@RequestParam String text){
        ResponseObject response = testService.hellow(text);
        if(response.isSuccessfully()){
            return new ResponseEntity<>(response, HttpStatus.OK);
        }
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

}

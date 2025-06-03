package com.bancolombia.arka_usuarios_javadevops.usecases;

import com.bancolombia.arka_usuarios_javadevops.usecases.interfaces.ITestService;
import com.bancolombia.arka_usuarios_javadevops.utils.ResponseObject;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Primary
public class TestService2 implements ITestService {

    private static ResponseObject rObj;

    @Override
    public ResponseObject hellow(String text) {
        rObj = new ResponseObject();
        rObj.setAsSuccessfully("Hellow ".concat(text).concat(" !!!"), null);
        return rObj;
    }
}

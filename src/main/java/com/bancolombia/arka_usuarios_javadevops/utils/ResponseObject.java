package com.bancolombia.arka_usuarios_javadevops.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseObject {

    private boolean successfully;

    private String message;

    private Object obj;

    public void setSuccessfully(String message, Object obj){
        this.successfully = true;
        this.message = message;
        this.obj = obj;
    }

    public void setNoSuccessfuly(String message){
        this.successfully = false;
        this.message = message;
    }
}

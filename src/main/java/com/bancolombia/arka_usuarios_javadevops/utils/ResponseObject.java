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

    public void setAsSuccessfully(String message, Object obj){
        this.setSuccessfully(true);
        this.setMessage(message);
        this.setObj(obj);
    }

    public void setAsNoSuccessfuly(String message){
        this.setSuccessfully(false);
        this.message = message;
    }
}

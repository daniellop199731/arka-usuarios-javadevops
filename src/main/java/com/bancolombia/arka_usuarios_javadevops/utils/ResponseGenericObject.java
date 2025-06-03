package com.bancolombia.arka_usuarios_javadevops.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseGenericObject<T>{

    private boolean successfuly;
    private String message;
    private T obj;

    public void setAsSuccesfuly(String message, T obj){
        this.setSuccessfuly(true);
        this.setMessage(message);
        this.setObj(obj);
    }

    public void setAsNoSuccessfuly(String menssage){
        this.setSuccessfuly(false);
        this.setMessage(message);
    }

}

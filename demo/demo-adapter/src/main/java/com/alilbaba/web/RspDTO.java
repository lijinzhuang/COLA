package com.alilbaba.web;

import lombok.Data;

@Data
public class RspDTO {
    private Integer code;
    private String message;
    RspDTO(){}
    RspDTO(Integer code,String message){
        this.code = code;
        this.message = message;
    }
}

package com.example.pet2.utils;

import lombok.Data;

import java.io.Serializable;

@Data
public class JsonResult<E> implements Serializable {
    private Integer state;
    private String message;
    private E data;

    private String key;
    private Object value;

    public JsonResult() {
    }

    public JsonResult(Integer state) {
        this.state = state;
    }

    public JsonResult(Throwable e){
        this.message=e.getMessage();
    }

    public JsonResult(Integer state, E data) {
        this.state = state;
        this.data = data;
    }

    public JsonResult(Object value){
        this.state=state;
        this.value=value;
    }

    public JsonResult(String key,Object value) {
        this.key = key;
        this.value = value;
    }

}

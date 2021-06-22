package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

//@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {

    private String status;
    private Integer httpStatus= HttpStatus.OK.value();
    private String message;

    public Response(){
    }

    public Response(String status, Integer httpStatus, String message) {
        this.status = status;
        this.httpStatus = httpStatus;
        this.message= message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(int httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

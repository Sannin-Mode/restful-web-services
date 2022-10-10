package com.practicaspring.restfulwebservices.helloworld;


import lombok.*;

@Getter @Setter @ToString
public class HelloWorldBean {

    private String message;

    public HelloWorldBean (String message) {
        this.message = message;
    }
}

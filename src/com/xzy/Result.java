package com.xzy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Result {
    @Autowired
    Student student;
    private String name="好好学习啊";

    public void run(){
        System.out.println("---------->"+name);
        student.study();
    }

}

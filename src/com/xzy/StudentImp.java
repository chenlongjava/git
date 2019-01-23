package com.xzy;

import org.springframework.stereotype.Component;

@Component
public class StudentImp implements Student {

    @Override
    public void study() {
        System.out.println("学习就好");
    }
}

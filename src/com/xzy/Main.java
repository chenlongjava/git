package com.xzy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static  void  main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext(new String[] {"application.xml"});
        Result result=(Result) context.getBean("result");
        result.run();


    }
}

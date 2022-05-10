package com.krishna.test;

import com.krishna.bean.Employee;
import com.krishna.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.krishna.bean")
public class Test_Has_ARelation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee e = ac.getBean("eob", Employee.class);
        System.out.println(e);
        ac.close();
    }
}

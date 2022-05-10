package com.krishna.test;

import com.krishna.config.AppConfig;
import com.krishna.bean.DbConnection;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnotherWay {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        DbConnection con = ac.getBean("connection",DbConnection.class);
        System.out.println(con);
        ac.close();

    }
}

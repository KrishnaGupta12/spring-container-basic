package com.krishna.test;

import com.krishna.bean.DbConn;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {

        //creating spring container reference
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();

        //scan spring bean(classes)-using one package name
        ac.scan("com.krishna.bean");
        //referesh - create object ,provide data , link object..etc
        ac.refresh();

        //raad object (bean) and print
        DbConn ob = ac.getBean("con",DbConn.class);
        System.out.println(ob);

        //CLOSE CONTAINER
        ac.close();;

    }
}

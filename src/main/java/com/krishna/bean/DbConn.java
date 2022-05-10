package com.krishna.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("con")
public class DbConn {

    @Value("Oracle Driver")
    private String driver;
    @Value("jdbc:oracle")
    private String url;

    public DbConn(){
        System.out.println("from DB CONN-DEFAULT-CONST.");
    }

    @Override
    public String toString() {
        return "DbConn{" + "driver='" + driver + '\'' + ", url='" + url + '\'' + '}';
    }
}

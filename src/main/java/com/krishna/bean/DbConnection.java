package com.krishna.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("connection")
public class DbConnection {

    //@Value("${key}")
    //read data from envioroment memory
    @Value("${dbdriver}")
    private String driver;
    @Value("${dburl}")
    private String url;

    public DbConnection(){
        System.out.println("from DB CONN-DEFAULT-CONST");
    }

    @Override
    public String toString() {
        return "DbConn{" + "driver='" + driver + '\'' + ", url='" + url + '\'' + '}';
    }
}

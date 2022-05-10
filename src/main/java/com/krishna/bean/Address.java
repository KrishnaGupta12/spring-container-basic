package com.krishna.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("aob")
public class Address {
    @Value("5-55")
    private String hno;
    @Value("Hyd")
    private String loc;

    @Override
    public String toString() {
        return "Address{" + "hno='" + hno + '\'' + ", loc='" + loc + '\'' + '}';
    }
}

package com.krishna.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

//@ComponentScan(basePackages = "com.krishna.bean")
@ComponentScan("com.krishna.bean")
//@ComponentScan({"com.krishna.bean","com.krishna.model"})
//loading properties file in to spring container
@PropertySource("classpath:krishna.properties")
public class AppConfig {
}

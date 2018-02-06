package com.fruitmall.fmsdk;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

import java.util.TimeZone;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@Configuration
public class SdkServer {

    static Logger logger = LoggerFactory.getLogger(SdkServer.class);

    public static void main (String[] args) throws Exception {
        TimeZone.setDefault(TimeZone.getTimeZone("CST"));
        SpringApplication.run(SdkServer.class,args);
    }

}

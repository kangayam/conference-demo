package com.conference.conferencedemo.config;


import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

// This class will override application.properties file. You build your own configuration.
@Configuration
public class PersistenceConfiguration {
//    @Bean
//
//    public DataSource dataSource(){
//        DataSourceBuilder builder = DataSourceBuilder.create();
//        builder.url("jdbc:postgresql://localhost:5432/conference_app");
//        builder.username("postgres");
//        builder.password("Welcome");
//        System.out.println("My custom datasource from persistanceConfiguration class");
//        return builder.build();
//
//    }
}

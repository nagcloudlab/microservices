package com.example.bank.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BankAlbiladAutoConfiguration {

    @Bean
    public String foo(){
        return "Foo";
    }

}

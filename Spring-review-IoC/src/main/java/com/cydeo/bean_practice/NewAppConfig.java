package com.cydeo.bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NewAppConfig {
    @Bean
public  String str1(){
    return  "Welcome to CydeoApp";
}
@Bean(name="2")
  public String str2(){
    return "String Core Practice";
  }
}

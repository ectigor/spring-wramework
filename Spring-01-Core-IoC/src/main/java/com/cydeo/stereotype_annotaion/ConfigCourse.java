package com.cydeo.stereotype_annotaion;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan  if from the same package
// if from different then
@ComponentScan(basePackages = "com.cydeo")
public class ConfigCourse {

}

package com.cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class, ConfigAny.class);  // e,pty container
// tell to spring what we want to put

// configApp   is a configuration class

        // we can do as many configuration as we neeed


FullTimeMentor ft = container.getBean(FullTimeMentor.class);
//       ft is bean
// have to put name of the bean "p1"
       PartTimeMentor pt = container.getBean("p1",PartTimeMentor.class);

ft.createAccount();

pt.createAccount();

     String str =  container.getBean(String.class);
        System.out.println(str);

    }

}

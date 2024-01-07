package com.spring.core.email;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class emailClient {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        EmailServer es =  ac.getBean(EmailServer.class);
        es.sendEmail();
    }
}

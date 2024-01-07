package com.spring.core.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        String message = "Good";
//        SMSService smsService = new SMSService();
//        MessageSender messageSender = new MessageSender(smsService);
//        messageSender.sendMessage(message);
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageSender ms = ac.getBean(MessageSender.class);
        ms.sendMessage(message);


    }
}

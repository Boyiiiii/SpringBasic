package com.spring.core.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
    @Autowired
    @Qualifier("smsService")
    private MessageService mss;

//    @Autowired
//    public void setMss(@Qualifier("smsService") MessageService mss) {
//        this.mss = mss;
//    }

    //private MessageService smss;
//    //@Autowired
//    public MessageSender(@Qualifier("smsService") MessageService mss){
//        this.mss=mss;
//        System.out.println("Constructor!");
//    }
//    @Autowired
//    public MessageSender(@Qualifier("smsService") MessageService smss,MessageService mss) {
//        this.smss=smss;
//        this.mss=mss;
//        System.out.println("Constructor2222");
//    }
    public void sendMessage(String message){
        this.mss.sendMessage(message);
       //this.smss.sendMessage(message);
    }


}

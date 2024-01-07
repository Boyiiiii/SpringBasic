package com.spring.core.email;

import org.springframework.stereotype.Component;

@Component
public class EmailServer {
    private DataSource dataSource;

    public EmailServer(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void sendEmail(){
        String[] emails = dataSource.getEmails();

        for(String email:emails){
            System.out.println(email);
        }
    }
}

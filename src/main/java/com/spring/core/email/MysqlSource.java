package com.spring.core.email;

import org.springframework.stereotype.Component;

@Component
public class MysqlSource implements DataSource{
    @Override
    public String[] getEmails(){
          String[] emails = {"qdad","dsada123","wer1312"};
          return emails;
    }
}

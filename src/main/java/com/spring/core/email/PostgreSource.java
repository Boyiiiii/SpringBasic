package com.spring.core.email;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PostgreSource implements DataSource {
    @Override
    public String[] getEmails(){
        String[] emails = {"qdad","dsada123","wer1312"};
        return emails;
    }
}

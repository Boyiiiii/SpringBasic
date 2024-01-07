package com.spring.core.repository;

import org.springframework.stereotype.Repository;

@Repository
public class DemoRep {
    public String hello(){
        return "Repository";
    }
}

package com.spring.core;

import com.spring.core.controller.DemoController;
import com.spring.core.repository.DemoRep;
import com.spring.core.service.DemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoClient {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        DemoController dc = ac.getBean(DemoController.class);
        System.out.println(dc.hello());

        DemoService ds = ac.getBean(DemoService.class);
        System.out.println(ds.hello());

        DemoRep dp = ac.getBean(DemoRep.class);
        System.out.println(dp.hello());
    }
}

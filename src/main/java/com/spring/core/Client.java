package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

    public static void main(String[] args){
        Vehicle v = new Car();
        Vehicle b = new Bike();
        Traveler t = new Traveler(b);
        //t.startJourney();

        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class );
        Car car = ac.getBean(Car.class);
        car.move();
        Bike bk = ac.getBean(Bike.class);
        bk.move();
        Traveler tv = ac.getBean(Traveler.class);
        tv.startJourney();
    }
}

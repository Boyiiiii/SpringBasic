package com.spring.core.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

class Student{
      private Address address;

      public Student(Address address){
          this.address=address;
      }

    public void print(){
        System.out.println("Student class ");
        address.print();
    }

    public void init(){
          System.out.println("init method");
    }
    public void destroy(){
        System.out.println("des method");
    }
}


class Address{
    public void print(){
        System.out.println("Address class ");
    }

}
@Configuration
class AppConfig{
    @Bean(name="addressBean")
  public Address address(){
      return new Address();
  }
@Bean(name={"studentBean","studentDemo"},initMethod = "init",destroyMethod = "destroy")
  public Student student(){
      return new Student(address());
  }
}

public class BeanAnnoDemo {
    public static void main(String[] args) {
        try(var ApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class)){
            Student st = (Student) ApplicationContext.getBean("studentBean");
            st.print();
            String[] names = ApplicationContext.getBeanDefinitionNames();
            for(String bean: names){
                System.out.println(bean);
            }

        };
        //Student st = ac.getBean(Student.class);

    }
}

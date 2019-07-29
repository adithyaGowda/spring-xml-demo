package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Actor actorRef1 = context.getBean("actor", Actor.class);
        Actor actorRef2 = context.getBean("actor2", Actor.class);
        Actor actorRef3 = context.getBean("actor3", Actor.class);

        System.out.println(actorRef1.toString());
        System.out.println(actorRef2.toString());
        System.out.println(actorRef3.toString());



        Movie movieRef1 = context.getBean("movie1",Movie.class);

        System.out.println(movieRef1.toString());

        System.out.println("-------------------------------------------------------------------------------");

        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        BeanLifecycleDemoBean demoBean = applicationContext.getBean("beanLifeCycleDemoBean",BeanLifecycleDemoBean.class);
        System.out.println(demoBean.getMessage());

        applicationContext.close();



    }
}

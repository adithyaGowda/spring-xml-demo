package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;

import org.springframework.core.io.Resource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Actor actorRef = context.getBean("actor", Actor.class);
//        System.out.println(actorRef.getName());
//        System.out.println(actorRef.getGender());
//        System.out.println(actorRef.getAge());
//
//        Movie movieRef = context.getBean("movie",Movie.class);
//        System.out.println(movieRef.getActorObject().getName());
//        System.out.println(movieRef.getActorObject().getGender());
//        System.out.println(movieRef.getActorObject().getAge());


        Resource resource = new ClassPathResource("beans.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

        Actor actorRef1 = factory.getBean("actor", Actor.class);

        System.out.println(actorRef1.getAge());
        System.out.println(actorRef1.getGender());
        System.out.println(actorRef1.getAge());

        Movie movieRef1 = factory.getBean("movie",Movie.class);

        System.out.println(movieRef1.getActorObject().getName());
        System.out.println(movieRef1.getActorObject().getGender());
        System.out.println(movieRef1.getActorObject().getAge());


    }
}

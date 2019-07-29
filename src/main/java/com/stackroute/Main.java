package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;


import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Actor actorRef1 = context.getBean("actor1", Actor.class);
        Actor actorRef2 = context.getBean("actor2", Actor.class);
        Actor actorRef3 = context.getBean("actor3", Actor.class);

        System.out.println(actorRef1.toString());
        System.out.println(actorRef2.toString());
        System.out.println(actorRef3.toString());

        Movie movieRef1 = context.getBean("movieBean1",Movie.class);
        Movie movieRef2 = context.getBean("movieBean2",Movie.class);

        System.out.println(movieRef1.toString());
        System.out.println(movieRef2.toString());




       



    }
}

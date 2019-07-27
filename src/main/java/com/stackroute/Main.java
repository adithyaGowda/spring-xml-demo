package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;


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



        Movie movieRef1 = context.getBean("movie1",Movie.class);
        System.out.println(movieRef1.toString());

        Movie movieRef2 = context.getBean("movie2",Movie.class);
        System.out.println(movieRef2.toString());

        System.out.println(movieRef1 == movieRef2);

    }
}

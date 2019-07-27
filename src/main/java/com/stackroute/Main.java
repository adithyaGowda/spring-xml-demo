package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Actor actorRef = context.getBean("actor", Actor.class);
//        Actor actorRef2 = context.getBean("actor2", Actor.class);
//        Actor actorRef3 = context.getBean("actor3", Actor.class);

        System.out.println(actorRef.toString());
//        System.out.println(actorRef2.toString());
//        System.out.println(actorRef3.toString());



        Movie movieRef = context.getBean("movie",Movie.class);

        System.out.println(movieRef.toString());



    }
}

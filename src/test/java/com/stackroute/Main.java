package com.stackroute;

import static org.junit.Assert.assertTrue;

import com.stackroute.config.MainConfig;
import com.stackroute.domain.Movie;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MainConfig.class);
        Movie movie=(Movie) context.getBean("movie",Movie.class);

        //System.out.println(movie.toString());

        context.registerShutdownHook();
    }
}

package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.stackroute")
public class MainConfig {

    @Bean
    public Actor actor()
    {
        Actor actor=new Actor();
        actor.setName("Akshay");
        actor.setGender("Male");
        actor.setAge(43);
        return actor;
    }


    @Bean
    public Movie movie()
    {
        Movie movie=new Movie();
        movie.setActor(actor());

        return movie;
    }
}

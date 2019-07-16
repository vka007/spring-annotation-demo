package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.stackroute")
public class MainConfig {

  /*  @Bean
    public Actor actor()
    {
        Actor actor=new Actor();
        actor.setName("Akshay");
        actor.setGender("Male");
        actor.setAge(43);
        return actor;
    }*/

    @Bean
    public Actor actor()
    {
        return new Actor("Vineet","Male",22);
    }

    @Bean
    public Actor actor1()
    {
        return new Actor("Akash","Male",21);
    }

    @Bean
    public Actor actor2()
    {
        return new Actor("Raj","Male",24);
    }


    @Bean
    public Movie movie()
    {
        return new Movie(actor());
    }

    /*@Bean(initMethod = "customInit",destroyMethod = "customDestroy")
    public BeanLifecycleDemoBean beanLifecycleDemoBean()
    {
        return new BeanLifecycleDemoBean();
    }*/

    @Bean
    public BeanPostProcessorDemoBean beanPostProcessorDemoBean()
    {
        return new BeanPostProcessorDemoBean();
    }
}

package com.stackroute.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorDemoBean implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        System.out.println("Post Process Before Initialization");
        return null;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        System.out.println("Post Process After Initialization");
        return null;
    }
}

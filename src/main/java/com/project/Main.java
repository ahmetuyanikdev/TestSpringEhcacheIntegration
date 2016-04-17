package com.project;

import com.project.config.AppConfig;
import com.project.interfaces.MovieDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args){
        System.out.println("Happy running.");
        ApplicationContext applicationContext  = new AnnotationConfigApplicationContext(AppConfig.class);
        MovieDao movieDao  = (MovieDao) applicationContext.getBean("movieDao");

        log.debug("Result : {}", movieDao.findByDirector("dummy"));
        log.debug("Result : {}", movieDao.findByDirector("dummy"));
        log.debug("Result : {}", movieDao.findByDirector("dummy"));

    }
}

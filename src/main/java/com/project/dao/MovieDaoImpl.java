package com.project.dao;

import com.project.model.Movie;
import com.project.interfaces.MovieDao;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

@Repository("movieDao")
public class MovieDaoImpl implements MovieDao {

    @Override
    public Movie findByDirector(String name) {
        slowQuery(2000);
        System.out.println("findByDirector is running......");

        Movie movie  = new Movie();
        movie.setName("Josh Allan");
        movie.setDirectory("Robert Zemeckis");
        return  movie;
    }

    private  void  slowQuery(long seconds){

        try{
            Thread.sleep(seconds);
        }
        catch (InterruptedException e){
            throw new IllegalStateException(e);
        }
    }
}

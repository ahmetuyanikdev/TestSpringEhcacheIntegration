package com.project.interfaces;

import com.project.model.Movie;

public interface MovieDao {

    Movie findByDirector(String name);
}

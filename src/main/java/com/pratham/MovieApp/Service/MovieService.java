package com.pratham.MovieApp.Service;

import com.pratham.MovieApp.Entity.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> findAll();
    Movie findById(Integer id);
    Movie save(Movie movie);
    Movie update(Movie movie,Integer id);
    void deleteById(Integer id);
    void deleteAll();

    List<Movie> findByYear(Integer year);
}

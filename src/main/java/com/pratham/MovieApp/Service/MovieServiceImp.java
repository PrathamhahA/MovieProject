package com.pratham.MovieApp.Service;

import com.pratham.MovieApp.Entity.Movie;
import com.pratham.MovieApp.Exceptions.CustomException;
//import com.pratham.MovieApp.Repository.MovieController;
import com.pratham.MovieApp.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MovieServiceImp implements MovieService {
    @Autowired
    MovieRepository movieRepository;
    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public Movie findById(Integer id) {
        return movieRepository.findById(id).orElseThrow(()->new CustomException("Movie with"+id+"not found"));
    }

    @Override
    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public Movie update(Movie movie,Integer id) {
        Movie oldMovie=movieRepository.findById(id).orElseThrow(()->new RuntimeException("Not found"));
        oldMovie.setName(movie.getName());
        oldMovie.setRating(movie.getRating());
        oldMovie.setYear(movie.getYear());
        oldMovie.setZoners(movie.getZoners());
        return movieRepository.save(oldMovie);
    }

    @Override
    public void deleteById(Integer id) {
        movieRepository.deleteById(id);
    }
    @Override
    public void deleteAll(){
        movieRepository.deleteAll();
    }
    @Override
    public List<Movie> findByYear(Integer year){
        return movieRepository.findAll().stream().filter((movie)->movie.getYear().equals(year)).toList();

    }
}

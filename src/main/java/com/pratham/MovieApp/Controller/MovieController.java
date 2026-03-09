package com.pratham.MovieApp.Controller;

import com.pratham.MovieApp.Entity.Movie;
import com.pratham.MovieApp.Exceptions.CustomException;
import com.pratham.MovieApp.Service.MovieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {
    MovieService movieService;
    public MovieController(MovieService movieService){
        this.movieService=movieService;
    }
    @GetMapping
    public List<Movie> findAll(){
        return movieService.findAll();
    }
    @GetMapping("/{id}")
    public  Movie findById(@PathVariable Integer id){
        return movieService.findById(id);
    }
    @GetMapping("/byyear")
    public List<Movie> findByYear(@RequestParam Integer year){
        System.out.println("By year");
        return movieService.findByYear(year);
    }
    @PostMapping
    public  Movie save(@RequestBody Movie movie){
        return movieService.save(movie);
    }
    @PutMapping("/{id}")
    public  Movie update(@RequestBody Movie movie,@PathVariable Integer id){
//        System.out.println("Working");
        return movieService.update(movie,id);
    }
    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable Integer id){

        movieService.deleteById(id);
        return "Sucess";


    }
    @DeleteMapping
    public  String deleteAll(){
        movieService.deleteAll();
        return "Sucess";
    }


}

package com.pratham.MovieApp.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name="movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 50)
    private String name;
    private Double rating;
    private Integer year;
    private String  zoners;

    public Movie() {
    }

    public Movie(Integer id, String name, Double rating, Integer year, String zoners) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.year = year;
        this.zoners = zoners;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getZoners() {
        return zoners;
    }

    public void setZoners(String zoners) {
        this.zoners = zoners;
    }
}

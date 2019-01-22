package com.example.user.movieproject.Movie;

public class Movie {
    private String name;
    private int year;
    private int image;
    private String producer;

    public Movie(String name, int year, int image, String producer) {
        this.name = name;
        this.year = year;
        this.image = image;
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getImage() {
        return this.image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
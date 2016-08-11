package com.twu.biblioteca.module;

public class Movie {

    private String name;
    private String year;
    private String director;
    private String rating;
    private Boolean checkout;

    public Movie(String name, String year, String director, String rating) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
        this.checkout = false;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public String getRating() {
        return rating;
    }

    public void setCheckout(Boolean checkout) {
        this.checkout = checkout;
    }

    public Boolean isCheckout() {
        return checkout;
    }
}

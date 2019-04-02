/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ics125;

/**
 *
 * @author C0438956
 */
public class Movie {
    String title;
    String rating;
    String description;
    String showtime;
    String day;
    String actor;
    
    public Movie(String title, String rating, String description, String showtime, String day, String actor){
        this.title = title;
        this.rating = rating;
        this.description = description;
        this.showtime = showtime;
        this.day = day;
        this.actor = actor;
        
        
    }
   

    String getMovieName() {
       return title;
    }

    String getDescription() {
        return description;
    }

    String getShowTime() {
        return showtime;
    }

    String getActor() {
       return actor;
    }
}

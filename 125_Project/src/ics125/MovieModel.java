/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ics125;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author C0438956
 */
class MovieModel {
    ArrayList<Movie> movies;
    private int movieCounter;
    public static final int NUMBER_OF_CONTRACT_ATTRIBUTES = 6;
    public static final int INDEX_OF_TITLE = 0;
    public static final int INDEX_OF_RATING= 1;
    public static final int INDEX_OF_DESCRIPTION= 2;
    public static final int INDEX_OF_DAY = 3;
    public static final int INDEX_OF_SHOWTIME = 4;
    public static final int INDEX_OF_ACTOR = 5;
    

   MovieModel() throws FileNotFoundException, IOException{
        movieCounter = 0;
        movies = new ArrayList<>();

        String fileName;
            fileName = "C:\\Users\\C0438956\\Documents\\NetBeansProjects\\ICS125_Project\\125_Project\\src\\ics125\\Movies.txt";
        try(
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader)){
            String line;
            while((line = bufferedReader.readLine())!= null){
                String[] tokens = line.split(",", NUMBER_OF_CONTRACT_ATTRIBUTES);
                
                String title = tokens[INDEX_OF_TITLE];
                String rating = tokens[INDEX_OF_RATING];
                String desc= tokens[INDEX_OF_DESCRIPTION];
                String day = tokens[INDEX_OF_DAY];
                String showtime = tokens[INDEX_OF_SHOWTIME];
                String actor = tokens[INDEX_OF_ACTOR];
                
                Movie datamovie = new Movie(title,rating,desc, showtime,day,actor);
                
                movies.add(datamovie);
                
               
            }
            
            fileReader.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    Movie getTheMovie() {
        return movies.get(movieCounter);
    }

    boolean foundMovies() {
       return movies.size()>0;
    }

 

    int getcurrentMovieNum() {
       return movieCounter;
    }

    int getMovieCount() {
       return movies.size();
    }

    void nextMovie() {
        if(movieCounter != movies.size()-1)
        movieCounter++;
    }

    void prevMovie() {
        if(movieCounter != 0)
        movieCounter--;
    }
  
    
}

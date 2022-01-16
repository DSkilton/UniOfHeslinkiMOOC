/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Duncan
 */
public class Film {
    private String name;
    private int filmAgeRating;

    public Film(String name, int filmAgeRating) {
        this.name = name;
        this.filmAgeRating = filmAgeRating;
    }
    
    public String name(){
        return name;
    }
    
    public int ageRating(){
        return filmAgeRating;
    }
    
}

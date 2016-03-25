package com.branden;

/**
 * Created by badams on 3/24/16.
 */
public class Snake implements Comparable<Snake> {
    String species;
    double venomRating;

    public Snake(String s, double v){
        this.species = s;
        this.venomRating = v;
    }
    public int compareTo(Snake s){

        if ( this.venomRating > s.venomRating){
            return 1;
        } else if( this.venomRating < s.venomRating){
            return -1;
        } else {
            // returns 1 if less than
            // -1 if greater then
            // 0 if same
            return this.species.compareTo(s.species);

        }

    }
    public String toString(){
        return this.species + " " + this.venomRating;
    }
}

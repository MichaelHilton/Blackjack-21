package models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Created by Terrance on 3/7/2016.
 */
public class Card {
    public char value;
    public char suit;


    public Card(){

    }

    @JsonCreator
    public Card(@JsonProperty("value") char value, @JsonProperty("suit") char suit) {
        this.value = value;
        this.suit  = suit;
    }

    public String concatenate(){
        String s = "";
        s += value;
        s += suit;
        return s;
    }
}

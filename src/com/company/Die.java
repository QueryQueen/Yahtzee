package com.company;

/**
 * Created by Joedid on 10/06/16.
 */
public class Die {
    //Each dice has a value and we keep track if we want to hold the dice or not
    int value;
    boolean hold = false;

    int rollDice(){
            double x;
            x = Math.random() * 6 + 1;
            value = (int) x;
        return value;
    }

}

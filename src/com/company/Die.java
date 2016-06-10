package com.company;

/**
 * Created by Joedid on 10/06/16.
 */
public class Die {

    int value;
    boolean hold = false;


    int rollDice(){
            double x;
            x = Math.random() * 6 + 1;
            value = (int) x;
        return value;
    }

}

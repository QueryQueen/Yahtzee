package com.company;

import java.util.ArrayList;

/**
 * Created by Joedid on 10/06/16.
 */
public class Player {

    //each player has a name
    String name;

    //each turn they have a score
    int score;

    //we keep track of their turnscores in an ArrayList
    ArrayList<Integer> turnScores = new ArrayList<Integer>();

    //and their total score to determine the winner
    int totalScore;

    int getTotalScore(ArrayList<Integer> turnScores) {
        int totalScore = 0;
        for (Integer element : turnScores) {
            totalScore += element;
        }
        return totalScore;
    }
}


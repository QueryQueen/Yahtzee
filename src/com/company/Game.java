package com.company;
import java.util.Scanner;

/**
 * Created by Joedid on 10/06/16.
 */
public class Game {

    boolean isOngoing = true;

    // Compare scores and declare the winner
     void getWinner(Player[] players) {
         int[] totalScores = collectScores(players);
         System.out.println("And the winner is:" + players[getHighscore(totalScores)].name);
     }

    int getHighscore(int[] totalScores) {
        int winner = 0;
        int highscore = totalScores[0];
        for (int counter = 1; counter < totalScores.length; counter++) {
            if (totalScores[counter] > highscore) {
                highscore = totalScores[counter];
                winner = counter;
            }
        }
        System.out.println("The highest score " + highscore);
        return winner;
    }

    int[] collectScores(Player[] players) {
        //collect all the scores into one int array
        int[] collectScores = new int[players.length];

            for (int i = 0; i < players.length; i++) {
            collectScores[i] = players[i].totalScore;
            }
        //print out the result for each player
            for (Player player : players) {
            System.out.println("The score of " + player.name + " = " + player.totalScore);
        }
        return collectScores;
    }
}

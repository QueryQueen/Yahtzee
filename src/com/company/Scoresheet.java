package com.company;

/**
 * Created by Joedid on 10/06/16.
 */
public class Scoresheet {
    int[] turnScore;
    int rollCount = 0;

    int[] getTurnScore(Die[] dice) {
        int[] result = new int[5];

        //in een beurt mag je maar 3 keer rollen
        if (rollCount < 3) {
            for (int i = 0; i < 5; i++) {
                if (dice[i].hold == false) {
                    System.out.println("roll the dice");
                    dice[i].value = dice[i].rollDice();
                    result[i] = dice[i].value;
                    System.out.println("the value is " + result[i]);
                }
            }
        } else {
            System.out.println("You rolled the dice 3 times, next player please");
        }

        return result;

    }
}





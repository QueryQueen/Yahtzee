package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Joedid on 10/06/16.
 */
public class Scoresheet {
    int rollCount = 0;

    //We need a scanner to get userInput
    Scanner sc = new Scanner(System.in);

    //to get the result of 1 turn, the player needs to roll the dice max 3 times
    //after each roll you can decide which dice you want to hold
    int getTurnResult(Die[] dice) {

        int[] result = new int[5];
        int score;

        //in each turn you are allowed to roll the dice 3 times
        for(int i = 0; i < 3; i++){
            rollDiceTurn(dice);
            result = getDiceValues(dice);
            System.out.println("You rolled" + Arrays.toString(result));
            holdDice(dice);
            rollCount++;
            System.out.println("you rolled the dice " + rollCount + " times");
        }
        rollCount = 0;
        System.out.println("The result of your turn is" + Arrays.toString(result));
        freeDice(dice);
        score = calcTurnScore(result);
        return score;
    }

    private int[] getDiceValues(Die[] dice) {
        int[] diceValues = new int[5];

        for (int i = 0; i < dice.length; i++) {
            diceValues[i] = dice[i].value;
        }
        return diceValues;
    }

    private void freeDice(Die[] dice) {
        for(Die x : dice){
            x.hold = false;
        }
    }

    void rollDiceTurn(Die[] input) {
        int[] rollDiceResult = new int[5];

        for (Die dice : input) {
            if (!dice.hold) {
                dice.value = dice.rollDice();
            }
        }
    }

    void holdDice(Die[] dice) {

        System.out.println("Which die do you want to hold? Type -1 to finish");
        int hold = 0;

        while (hold > -1) {
            hold = sc.nextInt() - 1;
            if (hold > -1 && hold < 5) {
                dice[hold].hold = true;
            }
        }
    }

    //for now, the score of 1 turn is calculated by summing all dices
    //later we can implement the Yahtzee rules for official scores
    int calcTurnScore(int[] diceResult) {
        int sum = 0;

        for (int i : diceResult) {
            sum += i;
        }
        return sum;
    }
}




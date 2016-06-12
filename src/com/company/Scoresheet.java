package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Joedid on 10/06/16.
 */
public class Scoresheet {
    int rollCount = 0;

    //We need a scanner to get userInput
    Scanner sc = new Scanner(System.in);

    ArrayList<Integer> yahtzeeCheck = new ArrayList<Integer>();

    //to get the result of 1 turn, the player needs to roll the dice max 3 times
    //after each roll you can decide which dice you want to hold
    int getTurnResult(Die[] dice) {

        int[] result = new int[5];
        int score;

        //in each turn you are allowed to roll the dice 3 times
        for(int i = 0; i < 3; i++) {
            rollDiceTurn(dice);
            result = getDiceValues(dice);
            rollCount++;
            System.out.println("you rolled the dice " + rollCount + " times");
            System.out.println("You rolled" + Arrays.toString(result));
            if (rollCount < 3) {
                holdDice(dice);
            }
        }
        rollCount = 0;
        System.out.println("The result of your turn is" + Arrays.toString(getDiceValues(dice)));
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
        int score = 0;

        // create an ArrayList so I can check for real Yahtzee scores
        for(int i = 0; i < diceResult.length; i++){
            yahtzeeCheck.add(diceResult[i]);
        }

        boolean largeStraight = largeStraight(yahtzeeCheck);
        boolean yahtzee = yahtzee(yahtzeeCheck);

        if(largeStraight){
            System.out.println("Category: large straigth");
            score = 40;
        } else if(yahtzee){
            System.out.println("Category: yahtzee!");
            score = 50;
        } else {
            for (int i : diceResult) {
                score += i;
                }
            System.out.println("Category: chance");
            }
        return score;
        }

    //the sole purpose of this method is to check for Yahtzee
    boolean yahtzee(ArrayList<Integer> yahtzeeCheck){
        boolean yahtzee = true;
        //I need to check if all the dice have the same value
        for(int i = 0; i < yahtzeeCheck.size()-1; i++){
            if(!(yahtzeeCheck.get(i).equals(yahtzeeCheck.get(i+1)))){
                yahtzee = false;
            }
        }
        return yahtzee;
    }

    //the sole purpose of this method is to check for large straight
    boolean largeStraight(ArrayList<Integer> yahtzeeCheck) {
        boolean largeStraight = false;
        //I need to check if each value 1 - 5 or 2 - 6 are present in the arraylist

        if (yahtzeeCheck.indexOf(1) != -1 && yahtzeeCheck.indexOf(2)!= -1 && yahtzeeCheck.indexOf(3) != -1 && yahtzeeCheck.indexOf(4) != -1 && yahtzeeCheck.indexOf(5) != -1 ) {
            largeStraight = true;
             System.out.println(yahtzeeCheck.indexOf(1));
        } else if(yahtzeeCheck.indexOf(2) != -1 && yahtzeeCheck.indexOf(3)!= -1 && yahtzeeCheck.indexOf(4) != -1 && yahtzeeCheck.indexOf(5) != -1 &&  yahtzeeCheck.indexOf(6) != -1){
            largeStraight = true;
        }
        return largeStraight;
    }

}





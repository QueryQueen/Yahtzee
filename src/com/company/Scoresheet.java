package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Joedid on 10/06/16.
 */
public class Scoresheet {
    int turnScore;
    int rollCount = 0;

    //We need a scanner to get userInput
    Scanner sc = new Scanner(System.in);


    int[] getTurnScore(Die[] dice) {
        int[] result = new int[5];

        //roll 1
        for (int i = 0; i < 5; i++) {
            if (!dice[i].hold) {
                dice[i].value = dice[i].rollDice();
                result[i] = dice[i].value;
            } else {
                result[i] = dice[i].value;
            }
        }

        //Print the result of the first throw
        System.out.println("You rolled: " + Arrays.toString(result));
        rollCount++;
        System.out.println("you rolled the dice " + rollCount + " times");

        //ask which die the player wants to hold
        System.out.println("Which die do you want to hold?");
        int hold = sc.nextInt() - 1;
        dice[hold].hold = true;

        //roll second time
        for (int i = 0; i < 5; i++) {
            if (!dice[i].hold) {
                dice[i].value = dice[i].rollDice();
                result[i] = dice[i].value;
            } else {
                result[i] = dice[i].value;
            }
        }

        System.out.println("You rolled: " + Arrays.toString(result));
        rollCount++;
        System.out.println("you rolled the dice " + rollCount + " times");

        //ask which die the player wants to hold
        System.out.println("Which die do you want to hold?");
        int hold2 = sc.nextInt() - 1;
        dice[hold2].hold = true;

        //roll third time
        for (int i = 0; i < 5; i++) {
            if (!dice[i].hold) {
                dice[i].value = dice[i].rollDice();
                result[i] = dice[i].value;
            } else {
                result[i] = dice[i].value;
            }
        }

        return result;
        }

    }


            //in een beurt mag je maar 3 keer rollen
//        if (rollCount < 3) {
//            for (int i = 0; i < 5; i++) {
//                if (!dice[i].hold) {
//                    dice[i].value = dice[i].rollDice();
//                    result[i] = dice[i].value;
//                }
//            }
//        } else {
//            System.out.println("You rolled the dice 3 times, next player please");
//        }
//        //Print het resultaat
//        System.out.println("You rolled: " + Arrays.toString(result));
//        rollCount++;
//        System.out.println("you rolled the dice " + rollCount + " times");
//        return result;
//    }




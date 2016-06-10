package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //First we have to initiate a new game of Yahtzee
        Yahtzee myYahtzee = new Yahtzee();

        //Because we create a new game, 5 dices are and 3 players are created in class Yahtzee
        System.out.println("Welcome to the game " + myYahtzee.player1.name + ", " + myYahtzee.player2.name + " & " + myYahtzee.player3.name);

        //While the game is ongoing, we keep having new rounds
//        while(myYahtzee.isOngoing = true){

            myYahtzee.playYahtzee();

        String askName(){
            System.out.println("What is your name?");
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            return name;
        }
        }
//    }

}

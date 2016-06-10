package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //First we have to initiate a new game of Yahtzee
        Yahtzee myYahtzee = new Yahtzee();

        //While the game is ongoing, we keep having new rounds
        //while(myYahtzee.isOngoing = true){

        myYahtzee.player1.name = myYahtzee.askName();
        myYahtzee.player2.name = myYahtzee.askName();
        myYahtzee.player3.name = myYahtzee.askName();
        System.out.println("Welcome to the game " +myYahtzee.player1.name +", " + myYahtzee.player2.name + " & " + myYahtzee.player3.name);

        myYahtzee.playYahtzee();



        }

}

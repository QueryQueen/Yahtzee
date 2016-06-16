package com.company;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Joedid on 12/06/16.
 */
public class ScoresheetTest {
    @org.junit.Test
    public void yahtzeeFalse() throws Exception {
        Scoresheet tested = new Scoresheet();
        ArrayList<Integer> given = new ArrayList<Integer>(Arrays.asList(1,3,1,2,1));
        assertEquals(false, tested.yahtzee(given));
    }

    @org.junit.Test
    public void yahtzeeGood() throws Exception {
        Scoresheet tested = new Scoresheet();
        ArrayList<Integer> given = new ArrayList<Integer>(Arrays.asList(1,1,1,1,1));
        assertEquals(true, tested.yahtzee(given));
    }

    @org.junit.Test
    public void largeStraightGood1() throws Exception {
        Scoresheet tested = new Scoresheet();
        ArrayList<Integer> given = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        assertEquals(true, tested.largeStraight(given));
    }

    @org.junit.Test
    public void largeStraightGood2() throws Exception {
        Scoresheet tested = new Scoresheet();
        ArrayList<Integer> given = new ArrayList<Integer>(Arrays.asList(2,3,4,5,6));
        assertEquals(true, tested.largeStraight(given));
    }


    @org.junit.Test
    public void largeStraightBad() throws Exception {
        Scoresheet tested = new Scoresheet();
        ArrayList<Integer> given = new ArrayList<Integer>(Arrays.asList(1,3,2,3,5));
        assertEquals(false, tested.largeStraight(given));
    }

}
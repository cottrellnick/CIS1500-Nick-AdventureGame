package com.example.adventuregame;

public class Dice {
    public int die1;
    public int die2;
    public int die3;

    public Dice() {
        roll();
    }

    public void roll() {
        int die1 = (int) (Math.random() * 6) + 1;
        int die2 = (int) (Math.random() * 6) + 1;
        int die3 = (int) (Math.random() * 6) + 1;
    }

    public int getDie1() {
        // Return the number showing on the first die.
        return die1;
    }

    public int getDie2() {
        // Return the number showing on the second die.
        return die2;
    }

    public int getTotal1() {
        return die1 + die2 + die3;
    }

    public int getTotal2() {
        return die1 + die2;
    }
}
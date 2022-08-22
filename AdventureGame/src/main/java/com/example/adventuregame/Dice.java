package com.example.adventuregame;

public class Dice {

    public int totalOne;
    public int totalTwo;
    public int dieOne;
    public int dieTwo;
    public int dieThree;

    public Dice() {
        roll();
    }

    public static void roll() {
        int dieOne = (int) (Math.random() * 6) + 1;
        int dieTwo = (int) (Math.random() * 6) + 1;
        int dieThree = (int) (Math.random() * 6) + 1;
    }

    public int getDieOne() {
        return dieOne;
    }

    public int getDieTwo() {
        return dieTwo;
    }

    public int getDieThree() {
        return dieThree;
    }


    public int getTotalOne() {
        return totalOne;
    }

    public void setTotalOne(int totalOne) {
        this.totalOne = dieOne + dieTwo + dieThree;
    }

    public int getTotalTwo() {
        return totalTwo;
    }

    public void setTotalTwo(int totalTwo) {
        this.totalTwo = dieOne + dieTwo;
    }
}
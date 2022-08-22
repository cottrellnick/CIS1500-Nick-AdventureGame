package com.example.adventuregame;

public class Character {
    private int strength;
    private int dexterity;
    private int intelligence;
    private int hitPoints;
    private int totalGold;

    public Character (int strength, int dexterity, int intelligence, int hitPoints, int totalGold) {

    this.strength = strength;
    this.dexterity = dexterity;
    this.intelligence = intelligence;
    this.hitPoints = hitPoints;
    this.totalGold = totalGold; }

    public Character() {
        this(0, 0 , 0, 20,0);
    }

    public int getStrength() {
        return strength;
    }

    public static void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public static void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public static void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getHitPoints()
    { return hitPoints; }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getTotalGold() {
        return totalGold;
    }

    public void setTotalGold(int totalGold) {
        this.totalGold = totalGold;
    }
}

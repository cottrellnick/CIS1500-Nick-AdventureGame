package com.example.adventuregamesecondtry;

public class Monster {
    private int strength;
    private int dexterity;
    private int intelligence;
    private int hitPoints;


    public Monster(int strength, int dexterity, int intelligence, int hitPoints) {

        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.hitPoints = hitPoints;
    }
    public Monster() { this(0,0,0,0); }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }
}

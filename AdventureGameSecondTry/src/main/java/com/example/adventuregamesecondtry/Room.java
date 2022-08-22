package com.example.adventuregamesecondtry;

public class Room {
    String roomName;
    boolean hasGold;
    int howMuchGold;
    boolean hasMonster;
    boolean hasNorthExit;
    boolean hasSouthExit;
    boolean hasEastExit;
    boolean hasWestExit;

    public Room (String roomName, boolean hasGold, int howMuchGold, boolean hasMonster, boolean hasNorthExit, boolean hasSouthExit, boolean hasEastExit, boolean hasWestExit) {
        this.roomName = roomName;
        this.hasGold = hasGold;
        this.howMuchGold = howMuchGold;
        this.hasMonster = hasMonster;
        this.hasNorthExit = hasNorthExit;
        this.hasSouthExit = hasSouthExit;
        this.hasEastExit = hasEastExit;
        this.hasWestExit = hasWestExit;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public boolean isHasGold() {
        return hasGold;
    }

    public void setHasGold(boolean hasGold) {
        this.hasGold = hasGold;
    }

    public int getHowMuchGold() {
        return howMuchGold;
    }

    public void setHowMuchGold(int howMuchGold) {
        this.howMuchGold = howMuchGold;
    }

    public boolean isHasMonster() {
        return hasMonster;
    }

    public boolean isHasNorthExit() {
        return hasNorthExit;
    }

    public void setHasNorthExit(boolean hasNorthExit) {
        this.hasNorthExit = hasNorthExit;
    }

    public boolean isHasSouthExit() {
        return hasSouthExit;
    }

    public void setHasSouthExit(boolean hasSouthExit) {
        this.hasSouthExit = hasSouthExit;
    }

    public boolean isHasEastExit() {
        return hasEastExit;
    }

    public void setHasEastExit(boolean hasEastExit) {
        this.hasEastExit = hasEastExit;
    }

    public boolean isHasWestExit() {
        return hasWestExit;
    }

    public void setHasWestExit(boolean hasWestExit) {
        this.hasWestExit = hasWestExit;
    }

    public void setHasMonster(boolean hasMonster) {
        this.hasMonster = hasMonster;

    }

    //   public Room (){
    //  roomName = "foyer";
    //  hasGold = false;
    //  howMuchGold = 0;
    //  hasMonster = false;
    //  hasNorthExit = false;
    //  hasSouthExit = true;
    //  hasEastExit = true;
    //  hasWestExit = false;
    //}
}

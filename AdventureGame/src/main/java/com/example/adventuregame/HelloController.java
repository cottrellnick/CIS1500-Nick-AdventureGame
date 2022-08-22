package com.example.adventuregame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.util.Random;

public class HelloController {

    String [] rooms = new String[100];

    public String[] getRooms() {
        return rooms;

    }

    Character character;
    Dice dice;

    @FXML
    private TextArea textArea;
    @FXML
    private Button searchButton;
    @FXML
    private Button sleepButton;
    @FXML
    private Button fightButton;
    @FXML
    private Button runButton;
    @FXML
    private Button westButton;
    @FXML
    private Button eastButton;
    @FXML
    private Button northButton;
    @FXML
    private Button southButton;
    @FXML
    private Label hitPointsStat;
    @FXML
    private Label strengthStat;
    @FXML
    private Label dexterityStat;
    @FXML
    private Label goldStat;
    @FXML
    private Label intelligenceStat;
    @FXML
    private Label monsterHitPointsStat;
    @FXML
    private Label monsterIntelligenceStat;
    @FXML
    private Label monsterStrengthStat;
    @FXML
    private Label monsterDexterityStat;
    @FXML
    private Button getCharacterStatsButton;
    @FXML
    private Button getMonsterStatusButton;

    @FXML
    public void buttonClicked(ActionEvent actionEvent) {
        if (actionEvent.getSource() == northButton) {
            textArea.appendText("You have entered the room to the North\n");
        } else if (actionEvent.getSource() == eastButton) {
            textArea.appendText("You have entered the room to the East\n");
        } else if (actionEvent.getSource() == southButton) {
            textArea.appendText("You have entered the room to the South\n");
        } else if (actionEvent.getSource() == westButton) {
            textArea.appendText("You have entered the room to the West\n");
        } else if (actionEvent.getSource() == searchButton) {
            textArea.appendText("You search the room and find Gold!\n");
        }

            northButton.setDisable(false);
            eastButton.setDisable(false);
            southButton.setDisable(false);
            westButton.setDisable(false);

            switch ((int) (Math.random() * 4)) {
                case 0:
                    northButton.setDisable(true);
                    break;
                case 1:
                    eastButton.setDisable(true);
                    break;
                case 2:
                    southButton.setDisable(true);
                    break;
                case 3:
                    westButton.setDisable(true);
                    break;
            }

        }

    @Deprecated
    public void getCharacterStatsButtonClicked(ActionEvent actionEvent) {
        Character character = new Character();

        Dice diceStrength;
        diceStrength = new Dice();
            Dice.roll();
            System.out.println("The dice come up " + dice.getDieOne()
                    + ", " + dice.getDieTwo() + ", and " + dice.getDieThree());
        character.setStrength(dice.totalOne);

        Dice diceIntelligence;
        diceIntelligence = new Dice();
        Dice.roll();
        System.out.println("The dice come up " + dice.getDieOne()
                + ", " + dice.getDieTwo() + ", and " + dice.getDieThree());
        character.setIntelligence(dice.totalOne);

        Dice diceDexterity;
        diceDexterity = new Dice();
        Dice.roll();
        System.out.println("The dice come up " + dice.getDieOne()
                + ", " + dice.getDieTwo() + ", and " + dice.getDieThree());
        character.setDexterity(dice.totalOne);
        character.setHitPoints(20);

        strengthStat.setText("Strength: " + character.getStrength());
        intelligenceStat.setText("Intelligence: " + character.getIntelligence());
        dexterityStat.setText("Dexterity: " + character.getDexterity());
    }

    @Deprecated
    public void getMonsterStatsButtonClicked(ActionEvent actionEvent) {

        Monster monster = new Monster();

        Dice diceMonsterStrength;
        diceMonsterStrength = new Dice();
        Dice.roll();
        System.out.println("The dice come up " + dice.getDieOne()
                + " and " + dice.getDieTwo());
        monster.setStrength(dice.totalTwo);
        Dice diceMonsterIntelligence;

        diceMonsterIntelligence = new Dice();
        Dice.roll();
        System.out.println("The dice come up " + dice.getDieOne()
                + " and " + dice.getDieTwo());
        monster.setIntelligence(dice.totalTwo);

        Dice diceMonsterDexterity;
        diceMonsterDexterity = new Dice();
        Dice.roll();
        System.out.println("The dice come up " + dice.getDieOne()
                + " and " + dice.getDieTwo());
        monster.setDexterity(dice.totalTwo);

        Dice diceMonsterHitPoints;
        diceMonsterHitPoints = new Dice();
        Dice.roll();
        System.out.println("The dice come up " + dice.getDieOne()
                + " and " + dice.getDieTwo());
        monster.setHitPoints(dice.totalTwo);


        monsterStrengthStat.setText("Strength: " + monster.getStrength());
        monsterIntelligenceStat.setText("Intelligence: " + monster.getIntelligence());
        monsterDexterityStat.setText("Dexterity: " + monster.getDexterity());
        monsterHitPointsStat.setText("Hit Points: " + monster.getHitPoints());
    }

    @Deprecated
    public void buttonSearchClicked(ActionEvent actionEvent) {
    }

    public void actionButtonClicked(ActionEvent actionEvent) {
    }
}
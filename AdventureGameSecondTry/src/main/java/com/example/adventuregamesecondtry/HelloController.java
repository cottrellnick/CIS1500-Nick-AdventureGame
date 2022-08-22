package com.example.adventuregamesecondtry;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.util.Random;

public class HelloController {

    @FXML
    private Button searchButton;
    @FXML
    private Button westButton;
    @FXML
    private Button sleepButton;
    @FXML
    private Button eastButton;
    @FXML
    private Button getCharacterStatsButton;
    @FXML
    private Button fightButton;
    @FXML
    private Button runButton;
    @FXML
    private Button northButton;
    @FXML
    private Button southButton;
    @FXML
    private Button getMonsterStatsButton;
    @FXML
    private TextArea textArea;
    @FXML
    private Label characterStatsLabel;
    @FXML
    private Label monsterStatsLabel;
    @FXML
    private Label goldTotal;
    @FXML
    private Label hitPointsStat;
    @FXML
    private Label strengthStat;
    @FXML
    private Label dexterityStat;
    @FXML
    private Label intelligenceStat;
    @FXML
    private Label monsterIntelligence;
    @FXML
    private Label monsterHitPoints;
    @FXML
    private Label monsterDexterity;
    @FXML
    private Label monsterStrength;

    @FXML
    public void monsterStatsButtonClicked(ActionEvent actionEvent) {
        Monster monster = new Monster();

        Random rand = new Random();

        Dice diceMonsterStrength;
        int dieOne = (int) (Math.random() * 6) + 1;
        int dieTwo = (int) (Math.random() * 6) + 1;
        int sum = dieOne + dieTwo;
        diceMonsterStrength = new Dice();
        Dice.roll();
        System.out.println("The dice come up " + diceMonsterStrength.getDieOne()
                + " and " + diceMonsterStrength.getDieTwo());
        monster.setStrength(diceMonsterStrength.totalTwo);
        Dice diceMonsterIntelligence;

        diceMonsterIntelligence = new Dice();
        Dice.roll();
        System.out.println("The dice come up " + diceMonsterIntelligence.getDieOne()
                + " and " + diceMonsterIntelligence.getDieTwo());
        monster.setIntelligence(diceMonsterIntelligence.totalTwo);

        Dice diceMonsterDexterity;
        diceMonsterDexterity = new Dice();
        Dice.roll();
        System.out.println("The dice come up " + diceMonsterDexterity.getDieOne()
                + " and " + diceMonsterDexterity.getDieTwo());
        monster.setDexterity(diceMonsterDexterity.totalTwo);

        Dice diceMonsterHitPoints;
        diceMonsterHitPoints = new Dice();
        Dice.roll();
        System.out.println("The dice come up " + diceMonsterHitPoints.getDieOne()
                + " and " + diceMonsterHitPoints.getDieTwo());
        monster.setHitPoints(diceMonsterHitPoints.totalTwo);


        monsterStrength.setText("Strength: " + monster.getStrength());
        monsterIntelligence.setText("Intelligence: " + monster.getIntelligence());
        monsterDexterity.setText("Dexterity: " + monster.getDexterity());
        monsterHitPoints.setText("Hit Points: " + monster.getHitPoints());
    }

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
        } else if (actionEvent.getSource() == runButton) {
            textArea.appendText("You run away from the monster, but do you get away safely?");
        } else if (actionEvent.getSource() == fightButton) {
            textArea.appendText("You have chosen to attack. Let's see if you won.");
        } else if (actionEvent.getSource() == sleepButton) {
            textArea.appendText("You seem exhausted. Sleeping is a good choice. After sleeping you have re-generated your health.");
        }

        northButton.setDisable(false);
        eastButton.setDisable(false);
        southButton.setDisable(false);
        westButton.setDisable(false);
    }

    @FXML
    public void characterStatsButtonClicked(ActionEvent actionEvent) {
        Character character = new Character();

        Dice DiceRoll = new Dice();

            Dice diceStrength;
            diceStrength = new Dice();
            int dieOne = (int) (Math.random() * 6) + 1;
            int dieTwo = (int) (Math.random() * 6) + 1;
            int dieThree = (int) (Math.random() * 6) + 1;

        Dice.roll();
        System.out.println("The dice come up " + diceStrength.getDieOne()
                + ", " + diceStrength.getDieTwo() + ", and " + diceStrength.getDieThree());
        character.setStrength(diceStrength.totalOne);

        Dice diceIntelligence;
        diceIntelligence = new Dice();
        Dice.roll();
        System.out.println("The dice come up " + diceIntelligence.getDieOne()
                + ", " + diceIntelligence.getDieTwo() + ", and " + diceIntelligence.getDieThree());
        character.setIntelligence(diceIntelligence.totalOne);

        Dice diceDexterity;
        diceDexterity = new Dice();
        Dice.roll();
        System.out.println("The dice come up " + diceDexterity.getDieOne()
                + ", " + diceDexterity.getDieTwo() + ", and " + diceDexterity.getDieThree());
        character.setDexterity(diceDexterity.totalOne);
        character.setHitPoints(20);

        strengthStat.setText("Strength: " + character.getStrength());
        intelligenceStat.setText("Intelligence: " + character.getIntelligence());
        dexterityStat.setText("Dexterity: " + character.getDexterity());
    }
}

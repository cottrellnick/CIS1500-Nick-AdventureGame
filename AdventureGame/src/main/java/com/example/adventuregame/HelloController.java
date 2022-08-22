package com.example.adventuregame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class HelloController {

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

    @FXML
    public void getCharacterStatsButtonClicked(ActionEvent actionEvent) {
        Dice.rollDie();
        Character.setStrength(Dice.getTotalOne);
        Dice.roll();
        Character.setIntelligence(Dice.getTotalOne);
        Dice.roll();
        Character.setDexterity(Dice.getTotalOne);
    }


    @FXML
    public void getMonsterStatsButtonClicked(ActionEvent actionEvent) {
        Dice monsterDiceRoll;
    }
}
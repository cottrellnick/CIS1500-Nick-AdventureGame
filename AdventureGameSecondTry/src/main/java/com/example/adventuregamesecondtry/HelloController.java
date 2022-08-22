package com.example.adventuregamesecondtry;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

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

    @Deprecated
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to the Game!");
    }

    @FXML
    public void monsterStatsButtonClicked(ActionEvent actionEvent) {
    }

    @FXML
    public void buttonClicked(ActionEvent actionEvent) {
    }

    @FXML
    public void characterStatsButtonClicked(ActionEvent actionEvent) {
    }
}
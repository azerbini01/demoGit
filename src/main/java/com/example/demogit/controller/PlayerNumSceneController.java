package com.example.demogit.controller;

import com.example.demogit.HelloApplication;
import com.example.demogit.model.Board;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.io.IOException;

public class PlayerNumSceneController {
    @FXML
    ToggleGroup toggleGroup;
    /**
     * radio button for 2 players selected
     */
    @FXML
    RadioButton radioBtn1;
    /**
     * radio button for 3 players selected
     */
    @FXML
    RadioButton radioBtn2;
    /**
     * radio button for 4 players selected
     */
    @FXML
    RadioButton radioBtn3;

    @FXML
    protected void onContinueButtonClick() {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login_scene.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = Board.getCurrentStage();
        stage.setTitle("Set your nickname");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onBackToMenuButtonClick() {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("lobby.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = Board.getCurrentStage();
        stage.setTitle("Back in the lobby!");
        stage.setScene(scene);
        stage.show();
    }
}

package com.example.demogit.controller;

import com.example.demogit.HelloApplication;
import com.example.demogit.model.Board;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginSceneController {
    @FXML
    TextField nicknameField;

    @FXML
    protected void onGoBackButtonClick() {
        //start game
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("player_num_scene.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = Board.getCurrentStage();
        stage.setTitle("Set number of players");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onContinueButtonClick() {
        //start game
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("waiting_room.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = Board.getCurrentStage();
        stage.setTitle("Wait for others to join");
        stage.setScene(scene);
        stage.show();
    }
}

package com.example.demogit.controller;

import com.example.demogit.HelloApplication;
import com.example.demogit.model.Board;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LobbyController {
    @FXML
    protected void onPlayButtonClick() {
        //start game
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("livingRoom.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = Board.getCurrentStage();
        stage.setTitle("Game started!");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onExitButtonClick() {
        //end game
        Platform.exit();
    }
}

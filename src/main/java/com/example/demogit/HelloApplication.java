package com.example.demogit;

import com.example.demogit.model.Board;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Create new board
        Board.initBoard();
        //load lobby
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("lobby.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Simone was here!");
        stage.setScene(scene);
        stage.show();
        //set lobby as current stage
        Board.setCurrentStage(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}
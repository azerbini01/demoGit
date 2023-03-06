package com.example.demogit;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Test comment
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("layoutProva.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Simone was here!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
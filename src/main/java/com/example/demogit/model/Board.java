package com.example.demogit.model;

import javafx.stage.Stage;

public class Board {

    /**
     * Singleton class
     */
    private static Stage currentStage;

    public static void initBoard() {
        if(currentStage==null) {
            currentStage = new Stage();
        }
    }

    public static Stage getCurrentStage() {
        return currentStage;
    }

    public static void setCurrentStage(Stage currentStage) {
        Board.currentStage = currentStage;
    }
}

package com.projet7wondersarchitect;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import java.io.IOException;

public class HelloController {

    @FXML
    public void onPlayButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("player-selection-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
        HelloApplication.currentStage.setScene(scene);
        HelloApplication.currentStage.show();
    }
}
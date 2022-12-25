package com.projet7wondersarchitect;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.util.Objects;

public class GameController {
    ImageView image = new ImageView(new Image(Objects.requireNonNull(getClass().getResourceAsStream("images/wonders/wonder-alexandrie.png"))));

    @FXML
    private ImageView wonder1;

    @FXML
    void test(MouseEvent event) {
        wonder1.setImage(image.getImage());

    }

}

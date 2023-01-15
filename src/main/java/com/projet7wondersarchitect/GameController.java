package com.projet7wondersarchitect;

import com.projet7wondersarchitect.game.Game;
import com.projet7wondersarchitect.game.Player;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.util.Objects;

import static com.projet7wondersarchitect.WonderSelectionController.playerList;

public class GameController {
    ImageView image = new ImageView(new Image(Objects.requireNonNull(getClass().getResourceAsStream("images/wonders/wonder-alexandrie.png"))));

    @FXML
    private ImageView exemple_1;

    @FXML
    private ImageView exemple_2;
    @FXML
    private ImageView wonder1;

    @FXML
    private ImageView pioche1;

    @FXML
    private ImageView pioche2;

    @FXML
    private ImageView piocheCentrale;
    @FXML
    private AnchorPane preEcran;

    @FXML
    void test(MouseEvent event) {
        wonder1.setImage(image.getImage());

    }
    @FXML
    void chargementDesDonnees(MouseEvent event) {
        Game.gameInitialisation(playerList);
        int compteurPioche=0;
        if (compteurPioche != playerList.size()){
            Player player1 = playerList.get(compteurPioche);
            pioche1.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream(player1.piochePersonnelle.get(0).front.imageResource))));

            compteurPioche++;
            if (compteurPioche != playerList.size()){
                pioche2.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream( playerList.get(compteurPioche).piochePersonnelle.get(0).front.imageResource))));

            }
        }
        preEcran.setVisible(false);
        exemple_1.setVisible(false);
        exemple_2.setVisible(false);

    }


}

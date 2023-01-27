package com.projet7wondersarchitect;

import com.projet7wondersarchitect.domain.Wonder;
import com.projet7wondersarchitect.game.Game;
import com.projet7wondersarchitect.game.Player;
import javafx.event.EventTarget;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.util.Objects;

import static com.projet7wondersarchitect.WonderSelectionController.playerList;
import static com.projet7wondersarchitect.game.Game.nbJeton;

public class GameController {
    ImageView image = new ImageView(new Image(Objects.requireNonNull(getClass().getResourceAsStream("images/wonders/wonder-alexandrie.png"))));

    @FXML
    private ImageView board1;

    @FXML
    private ImageView board2;

    @FXML
    private ImageView board3;

    @FXML
    private ImageView board4;

    @FXML
    private ImageView board5;

    @FXML
    private ImageView board6;

    @FXML
    private ImageView board7;

    @FXML
    private ImageView exemple_1;

    @FXML
    private ImageView exemple_2;

    @FXML
    private ImageView exemple_3;

    @FXML
    private ImageView exemple_4;

    @FXML
    private ImageView exemple_5;

    @FXML
    private ImageView exemple_6;

    @FXML
    private ImageView exemple_7;

    @FXML
    private AnchorPane jetonConflit;

    @FXML
    private ImageView jetonConflit1;

    @FXML
    private ImageView jetonConflit2;

    @FXML
    private ImageView jetonConflit3;

    @FXML
    private ImageView jetonConflit4;

    @FXML
    private ImageView jetonConflit5;

    @FXML
    private ImageView jetonConflit6;

    @FXML
    private ImageView pioche1;

    @FXML
    private ImageView pioche2;

    @FXML
    private ImageView pioche3;

    @FXML
    private ImageView pioche4;

    @FXML
    private ImageView pioche5;

    @FXML
    private ImageView pioche6;

    @FXML
    private ImageView pioche7;

    @FXML
    private ImageView piocheCentrale;

    @FXML
    private AnchorPane preEcran;

    @FXML
    private ImageView stick11;

    @FXML
    private ImageView stick12;

    @FXML
    private ImageView stick21;

    @FXML
    private ImageView stick22;

    @FXML
    private ImageView stick31;

    @FXML
    private ImageView stick32;

    @FXML
    private ImageView stick41;

    @FXML
    private ImageView stick42;

    @FXML
    private ImageView stick51;

    @FXML
    private ImageView stick52;

    @FXML
    private ImageView stick61;

    @FXML
    private ImageView stick62;

    @FXML
    private ImageView stick71;

    @FXML
    private ImageView stick72;

    @FXML
    private Label labelJ1;

    @FXML
    private Label labelJ2;

    @FXML
    private Label labelJ3;

    @FXML
    private Label labelJ4;

    @FXML
    private Label labelJ5;

    @FXML
    private Label labelJ6;

    @FXML
    private Label labelJ7;

    @FXML
    private Pane alexendrieBlock;

    @FXML
    private Pane babyloneBlock;

    @FXML
    private Pane epheseBlock;

    @FXML
    private Pane gizehBlock;

    @FXML
    private Pane olympieBlock;

    @FXML
    private Pane halicarBlock;

    @FXML
    private Pane rodesBlock;

    private int idPlayer=0;
    private Player player;

    private int jetonNumber;


    @FXML
    void chargementDesDonnees(MouseEvent event) {

        pioche1.setVisible(false);
        pioche2.setVisible(false);
        pioche3.setVisible(false);
        pioche4.setVisible(false);  //On cache toutes les pioches pour faire apparaitre le nombre qu'il faut selon le nb de joueur
        pioche5.setVisible(false);
        pioche6.setVisible(false);
        pioche7.setVisible(false);

        preEcran.setVisible(false);
        exemple_1.setVisible(false);
        exemple_2.setVisible(false);
        exemple_3.setVisible(false);    //On cache l'écran de chargement puis tous les exemple en arriere-plan
        exemple_4.setVisible(false);
        exemple_5.setVisible(false);
        exemple_6.setVisible(false);
        exemple_7.setVisible(false);


        board3.setVisible(false);
        board4.setVisible(false);
        board5.setVisible(false);
        board6.setVisible(false);
        board7.setVisible(false);

        stick31.setVisible(false);
        stick32.setVisible(false);
        stick41.setVisible(false);
        stick42.setVisible(false);
        stick51.setVisible(false);
        stick52.setVisible(false);
        stick61.setVisible(false);
        stick62.setVisible(false);
        stick71.setVisible(false);
        stick72.setVisible(false);


        Game.gameInitialisation(playerList);
        jetonNumber = nbJeton(playerList.size());
        if(jetonNumber==3){
            jetonConflit4.setVisible(false);
            jetonConflit5.setVisible(false);
            jetonConflit6.setVisible(false);
        } else if (jetonNumber == 4) {
            jetonConflit5.setVisible(false);
            jetonConflit6.setVisible(false);
        } else if (jetonNumber == 5) {
            jetonConflit6.setVisible(false);
        }
        int compteurPioche=0;
        for (int i=0; i<playerList.size(); i++){
            switch (i){
                case 0:
                    player = playerList.get(i);
                    pioche1.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream(player.piochePersonnelle.get(0).front.imageResource))));
                    pioche1.setVisible(true);
                    placementMerveille(i,player.getWonder());
                    labelJ1.setText(player.getName());
                    labelJ1.setVisible(true);
                    break;
                case 1:
                    player = playerList.get(i);
                    pioche2.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream( player.piochePersonnelle.get(0).front.imageResource))));
                    pioche2.setVisible(true);
                    placementMerveille(i,player.getWonder());
                    labelJ2.setText(player.getName());
                    labelJ2.setVisible(true);
                    break;
                case 2:
                    player = playerList.get(i);
                    pioche3.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream( player.piochePersonnelle.get(0).front.imageResource))));
                    pioche3.setVisible(true);
                    board3.setVisible(true);
                    stick31.setVisible(true);
                    stick32.setVisible(true);
                    labelJ3.setText(player.getName());
                    labelJ3.setVisible(true);
                    placementMerveille(i,player.getWonder());
                    break;
                case 3:
                    player = playerList.get(i);
                    pioche4.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream( player.piochePersonnelle.get(0).front.imageResource))));
                    pioche4.setVisible(true);
                    board4.setVisible(true);
                    stick41.setVisible(true);
                    stick42.setVisible(true);
                    labelJ4.setText(player.getName());
                    labelJ4.setVisible(true);
                    placementMerveille(i,player.getWonder());
                    break;
                case 4:
                    player = playerList.get(i);
                    pioche5.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream( player.piochePersonnelle.get(0).front.imageResource))));
                    pioche5.setVisible(true);
                    board5.setVisible(true);
                    stick51.setVisible(true);
                    stick52.setVisible(true);
                    labelJ5.setText(player.getName());
                    labelJ5.setVisible(true);
                    placementMerveille(i,player.getWonder());
                    break;
                case 5:
                    player = playerList.get(i);
                    pioche6.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream( player.piochePersonnelle.get(0).front.imageResource))));
                    pioche6.setVisible(true);
                    board6.setVisible(true);
                    stick61.setVisible(true);
                    stick62.setVisible(true);
                    labelJ6.setText(player.getName());
                    labelJ6.setVisible(true);
                    placementMerveille(i,player.getWonder());
                    break;
                case 6:
                    player = playerList.get(i);
                    pioche7.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream( player.piochePersonnelle.get(0).front.imageResource))));
                    pioche7.setVisible(true);
                    board7.setVisible(true);
                    stick71.setVisible(true);
                    stick72.setVisible(true);
                    labelJ7.setText(player.getName());
                    labelJ7.setVisible(true);
                    placementMerveille(i,player.getWonder());
                    break;
            }
        }
        Player joueur = playerList.get(idPlayer);
        preparationActionJoueur(joueur, idPlayer);


    }

    void preparationActionJoueur(Player player, int idPlayer){
        switch (idPlayer){
            case 0:
                labelJ1.setStyle("-fx-background-color:#22d460");
                break;
            case 1:
                labelJ2.setStyle("-fx-background-color:#22d460");
                break;
            case 2:
                labelJ3.setStyle("-fx-background-color:#22d460");
                break;
            case 3:
                labelJ4.setStyle("-fx-background-color:#22d460");
                break;
            case 4:
                labelJ5.setStyle("-fx-background-color:#22d460");
                break;
            case 5:
                labelJ6.setStyle("-fx-background-color:#22d460");
                break;
            case 6:
                labelJ7.setStyle("-fx-background-color:#22d460");
                break;
        }
    }

    @FXML
    void actionJoueur(MouseEvent event){
        Node source = (Node) event.getSource();
        String id = source.getId();
        switch(id){
            case "pioche1":


        }
    }

    void placementMerveille(int numeroJoueur, Wonder wonder) {
        if(wonder == Wonder.Alexandrie){
            switch (numeroJoueur) {
                case 0 -> {
                    alexendrieBlock.setVisible(true);
                    alexendrieBlock.setLayoutX(620);
                    alexendrieBlock.setLayoutY(520);
                }
                case 4 -> {
                    alexendrieBlock.setVisible(true);
                    alexendrieBlock.setLayoutX(540);
                    alexendrieBlock.setLayoutY(15);
                }
                case 2 -> {
                    alexendrieBlock.setVisible(true);
                    alexendrieBlock.setLayoutX(20);
                    alexendrieBlock.setLayoutY(390);
                }
                case 6 -> {
                    alexendrieBlock.setVisible(true);
                    alexendrieBlock.setLayoutX(1070);
                    alexendrieBlock.setLayoutY(540);
                }
                case 1 -> {
                    alexendrieBlock.setVisible(true);
                    alexendrieBlock.setLayoutX(80);
                    alexendrieBlock.setLayoutY(15);
                }
                case 5 -> {
                    alexendrieBlock.setVisible(true);
                    alexendrieBlock.setLayoutX(1060);
                    alexendrieBlock.setLayoutY(15);
                }
                default -> {

                    alexendrieBlock.setVisible(true);
                    alexendrieBlock.setLayoutX(150);
                    alexendrieBlock.setLayoutY(540);
                }
            }
        }if(wonder == Wonder.Halicarnasse){
            switch (numeroJoueur) {
                case 0 -> {
                    halicarBlock.setVisible(true);
                    halicarBlock.setLayoutX(620);
                    halicarBlock.setLayoutY(520);
                }
                case 4 -> {
                    halicarBlock.setVisible(true);
                    halicarBlock.setLayoutX(540);
                    halicarBlock.setLayoutY(15);
                }
                case 2 -> {
                    halicarBlock.setVisible(true);
                    halicarBlock.setLayoutX(20);
                    halicarBlock.setLayoutY(390);
                }
                case 6 -> {
                    halicarBlock.setVisible(true);
                    halicarBlock.setLayoutX(1070);
                    halicarBlock.setLayoutY(540);
                }
                case 1 -> {
                    halicarBlock.setVisible(true);
                    halicarBlock.setLayoutX(150);
                    halicarBlock.setLayoutY(540);
                }
                case 5 -> {
                    halicarBlock.setVisible(true);
                    halicarBlock.setLayoutX(1060);
                    halicarBlock.setLayoutY(15);
                }
                default -> {
                    halicarBlock.setVisible(true);
                    halicarBlock.setLayoutX(80);
                    halicarBlock.setLayoutY(15);
                }
            }
        }if(wonder == Wonder.Rhodes) {
            switch (numeroJoueur) {
                case 0 -> {
                    rodesBlock.setVisible(true);
                    rodesBlock.setLayoutX(620);
                    rodesBlock.setLayoutY(520);
                }
                case 4 -> {
                    rodesBlock.setVisible(true);
                    rodesBlock.setLayoutX(540);
                    rodesBlock.setLayoutY(15);
                }
                case 2 -> {
                    rodesBlock.setVisible(true);
                    rodesBlock.setLayoutX(20);
                    rodesBlock.setLayoutY(390);
                }
                case 6 -> {
                    rodesBlock.setVisible(true);
                    rodesBlock.setLayoutX(1070);
                    rodesBlock.setLayoutY(540);
                }
                case 1 -> {
                    rodesBlock.setVisible(true);
                    rodesBlock.setLayoutX(150);
                    rodesBlock.setLayoutY(540);
                }
                case 5 -> {
                    rodesBlock.setVisible(true);
                    rodesBlock.setLayoutX(1060);
                    rodesBlock.setLayoutY(15);
                }
                default -> {
                    rodesBlock.setVisible(true);
                    rodesBlock.setLayoutX(80);
                    rodesBlock.setLayoutY(15);
                }
            }
        }if(wonder == Wonder.Ephese) {
            switch (numeroJoueur) {
                case 0 -> {
                    epheseBlock.setVisible(true);
                    epheseBlock.setLayoutX(620);
                    epheseBlock.setLayoutY(520);
                }
                case 4 -> {
                    epheseBlock.setVisible(true);
                    epheseBlock.setLayoutX(540);
                    epheseBlock.setLayoutY(15);
                }
                case 2 -> {
                    epheseBlock.setVisible(true);
                    epheseBlock.setLayoutX(20);
                    epheseBlock.setLayoutY(390);
                }
                case 6 -> {
                    epheseBlock.setVisible(true);
                    epheseBlock.setLayoutX(1070);
                    epheseBlock.setLayoutY(540);
                }
                case 1 -> {
                    epheseBlock.setVisible(true);
                    epheseBlock.setLayoutX(150);
                    epheseBlock.setLayoutY(540);
                }
                case 5 -> {
                    epheseBlock.setVisible(true);
                    epheseBlock.setLayoutX(1060);
                    epheseBlock.setLayoutY(15);
                }
                default -> {
                    epheseBlock.setVisible(true);
                    epheseBlock.setLayoutX(80);
                    epheseBlock.setLayoutY(15);
                }
            }
        }if(wonder == Wonder.Babylone) {
            switch (numeroJoueur) {
                case 0 -> {
                    babyloneBlock.setVisible(true);
                    babyloneBlock.setLayoutX(620);
                    babyloneBlock.setLayoutY(520);
                }
                case 4 -> {
                    babyloneBlock.setVisible(true);
                    babyloneBlock.setLayoutX(540);
                    babyloneBlock.setLayoutY(15);
                }
                case 2 -> {
                    babyloneBlock.setVisible(true);
                    babyloneBlock.setLayoutX(20);
                    babyloneBlock.setLayoutY(390);
                }
                case 6 -> {
                    babyloneBlock.setVisible(true);
                    babyloneBlock.setLayoutX(1070);
                    babyloneBlock.setLayoutY(540);
                }
                case 1 -> {
                    babyloneBlock.setVisible(true);
                    babyloneBlock.setLayoutX(150);
                    babyloneBlock.setLayoutY(540);
                }
                case 5 -> {
                    babyloneBlock.setVisible(true);
                    babyloneBlock.setLayoutX(1060);
                    babyloneBlock.setLayoutY(15);
                }
                default -> {
                    babyloneBlock.setVisible(true);
                    babyloneBlock.setLayoutX(80);
                    babyloneBlock.setLayoutY(15);
                }
            }
        }if(wonder == Wonder.Gizeh) {
            switch (numeroJoueur) {
                case 0 -> {
                    gizehBlock.setVisible(true);
                    gizehBlock.setLayoutX(620);
                    gizehBlock.setLayoutY(520);
                }
                case 4 -> {
                    gizehBlock.setVisible(true);
                    gizehBlock.setLayoutX(540);
                    gizehBlock.setLayoutY(15);
                }
                case 2 -> {
                    gizehBlock.setVisible(true);
                    gizehBlock.setLayoutX(20);
                    gizehBlock.setLayoutY(390);
                }
                case 6 -> {
                    gizehBlock.setVisible(true);
                    gizehBlock.setLayoutX(1070);
                    gizehBlock.setLayoutY(540);
                }
                case 1 -> {
                    gizehBlock.setVisible(true);
                    gizehBlock.setLayoutX(150);
                    gizehBlock.setLayoutY(540);
                }
                case 5 -> {
                    gizehBlock.setVisible(true);
                    gizehBlock.setLayoutX(1060);
                    gizehBlock.setLayoutY(15);
                }
                default -> {
                    gizehBlock.setVisible(true);
                    gizehBlock.setLayoutX(80);
                    gizehBlock.setLayoutY(15);
                }
            }
        }if(wonder == Wonder.Olympie) {
            switch (numeroJoueur) {
                case 0 -> {
                    olympieBlock.setVisible(true);
                    olympieBlock.setLayoutX(620);
                    olympieBlock.setLayoutY(520);
                }
                case 4 -> {
                    olympieBlock.setVisible(true);
                    olympieBlock.setLayoutX(540);
                    olympieBlock.setLayoutY(15);
                }
                case 2 -> {
                    olympieBlock.setVisible(true);
                    olympieBlock.setLayoutX(20);
                    olympieBlock.setLayoutY(390);
                }
                case 6 -> {
                    olympieBlock.setVisible(true);
                    olympieBlock.setLayoutX(1070);
                    olympieBlock.setLayoutY(540);
                }
                case 1 -> {
                    olympieBlock.setVisible(true);
                    olympieBlock.setLayoutX(150);
                    olympieBlock.setLayoutY(540);
                }
                case 5 -> {
                    olympieBlock.setVisible(true);
                    olympieBlock.setLayoutX(1060);
                    olympieBlock.setLayoutY(15);
                }
                default -> {
                    olympieBlock.setVisible(true);
                    olympieBlock.setLayoutX(80);
                    olympieBlock.setLayoutY(15);
                }
            }
        }
    }

    void drawCard(int idJoueur, Player player) {

    }


}

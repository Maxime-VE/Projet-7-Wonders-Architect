package com.projet7wondersarchitect;
import com.projet7wondersarchitect.game.Player;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.ArrayList;

import static com.projet7wondersarchitect.PlayerSelectionController.AgeJoueurs;
import static com.projet7wondersarchitect.PlayerSelectionController.NomJoueurs;
import static com.projet7wondersarchitect.domain.Wonder.*;

public class WonderSelectionController {

    @FXML
    private ImageView borderAlexendrie;

    @FXML
    private ImageView borderBabylone;

    @FXML
    private ImageView borderEphese;

    @FXML
    private ImageView borderGizeh;

    @FXML
    private ImageView borderHalicarnasse;

    @FXML
    private ImageView borderOlympie;

    @FXML
    private ImageView borderRodes;

    @FXML
    private ImageView imageAlexendrie;

    @FXML
    private ImageView imageBabylone;

    @FXML
    private ImageView imageEphese;

    @FXML
    private ImageView imageGizeh;

    @FXML
    private ImageView imageHalicarnasse;

    @FXML
    private ImageView imageOlympie;

    @FXML
    private ImageView imageRodes;

    @FXML
    private Label labelAlexendrie;

    @FXML
    private Label labelBabylone;

    @FXML
    private Label labelEphese;

    @FXML
    private Label labelGizeh;

    @FXML
    private Label labelHalicarnasse;

    @FXML
    private Label labelJoueur;

    @FXML
    private Label labelOlympie;

    @FXML
    private Label labelRodes;

    public static ArrayList<Player> playerList=new ArrayList<>();

    @FXML
    void choixAlexendrie(MouseEvent event) throws IOException {
        Player player = new Player(NomJoueurs.get(0),AgeJoueurs.get(0),Alexandrie);
        playerList.add(player);
        if(NomJoueurs.size() == 1){
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("game-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
            HelloApplication.currentStage.setScene(scene);
            HelloApplication.currentStage.show();
        }else{
            NomJoueurs.remove(0);
            AgeJoueurs.remove(0);
            imageAlexendrie.setDisable(true);
            borderAlexendrie.setDisable(true);
            labelAlexendrie.setDisable(true);
            imageAlexendrie.setOpacity(0.4);
            labelAlexendrie.setOpacity(0.4);
            borderAlexendrie.setOpacity(0.4);
            labelJoueur.setText(NomJoueurs.get(0) + " choisit sa merveille");
        }

    }

    @FXML
    void choixOlympie(MouseEvent event) throws IOException {
        Player player = new Player(NomJoueurs.get(0),AgeJoueurs.get(0),Olympie);
        playerList.add(player);
        if(NomJoueurs.size() == 1){
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("game-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
            HelloApplication.currentStage.setScene(scene);
            HelloApplication.currentStage.show();
        }else{
            NomJoueurs.remove(0);
            AgeJoueurs.remove(0);
            imageOlympie.setDisable(true);
            borderOlympie.setDisable(true);
            labelOlympie.setDisable(true);
            imageOlympie.setOpacity(0.4);
            labelOlympie.setOpacity(0.4);
            borderOlympie.setOpacity(0.4);
            labelJoueur.setText(NomJoueurs.get(0) + " choisit sa merveille");
        }

    }

    @FXML
    void choixHalicarnasse(MouseEvent event) throws IOException {
        Player player = new Player(NomJoueurs.get(0),AgeJoueurs.get(0),Halicarnasse);
        playerList.add(player);
        if(NomJoueurs.size() == 1){
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("game-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
            HelloApplication.currentStage.setScene(scene);
            HelloApplication.currentStage.show();
        }else{
            NomJoueurs.remove(0);
            AgeJoueurs.remove(0);
            imageHalicarnasse.setDisable(true);
            borderHalicarnasse.setDisable(true);
            labelHalicarnasse.setDisable(true);
            imageHalicarnasse.setOpacity(0.4);
            labelHalicarnasse.setOpacity(0.4);
            borderHalicarnasse.setOpacity(0.4);
            labelJoueur.setText(NomJoueurs.get(0) + " choisit sa merveille");
        }

    }

    @FXML
    void choixEphese(MouseEvent event) throws IOException {
        Player player = new Player(NomJoueurs.get(0),AgeJoueurs.get(0),Ephese);
        playerList.add(player);
        if(NomJoueurs.size() == 1){
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("game-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
            HelloApplication.currentStage.setScene(scene);
            HelloApplication.currentStage.show();
        }else{
            NomJoueurs.remove(0);
            AgeJoueurs.remove(0);
            imageEphese.setDisable(true);
            borderEphese.setDisable(true);
            labelEphese.setDisable(true);
            imageEphese.setOpacity(0.4);
            labelEphese.setOpacity(0.4);
            borderEphese.setOpacity(0.4);
            labelJoueur.setText(NomJoueurs.get(0) + " choisit sa merveille");
        }

    }

    @FXML
    void choixRodes(MouseEvent event) throws IOException {
        Player player = new Player(NomJoueurs.get(0),AgeJoueurs.get(0),Rhodes);
        playerList.add(player);
        if(NomJoueurs.size() == 1){
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("game-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
            HelloApplication.currentStage.setScene(scene);
            HelloApplication.currentStage.show();
        }else{
            NomJoueurs.remove(0);
            AgeJoueurs.remove(0);
            imageRodes.setDisable(true);
            borderRodes.setDisable(true);
            labelRodes.setDisable(true);
            imageRodes.setOpacity(0.4);
            labelRodes.setOpacity(0.4);
            borderRodes.setOpacity(0.4);
            labelJoueur.setText(NomJoueurs.get(0) + " choisit sa merveille");
        }

    }

    @FXML
    void choixBabylone(MouseEvent event) throws IOException {
        Player player = new Player(NomJoueurs.get(0),AgeJoueurs.get(0),Babylone);
        playerList.add(player);
        if(NomJoueurs.size() == 1){
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("game-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
            HelloApplication.currentStage.setScene(scene);
            HelloApplication.currentStage.show();
        }else{
            NomJoueurs.remove(0);
            AgeJoueurs.remove(0);
            imageBabylone.setDisable(true);
            borderBabylone.setDisable(true);
            labelBabylone.setDisable(true);
            imageBabylone.setOpacity(0.4);
            labelBabylone.setOpacity(0.4);
            borderBabylone.setOpacity(0.4);
            labelJoueur.setText(NomJoueurs.get(0) + " choisit sa merveille");
        }

    }

    @FXML
    void choixGizeh(MouseEvent event) throws IOException {
        Player player = new Player(NomJoueurs.get(0),AgeJoueurs.get(0),Gizeh);
        playerList.add(player);
        if(NomJoueurs.size() == 1){
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("game-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
            HelloApplication.currentStage.setScene(scene);
            HelloApplication.currentStage.show();
        }else{
            NomJoueurs.remove(0);
            AgeJoueurs.remove(0);
            imageGizeh.setDisable(true);
            borderGizeh.setDisable(true);
            labelGizeh.setDisable(true);
            imageGizeh.setOpacity(0.4);
            labelGizeh.setOpacity(0.4);
            borderGizeh.setOpacity(0.4);
            labelJoueur.setText(NomJoueurs.get(0) + " choisit sa merveille");
        }

    }

    @FXML
    public void onPlayButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("wonder-selection-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
        HelloApplication.currentStage.setScene(scene);
        HelloApplication.currentStage.show();
    }
    @FXML
    void testValue(MouseEvent event) {

    }
}
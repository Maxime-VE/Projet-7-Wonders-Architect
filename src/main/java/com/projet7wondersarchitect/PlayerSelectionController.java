package com.projet7wondersarchitect;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class PlayerSelectionController {

    @FXML
    private TextField Age_J_1;

    @FXML
    private TextField Age_J_2;

    @FXML
    private TextField Age_J_3;

    @FXML
    private TextField Age_J_4;

    @FXML
    private TextField Age_J_5;

    @FXML
    private TextField Age_J_6;

    @FXML
    private TextField Age_J_7;

    @FXML
    private TextField Nom_J_1;

    @FXML
    private TextField Nom_J_2;

    @FXML
    private TextField Nom_J_3;

    @FXML
    private TextField Nom_J_4;

    @FXML
    private TextField Nom_J_5;

    @FXML
    private TextField Nom_J_6;

    @FXML
    private TextField Nom_J_7;

    @FXML
    private Slider playerNumberSlider;

    @FXML
    private AnchorPane popUpJ_1;

    @FXML
    private AnchorPane popUpJ_2;

    @FXML
    private AnchorPane popUpJ_3;

    @FXML
    private AnchorPane popUpJ_4;

    @FXML
    private AnchorPane popUpJ_5;

    @FXML
    private AnchorPane popUpJ_6;

    @FXML
    private AnchorPane popUpJ_7;
    @FXML
    private Label testslider;

    public static ArrayList<String> NomJoueurs = new ArrayList();
    public static ArrayList<Integer> AgeJoueurs = new ArrayList();


    @FXML
    public void onPlayButtonClick() throws IOException {
        int slide= (int) playerNumberSlider.getValue();
        for(int i=0 ; i < slide; i++){
            if(i==0){
                NomJoueurs.add(Nom_J_1.getText());
                AgeJoueurs.add(Integer.parseInt(Age_J_1.getText()));
            } else if (i==1) {
                NomJoueurs.add(Nom_J_2.getText());
                AgeJoueurs.add(Integer.parseInt(Age_J_2.getText()));
            }else if (i==2) {
                NomJoueurs.add(Nom_J_3.getText());
                AgeJoueurs.add(Integer.parseInt(Age_J_3.getText()));
            }else if (i==3) {
                NomJoueurs.add(Nom_J_4.getText());
                AgeJoueurs.add(Integer.parseInt(Age_J_4.getText()));
            }else if (i==4) {
                NomJoueurs.add(Nom_J_5.getText());
                AgeJoueurs.add(Integer.parseInt(Age_J_5.getText()));
            }else if (i==5) {
                NomJoueurs.add(Nom_J_6.getText());
                AgeJoueurs.add(Integer.parseInt(Age_J_6.getText()));
            }else if (i==6) {
                NomJoueurs.add(Nom_J_7.getText());
                AgeJoueurs.add(Integer.parseInt(Age_J_7.getText()));
            }
        }
        System.out.println(NomJoueurs + "Nom\n" +
                AgeJoueurs+ "Age");
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("wonder-selection-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
        HelloApplication.currentStage.setScene(scene);
        HelloApplication.currentStage.show();
    }

    @FXML
    void sliderUpdate(MouseEvent event) {
        if ((int) playerNumberSlider.getValue() >= 2.5) {
            popUpJ_3.setVisible(true);
            if ((int) playerNumberSlider.getValue() >= 3.5) {
                popUpJ_4.setVisible(true);
                if ((int) playerNumberSlider.getValue() >= 4.5) {
                    popUpJ_5.setVisible(true);
                    if ((int) playerNumberSlider.getValue() >= 5.5) {
                        popUpJ_6.setVisible(true);
                        if ((int) playerNumberSlider.getValue() >= 6.5) {
                            popUpJ_7.setVisible(true);
                        }
                    }
                }
            }
        }

        if(playerNumberSlider.getValue()<=2.5){
            popUpJ_3.setVisible(false);
        }if(playerNumberSlider.getValue()<=3.5){
            popUpJ_4.setVisible(false);
        }if(playerNumberSlider.getValue()<=4.5){
            popUpJ_5.setVisible(false);
        }if(playerNumberSlider.getValue()<=5.5){
            popUpJ_6.setVisible(false);
        }if(playerNumberSlider.getValue()<=6.5){
            popUpJ_7.setVisible(false);
        }
}


}


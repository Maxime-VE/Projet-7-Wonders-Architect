package com.projet7wondersarchitect.domain;

public class PartiesConstruction extends Merveille{
    public PartiesConstruction(String nameC, String nameP, String pouvoirPartie) {
        super(nameC);
        namePartieConstruction = nameP;
        construction = false;
        avance = "Non Construite";
        pouvoir = pouvoirPartie;
    }
}

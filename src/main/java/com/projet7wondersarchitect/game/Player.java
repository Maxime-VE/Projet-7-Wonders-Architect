package com.projet7wondersarchitect.game;
import com.projet7wondersarchitect.domain.*;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final String name;
    private List<Card> inventory;
    public List<Card> piochePersonnelle;
    private int resources;
    private int victoryPoints;

    private int age;

    public Player(String name, int age) {
        this.name = name;
        this.inventory = new ArrayList<>();
        this.piochePersonnelle = new ArrayList<>();
        this.resources = 0;
        this.victoryPoints = 0;
        this.age = age ;
    }

    public void drawCard(Card card) {
        inventory.add(card);
    }

    public void playCard(Card card) {
        inventory.remove(card);
        //Placer l'ajout à la défosse ici?
    }

    public void gainResources(int resources) {
        this.resources += resources;
    }

    public void spendResources(int resources) {
        this.resources -= resources;
    }

    public void gainVictoryPoints(int victoryPoints) {
        this.victoryPoints += victoryPoints;
    }

    public String getName() {return name;}
    public int getAge() {return age;}

}


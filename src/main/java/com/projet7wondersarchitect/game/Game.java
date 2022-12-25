package com.projet7wondersarchitect.game;

import com.projet7wondersarchitect.domain.*;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    //_________________________________________________________
    // ZONE DE CREATION POUR LES TEST
    //_________________________________________________________
    static Random random = new Random();
    static Player player = new Player("Polo");
    //_________________________________________________________

    public static void main(String[] args) {
        importDeck(Wonder.Gizeh, player);
    }

    /** On prend en entrée un joueur et une merveille, on associe les deux dans cette fonction.*/
    public static void importDeck(Wonder wonder, Player player){
    player.piochePersonnelle = triCarte(wonder);

    }

    /** On prend en entrée une merveille on crée une liste de carte qu'on mélange
     * le résultat servira de pioche pour le joueur ayant la merveille en question.*/
    public static ArrayList<Card> triCarte(Wonder wonder){
        ArrayList<Card> listeCarte = new ArrayList<>();
        for(CardDecks.CardTypeQuantity cardTypeQuantity : wonder.cardDeck){
            for (int i = 0; i < cardTypeQuantity.quantity ; i++){
                listeCarte.add(new Card(cardTypeQuantity.cardType, cardTypeQuantity.cardBack));
            }
        }
        for(int triage = 0 ; triage<500 ; triage++){
            Card carteAMelanger = listeCarte.get(0);
            listeCarte.remove(0);
            int randomTriCarte = random.nextInt(listeCarte.size());
            listeCarte.add(randomTriCarte, carteAMelanger);
        }
        return listeCarte;
    }

}

package com.projet7wondersarchitect.game;

import com.projet7wondersarchitect.domain.*;

import java.util.ArrayList;

public class Game {

    public static void main(String[] args) {
        importDeck(Wonder.Gizeh);
    }

    /** On prend en entrée un joueur et une merveille, on associe les deux dans cette fonction*/
    public static void importDeck(Wonder wonder){
    ArrayList<Card> piocheJoueur;
    piocheJoueur = triCarte(wonder);
    for(Card c : piocheJoueur){
        c.displayCard();
    }
    }


    public static ArrayList<Card> triCarte(Wonder wonder){
        ArrayList<Card> listeCarte = new ArrayList<>();
        for(CardDecks.CardTypeQuantity cardTypeQuantity : wonder.cardDeck){
            for (int i = 0; i < cardTypeQuantity.quantity ; i++){
                listeCarte.add(new Card(cardTypeQuantity.cardType, cardTypeQuantity.cardBack));
            }
        }
        return listeCarte;
    }

}

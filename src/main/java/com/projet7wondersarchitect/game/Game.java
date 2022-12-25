package com.projet7wondersarchitect.game;

import com.projet7wondersarchitect.domain.*;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    static Random random = new Random();

    public static void main(String[] args) {
        importDeck(Wonder.Gizeh);
    }

    /** On prend en entrée un joueur et une merveille, on associe les deux dans cette fonction.
     * Pour le moment on affiche juste la liste des cartes*/
    public static void importDeck(Wonder wonder){
    ArrayList<Card> piocheJoueur;
    piocheJoueur = triCarte(wonder);
    for(Card c : piocheJoueur){
        c.displayCard();
    }
    System.out.println("nbr carte: " + piocheJoueur.size());
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

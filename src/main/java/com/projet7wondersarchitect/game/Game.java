package com.projet7wondersarchitect.game;

import com.projet7wondersarchitect.domain.*;

import java.util.*;

public class Game {
    //_________________________________________________________
    // ZONE DE CREATION POUR LES TEST
    //_________________________________________________________
    static Random random = new Random();
    /* static Player player = new Player("Polo",12); */
    //_________________________________________________________

    public static void main(String[] args) {
        gameInitialisation();
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

    public static void gameInitialisation() {
        System.out.println("""
                How many player want to play ?
                (You can play between 2 and 7 players).
                """);
        List<Player> playerList = new ArrayList<>();
        int playerNumbers = 2;
        int jetonNumber = nbJeton(playerNumbers);
        System.out.println("There are " + playerNumbers + " players.\n" +
                "So, during this game, there will be " + jetonNumber + " jeton.\n" +
                "");
        System.out.println("""

                    ###############################################
                    """);
        for (int i = 0; i < playerNumbers; i++) {
            System.out.println("Enter name of player " + (i + 1) + " :");
            String playerName = "Lachaud BG " + (i+1);
            System.out.println("Player " + (i+1) + " names " + playerName);
            System.out.println("Enter" + playerName + "'s age :");
            int age = random.nextInt(99); // ATTENTION le jeu est conseillé pour des joueurs de +8 (flemme de généré un nombre > +8 pour l'instant ! ).
            System.out.println(playerName + " is " + age + " years old\n");
            System.out.println("""
                    ###############################################
                    """);
            for (int j=0; j<1 ; j++){
                System.out.println("Choose a deck for " + playerName + " :");
                availableDecks();
                int deckSelect = random.nextInt(7);
                switch (deckSelect) {
                    case 0 -> wondersSelect = Wonder.Alexandrie;
                    case 1 -> wondersSelect = Wonder.Babylone;
                    case 2 -> wondersSelect = Wonder.Ephese;
                    case 3 -> wondersSelect = Wonder.Gizeh;
                    case 4 -> wondersSelect = Wonder.Halicarnasse;
                    case 5 -> wondersSelect = Wonder.Olympie;
                    case 6 -> wondersSelect = Wonder.Rhodes;
                }
                if(!wondersSelect.getAvailable()) {
                    j--;
                    System.out.println("\n");
                }
            }


            Player player = new Player(playerName, age, wondersSelect);
            playerList.add(player);
            wondersSelect.setAvailableFalse();
            importDeck(wondersSelect, playerList.get(i));
            System.out.println("""

                    ###############################################
                    """);
        }
        List<Player> fakeList = new ArrayList<>();
        fakeList = playerList;
        fakeList.sort(new AgeComparator());
        Player firtsPlayer = fakeList.get(0);
        playerList.add(0,firtsPlayer);
        playerList.remove(firtsPlayer);

        System.out.println("""
                ##############Resume game settings##############

                "Game turn order whit resume of wonders selected :
                """);
        for(Player player : playerList) {
            System.out.println(player.getName() + " with wonder deck : " + player.getChosenDeck());
        }
    }

    public static void availableDecks() {
        List<Wonder> availableDecksList = new ArrayList<>();
        availableDecksList.add(Wonder.Alexandrie);
        availableDecksList.add(Wonder.Babylone);
        availableDecksList.add(Wonder.Ephese);
        availableDecksList.add(Wonder.Gizeh);
        availableDecksList.add(Wonder.Halicarnasse);
        availableDecksList.add(Wonder.Olympie);
        availableDecksList.add(Wonder.Rhodes);
        for(int i = 0; i< availableDecksList.size(); i++) {
            if(availableDecksList.get(i).getAvailable()) {
                System.out.println("[" + (i+1) + "]: " + availableDecksList.get(i) + " : available");
            }
            else {
                System.out.println("[" + (i+1) + "]: " + availableDecksList.get(i) + " : disable");
            }
        }
    }


    /**Fonction pour définir le nombre de jetons de paix/bataille dans la partie **/
    public static int nbJeton(int nbJoueur){
        int nbJetonR = 0;
        if (nbJoueur == 2 || nbJoueur == 3){
            nbJetonR = 3;
        }
        else if (nbJoueur == 4){
            nbJetonR = 4;
        }
        else if (nbJoueur == 5){
            nbJetonR = 5;
        }
        else{
            nbJetonR = 6;
        }
        return nbJetonR;
    }


    private static Wonder wondersSelect;
}

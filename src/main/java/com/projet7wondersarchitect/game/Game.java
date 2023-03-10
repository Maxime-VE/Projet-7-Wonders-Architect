package com.projet7wondersarchitect.game;

import com.projet7wondersarchitect.domain.*;

import java.util.*;

public class Game {
    static Random random = new Random();
    public static ArrayList<Player> playerListGame =new ArrayList<>();
    private static Wonder wondersSelect;


    //_________________________________________________________
    // ZONE DE CREATION POUR LES TEST
    //_________________________________________________________
    Player sancho = new Player("Test0",15,Wonder.Alexandrie);

    Player elHombre = new Player("Test1",15,Wonder.Gizeh);


    //_________________________________________________________
    public static void main(String[] args) {
        Player sancho = new Player("Sancho",15,Wonder.Alexandrie);

        Player elHombre = new Player("ElHombreQueSoy",15,Wonder.Gizeh);
        playerListGame.add(sancho);
        playerListGame.add(elHombre);

        gameInitialisation(playerListGame); /** On génère les les joueurs. Ils sélectionnent une merveille et se voient attribué une pioche*/

        Player joueur = playerListGame.get(0);
        drawCard(joueur.piochePersonnelle, joueur);
        drawCard(joueur.piochePersonnelle, joueur);
        System.out.println("Wonder en cours : " + joueur.getWonder());
        for(Card c : joueur.inventory){
            System.out.println(c.front);
        }
        Scanner scanner = new Scanner(System.in);
        while(true){
            drawCard(joueur.piochePersonnelle, joueur);
            System.out.println("Indication paquet:");
            for(Card c : joueur.inventory){
                System.out.println(c.front);
            }
            int test = scanner.nextInt();
            verificationConstruction(joueur);
            test = scanner.nextInt();
        }

    }

    /** On prend en entrée un joueur et une merveille, on associe les deux dans cette fonction.*/
    public static void importDeckCard(Wonder wonder, Player player) {
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

    public static void gameInitialisation(ArrayList<Player> playerList) {
        int idAgeMin=0;
        int ageMin=playerList.get(0).getAge();
        for(int i=1; i < playerList.size(); i++){
            if(playerList.get(i).getAge()<ageMin){
                idAgeMin = i;
            }
        }
        for(int i=0; i<idAgeMin; i++){
            playerList.add(playerList.get(0));
            playerList.remove(0);
        }
        System.out.println("""
                ##############Resume game settings##############

                Game turn order whit resume of wonders selected :
                """);
        for(Player player : playerList) {
            importDeckCard(player.getWonder(), player);
            System.out.println(player.getName() + " with wonder deck : " + player.getWonder());
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

    // FONCTION DE TEST TEXTUEL --> A SUPPRIMER
    /**Fonction qui fait piocher une carte et met la carte dans l'inventaire du joueur*/
    public static void drawCard(List<Card> pioche, Player player){
        Card cartePiochee = pioche.get(0);
        pioche.remove(0);
        player.inventory.add(cartePiochee);

    }

    public static ArrayList<Integer> verificationConstruction(Player player){

        ArrayList<Card> materialCard = new ArrayList<Card>();
        int [][][] progression;
        ArrayList<Integer> constructionsPossibles = new ArrayList<>();
        int [] ressources = {0,0,0,0,0,0};  // [Stone,Wood,Paper,Brick,Glass,Gold]
        for(Card card : player.inventory){
            if(card.front.material != null){    //RECUPERATION DES CARTES MATERIAL
                materialCard.add(card);
            }
        }
        for(Card card : materialCard){
            switch(card.front.material){
                case Stone -> ressources[0]++;
                case Wood -> ressources[1]++;
                case Paper -> ressources[2]++;
                case Brick -> ressources[3]++;   //On fait "+1" à chaque fois que la ressource correspond
                case Glass -> ressources[4]++;
                case Gold -> ressources[5]++;

            }
        }
        int maxNbRessourceEgale;
        int maxNbRessourcesDifferente;  //On initialise les variables indiquant le nombre
        int valeurMax=0;                // de cartes = ou !=
        int differenceMax=0;

        for(int i=0; i<ressources.length; i++){
            if(valeurMax<ressources[i]){
                valeurMax=ressources[i];            //Test pour déterminer le max de cartes similaires
            }
            if(ressources[i]!=0){
                differenceMax++;                    //Test pour le nombre de cartes différents
            }
        }
        maxNbRessourceEgale = valeurMax;
        maxNbRessourcesDifferente = differenceMax;
        switch(player.getWonder()){
            case Alexandrie -> progression = progressionAlexendrie;
            case Babylone -> progression = progressionBabylone;
            case Gizeh -> progression = progressionGizeh;           //RECUPERATION DES CONTRAINTES
            case Ephese -> progression = progressionEphese;         //DE CREATION DE LA MERVEILLE
            case Halicarnasse -> progression = progressionHalicarnasse;
            case Rhodes -> progression = progressionRhodes;
            case Olympie -> progression = progressionOlympie;
            default -> progression= new int[0][][];
        }

        for(int i=progression.length-1; i>=0; i--){
            boolean estConstructible = false;
            int compteur=0;
                if(progression[i][0][compteur] == 0 || (progression[i][0][compteur] == 1 && progression[compteur][2][0] == 1)){
                    compteur++;
                    if(progression[i][0][compteur] == 0 || (progression[i][0][compteur] == 1 && progression[compteur][2][0] == 1)){
                        compteur++;
                        if(progression[i][0][compteur] == 0 || (progression[i][0][compteur] == 1 && progression[compteur][2][0] == 1)){
                            compteur++;
                            if(progression[i][0][compteur] == 0 || (progression[i][0][compteur] == 1 && progression[compteur][2][0] == 1)){
                                compteur++;
                                if(progression[i][0][compteur] == 0 || (progression[i][0][compteur] == 1 && progression[compteur][2][0] == 1)){
                                    estConstructible = true;
                                }
                            }
                        }
                    }
                }

            if(estConstructible){
                if(progression[i][2][0] == 0){          //Test "La pièce i est construite ?" (0=non; 1=oui)
                    if(progression[i][1][1] == 0){      //Test "La pièce i a besoin de matériaux similaire ?" (0=oui; 1=non)
                        if(progression[i][1][0] <= maxNbRessourceEgale){    //Test "le joueur possède assez de ressource ?"
                            constructionsPossibles.add(i);
                            break;
                        }
                    }else{
                        if(progression[i][1][0] <= maxNbRessourcesDifferente){    //Test "le joueur possède assez de ressource ?"
                            constructionsPossibles.add(i);
                            break;
                        }
                    }
                }
            }

        }
        return constructionsPossibles;


    }

    public static void constructionMerveille(Player player, ArrayList<Integer> constructionsPossibles){
        //TODO FAIRE LE CHOIX DE QUELLE PIECE MONTER SI Y A LE CHOIX + ENLEVER LES CARTES UTILISEES
        
    }

    //----------------------
    //       LISTES
    //----------------------

    /**	EXPLICATION CODE POUR LA VERIFICATION DES MERVEILLES
     * MODELE: [[vérification , coup , état] , [...] , ... ]
     * 			 ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^  ^^^^^
     * 			 		Etage de construction 1            Etage 2 ...
     * 	Vérification: liste de taille 5 de 0 ou 1 indiquant si un étage nécessite la création d'autres étages pour être construite
     * 				\----> Exemple: [1,0,0,0,0] veut dire qu'on peut créer l'étage ssi l'étage de niveau 1 est déjà construit
     * 	Coup: Le coup en ressources pour construire, c'est une liste de taille 2 indiquant le nombre de ressource puis le type de comparaison
     * 				\----> Exemple: [3,0] veut dire 3 ressources identiques et [2,1] 2 ressources différentes
     *  Etat: Equivalent booleean où 0= false = non-construit et 1 = true = construit   */


    static int [][][] progressionAlexendrie = {{{0,0,0,0,0},{2,1},{0}},{{1,0,0,0,0},{2,0},{0}},{{1,1,0,0,0},{3,1},{0}},{{1,1,1,0,0},{3,0},{0}},{{1,1,1,1,0},{4,1},{0}}};
    static int [][][] progressionBabylone = {{{0,0,0,0,0},{2,1},{0}},{{1,0,0,0,0},{2,0},{0}},{{1,1,0,0,0},{3,1},{0}},{{1,1,1,0,0},{3,0},{0}},{{1,1,1,0,0},{4,1},{0}}};
    static int [][][] progressionGizeh = {{{0,0,0,0,0},{2,1},{0}},{{1,0,0,0,0},{2,0},{0}},{{1,1,0,0,0},{3,1},{0}},{{1,1,1,0,0},{3,0},{0}},{{1,1,1,1,0},{4,1},{0}}};
    static int [][][] progressionEphese = {{{0,0,0,0,0},{2,1},{0}},{{1,0,0,0,0},{2,0},{0}},{{1,0,0,0,0},{3,1},{0}},{{1,0,0,0,0},{3,0},{0}},{{1,1,1,1,0},{4,1},{0}}};
    static int [][][] progressionHalicarnasse = {{{0,0,0,0,0},{2,1},{0}},{{1,0,0,0,0},{2,0},{0}},{{1,1,0,0,0},{3,1},{0}},{{1,1,0,0,0},{3,0},{0}},{{1,1,1,1,0},{4,1},{0}}};
    static int [][][] progressionOlympie = {{{0,0,0,0,0},{2,1},{0}},{{1,0,0,0,0},{2,0},{0}},{{1,0,0,0,0},{3,1},{0}},{{1,1,1,0,0},{3,0},{0}},{{1,1,1,1,0},{4,1},{0}}};
    static int [][][] progressionRhodes = {{{0,0,0,0,0},{2,1},{0}},{{0,0,0,0,0},{2,0},{0}},{{1,1,0,0,0},{3,1},{0}},{{1,1,1,0,0},{3,0},{0}},{{1,1,1,1,0},{4,1},{0}}};


}

package com.projet7wondersarchitect.domain;

import java.util.Random;

public class Game {
    Random rand = new Random();
    boolean built = true;
    boolean noBuilt = false;
    public Merveille[] merveille = new Merveille[5];

    String pouvoirA = "Aucun pouvoir supplémentaire";
    String pouvoirB = "+ 1 Bouclier en plus        ";
    String pouvoirC = "+ 1 Point de victoire       ";
    String pouvoirD = "+ 1 Point de progrès        ";
    String pouvoirE = "Aucun pouvoir supplémentaire";

    public void merveilleDebut(String merveilleName){
        merveille[0] = new PartiesConstruction(merveilleName, "Plancher", pouvoirA);
        merveille[1] = new PartiesConstruction(merveilleName, "Pilier gauche",pouvoirB);
        merveille[2] = new PartiesConstruction(merveilleName, "Pilier centre",pouvoirC);
        merveille[3] = new PartiesConstruction(merveilleName, "Pilier droit",pouvoirD);
        merveille[4] = new PartiesConstruction(merveilleName, "Toiture",pouvoirE);
    }

    /** Fonction vérification du jeu du joueur en fonction de chaque type**/
    public int verifPaquet(String n){
        int carte = 0;
        /**for (){ //Toute carte dans jeu de carte du joueur
            if (){ //Si le nom de cette carte est pareil que celui en paramètre
                carte += 1;
            }
        }
        **/return carte;
    }
    /** Fonction qui vérifie si la merveille est totalement construite ou non**/
    public int verifMerveille(){
        int cons = 0;
        for (int i = 0; i < 5; i++){
            if (merveille[i].construction == built){
                cons += 1;
            }
        }
        return cons;
    }

    public void afficheEtat(){
        System.out.println(merveille[0].nameConstruction);
        System.out.println(merveille[0].namePartieConstruction + " | 3 ressources identiques  | " + merveille[0].pouvoir + " | " + merveille[0].avance);
        System.out.println(merveille[1].namePartieConstruction + " | 4 ressources différentes | " + merveille[1].pouvoir + " | " + merveille[1].avance);
        System.out.println(merveille[2].namePartieConstruction + " | 4 ressources différentes | " + merveille[2].pouvoir + " | " + merveille[2].avance);
        System.out.println(merveille[3].namePartieConstruction + " | 4 ressources différentes | " + merveille[3].pouvoir + " | " + merveille[3].avance);
        System.out.println(merveille[4].namePartieConstruction + " | 3 ressources identiques  | " + merveille[4].pouvoir + " | " + merveille[4].avance + "\n" +
                "");
    }

    public void game(){
        String nameM = "Capitaine est une merveille vivante";
        merveilleDebut(nameM);
        afficheEtat();
        int carteBois = verifPaquet("Bois");
        int carteFer = verifPaquet("Fer");

        if (merveille[0].construction == noBuilt){
            if (carteBois >= 3 || carteFer >= 3){
                if (true){  //On peut construire le plancher
                    merveille[0].construction = built;
                    merveille[0].avance = "Construite";
                    //On défausse les cartes
                }
            }
        }

        else{ //Le plancher est déjà construit
            int pilier = 1 + rand.nextInt(4);

            if (merveille[pilier].construction == built){ //Si le pilier a été construit
                for (int i = 0; i < 3; i ++){ //On vérifie si tous les piliers ont été construis
                    int j = i + 1;

                    if (merveille[j].construction == noBuilt){ //Si au moins un pilier n'est pas construit
                        while (merveille[pilier].construction == built){
                            pilier = 1 + rand.nextInt(4);
                        }
                        if (carteBois >= 1 || carteFer >= 1){
                            merveille[pilier].construction = built; //On construit le pilier
                            merveille[pilier].avance = "Construite";
                            //On défausse les cartes
                        }
                        break;
                    }
                    break;
                }

                if (merveille[4].construction == noBuilt) { //Si on peut créer le toit
                    if (carteBois >= 3 || carteFer >= 3){
                        merveille[4].construction = built; //On construit le toit
                        merveille[4].avance = "Construite";
                        //On défausse les cartes
                    }
                }
            }

            else{
                if (carteBois >= 1 || carteFer >= 1){
                    merveille[pilier].construction = built; //On construit le pilier
                    merveille[pilier].avance = "Construite";
                    //On défausse les cartes
                }
            }
        }
        int avanceeMerveille = verifMerveille();
        if (avanceeMerveille == 5){
            System.out.println("La merveille " + merveille[0].nameConstruction + " est finie");
        }
    }
}

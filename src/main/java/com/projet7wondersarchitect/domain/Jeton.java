package com.projet7wondersarchitect.domain;

import java.util.ArrayList;
import java.util.Random;

public class Jeton {
    Random rand = new Random();
    public int nbJeton(int nbJoueur){
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

    Jeton2[] listeJeton;
    int numberJeton;

    public void changeJeton(){
        listeJeton = new Jeton2[numberJeton];
        for (int i = 0; i < numberJeton; i++){
            listeJeton[i] = new JetonPaix("Jeton Paix");
        }
        int nbJetonBataille = 0;
        while (nbJetonBataille < numberJeton){
            int nbBouclier = rand.nextInt(2);
            if (nbJetonBataille + nbBouclier < numberJeton){
                if (nbBouclier > 0){
                    for (int j = 0; j < nbBouclier; j++){
                        listeJeton[nbJetonBataille] = new JetonPaix("Jeton de Bataille");
                    }
                }
                nbJetonBataille += nbBouclier;
            }
            System.out.println("\n" +
                    "Il y a " + nbBouclier + " de tirer pour ce tour.\n" +
                    "");
            System.out.println(listeJeton);
        }
        System.out.println("""

                C'est l'heure de la bataille
                """);
        for (int i = 0; i < numberJeton; i++){
            listeJeton[i] = new JetonPaix("Jeton Paix");
        }
    }
}

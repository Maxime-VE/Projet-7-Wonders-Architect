package com.projet7wondersarchitect.domain;

public class Jeton {
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
}

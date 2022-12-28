package com.projet7wondersarchitect.domain;

public abstract class Merveille {
    public Merveille (String nameC){
        nameConstruction = nameC;
    }

    public String nameConstruction;
    public String namePartieConstruction;
    public boolean construction;
    public String avance;
    public String pouvoir;
}

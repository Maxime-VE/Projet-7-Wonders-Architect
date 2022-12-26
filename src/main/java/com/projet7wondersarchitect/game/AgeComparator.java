package com.projet7wondersarchitect.game;

import java.util.Comparator;

public class AgeComparator implements Comparator<Player> {
    @Override
    public int compare(Player playerAge1, Player playerAge2) {
        /* if(playerAge1.getAge() < playerAge2.getAge()) {
            return -1;
        } else {
            return 1;
        } */
        return playerAge1.getAge() - playerAge2.getAge();
    }

}

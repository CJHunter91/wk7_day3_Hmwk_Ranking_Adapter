package com.codeclan.gladiators;

import java.util.ArrayList;

/**
 * Created by user on 09/08/2017.
 */

public class TopGladiators {
    private ArrayList<Gladiator> topList;

    public TopGladiators(){
        topList = new ArrayList<>();
        topList.add(new Gladiator(1,"Spartacus", 50, "65BC"));
        topList.add(new Gladiator(2,"Flamma", 46, "32BC"));
        topList.add(new Gladiator(3,"Commudus", 43, "192AD"));
        topList.add(new Gladiator(4,"Crixus", 38, "68BC"));
        topList.add(new Gladiator(5,"Carpophorus", 32, "231AD"));
        topList.add(new Gladiator(6,"Marcus Attilius", 29, "234BC"));
        topList.add(new Gladiator(7,"Hermes", 23, "26BC"));
        topList.add(new Gladiator(8,"Spiculus", 16, "68AD"));
        topList.add(new Gladiator(9,"Tetraites", 8, "34BC"));
        topList.add(new Gladiator(10,"You", 0, "1991AD"));
    }

    public ArrayList<Gladiator> getList(){
        return topList;
    }

}

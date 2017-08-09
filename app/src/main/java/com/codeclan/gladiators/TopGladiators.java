package com.codeclan.gladiators;

import java.util.ArrayList;

/**
 * Created by user on 09/08/2017.
 */

public class TopGladiators {
    private ArrayList<Gladiator> topList;

    public TopGladiators(){
        topList = new ArrayList<>();
        topList.add(new Gladiator("Spartacus", 50, "65BC"));
        topList.add(new Gladiator("Flamma", 46, "32BC"));
        topList.add(new Gladiator("Commudus", 43, "192AD"));
        topList.add(new Gladiator("Crixus", 38, "68BC"));
        topList.add(new Gladiator("Carpophorus", 32, "231AD"));
        topList.add(new Gladiator("Marcus Attilius", 29, "234BC"));
        topList.add(new Gladiator("Hermes", 23, "26BC"));
        topList.add(new Gladiator("Spiculus", 16, "68AD"));
        topList.add(new Gladiator("Tetraites", 8, "34BC"));
        topList.add(new Gladiator("You", 0, "1991AD"));
    }

    public ArrayList<Gladiator> getList(){
        return topList;
    }

}

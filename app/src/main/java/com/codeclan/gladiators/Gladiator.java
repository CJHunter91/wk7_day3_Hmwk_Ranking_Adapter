package com.codeclan.gladiators;

/**
 * Created by user on 09/08/2017.
 */

public class Gladiator {

    private String name;
    private int wins;
    private String dob;

    public Gladiator(String name, int wins, String dob){
        this.name = name;
        this.wins = wins;
        this.dob = dob;
    }


    public String getName() {
        return name;
    }

    public int getWins() {
        return wins;
    }

    public String getDob() {
        return dob;
    }
}

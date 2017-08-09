package com.codeclan.gladiators;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 09/08/2017.
 */

public class TopGladiatorsTest {

    @Test
    public void canGetCorrectListSize(){
        TopGladiators rankings = new TopGladiators();
        assertEquals(10, rankings.getList().size());
    }
}

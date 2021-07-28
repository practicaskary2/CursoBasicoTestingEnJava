package com.kary.javatests.player;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void loseWhenDiceNumberIsTooLow(){

        //Crear un dado simulado con mockito
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(2);

        Player player = new Player(dice,3);
        assertFalse(player.play());
    }

    @Test
    public void winWhenDiceNumberIsBig(){

        //Crear un dado simulado con mockito
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(4);

        Player player = new Player(dice,3);
        assertTrue(player.play());
    }

}
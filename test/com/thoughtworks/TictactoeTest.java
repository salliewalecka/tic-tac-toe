package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class TictactoeTest {

    private PrintStream printStream;
    private Tictactoe game;

    @Before
    public void setUp(){
        printStream = mock(PrintStream.class);
        game = new Tictactoe(printStream);
    }
    
    @Test
    public void shouldDrawBoardWhenStarts(){
        game.printBoard();

        verify(printStream).println(contains(
                "  |   | \n" +
                "---------\n" +
                "  |   | \n" +
                "---------\n" +
                "  |   |"));
    }

    @Test
    public void shouldPrintXinUpperLeftWhenUpdatingBoardWithInput1(){
        game.updateBoard(0);

        verify(printStream).println(contains(
                " X|   | \n" +
                "---------\n" +
                "  |   | \n" +
                "---------\n" +
                "  |   |"));
    }


}
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

    @Test
    public void shouldPrintPlayer1then2WhenUpdatesBoardTwice(){
        game.printBoard();
        verify(printStream).println(contains("Player 1's Turn"));
        game.updateBoard(1);
        verify(printStream).println(contains("Player 2's Turn"));
    }

    @Test
    public void shouldPrintXThenOWhenUpdatesBoardTwice(){
        game.updateBoard(1);
        verify(printStream).println(contains("X"));
        game.updateBoard(2);
        verify(printStream).println(contains("O"));
    }

    @Test
    public void shouldKeepBothXAndOWhenUpdatesTwice(){
        game.updateBoard(0);
        game.updateBoard(1);
        verify(printStream).println(contains(
                " X| O | \n" +
                        "---------\n" +
                        "  |   | \n" +
                        "---------\n" +
                        "  |   |"));

    }



}
package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


public class GameTest {
//
//    private Game game;
//    private Board board;
//    private PrintStream printStream;
//    private BufferedReader reader;
//    private Player player1;
//    private Player player2;
//
//    @Before
//    public void setUp(){
//        printStream = mock(PrintStream.class);
//        board = mock(Board.class);
//        reader= mock(BufferedReader.class);
//        player1=mock(Player.class);
//        player2=mock(Player.class);
//        game = new Game(player1 , player2, board);
//    }
//
//
//    @Test
//    public void shouldReturnPlayer1WhenEvenTurn()  {
//        assertEquals(game.whoseTurn(0), player1);
//    }
//
//    @Test
//    public void shouldAlternatePlayer2WhenOddTurn()  {
//        assertEquals(game.whoseTurn(1), player2);
//    }
//
//    @Test
//    public void shouldMakeMovesUntilBoardIsFilled()  {
//        when(board.filledBoard()).thenReturn(false).thenReturn(false).thenReturn(false).thenReturn(true);
//        when(player1.makeMove()).thenReturn(true);
//        when(player2.makeMove()).thenReturn(true);
//        game.run();
//        verify(player1, times(2)).makeMove();
//    }



}
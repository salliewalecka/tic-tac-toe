package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.*;

public class PlayerTest {
//    private Board board;
//    private PrintStream printStream;
//    private BufferedReader reader;
//    private Player player;
//    private final String DEFAULT_MOVE="1";
//    private final char symbol='O';
//
//    @Before
//    public void setUp(){
//        printStream = mock(PrintStream.class);
//        board = mock(Board.class);
//        reader= mock(BufferedReader.class);
//        player= new Player(printStream,reader, board,symbol);
//    }
//
//    @Test
//    public void shouldPrintMoveMessageWhenPlayerGetsMove() throws IOException {
//        when(reader.readLine()).thenReturn(DEFAULT_MOVE);
//
//        player.makeMove();
//
//        verify(printStream).println(contains("Make a move by entering an integer from 1-9"));
//
//    }
//
//    @Test
//    public void shouldReturnPositionWhenPlayerEntersMove() throws IOException {
//        when(reader.readLine()).thenReturn(DEFAULT_MOVE);
//
//        player.makeMove();
//
//        verify(board,times(1)).updateBoard(0, symbol);
//    }
//
//


}
package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.*;


public class ConsuleTest {

    private Consule consule;
    private Tictactoe game;
    private PrintStream printStream;
    private BufferedReader reader;

    @Before
    public void setUp(){
        printStream = mock(PrintStream.class);
        game = mock(Tictactoe.class);
        reader= mock(BufferedReader.class);
        consule = new Consule(printStream, reader, game);
    }

    @Test
    public void shouldHaveBoardPrintWhenStart(){

        consule.start();

        verify(game, times(1)).printBoard();
    }

    @Test
    public void shouldPromptPlayerToMoveWhenPromptsMove() throws IOException {

        when(reader.readLine()).thenReturn("1");

        consule.promptMove();

        verify(printStream).println(contains("Player 1: make a move by entering an integer from 1-9"));

    }

    @Test
    public void shouldTakePlayersInputWhenPromptsPlayer() throws IOException {

        when(reader.readLine()).thenReturn("1");

        consule.promptMove();

        verify(reader, times(1)).readLine();

    }

    @Test
    public void shouldRecordPlayersInputWhenPromptsPlayer() throws IOException {
        when(reader.readLine()).thenReturn("1");

        assertThat(consule.promptMove(), is(0));
    }

    @Test
    public void shouldPrintNewBoardWhenPlayerMoces() throws IOException {
        when(reader.readLine()).thenReturn("1");

        consule.makeMove();

        verify(game, times(1)).updateBoard(0);
    }


}
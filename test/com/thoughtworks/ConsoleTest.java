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


public class ConsoleTest {

    private Console console;
    private Tictactoe game;
    private PrintStream printStream;
    private BufferedReader reader;

    @Before
    public void setUp(){
        printStream = mock(PrintStream.class);
        game = mock(Tictactoe.class);
        reader= mock(BufferedReader.class);
        console = new Console(printStream, reader, game);
    }

    @Test
    public void shouldHaveBoardPrintWhenStart(){
        console.start();

        verify(game, times(1)).printBoard();
    }

    @Test
    public void shouldPromptPlayerToMoveWhenPromptsMove() throws IOException {
        when(reader.readLine()).thenReturn("1");

        console.promptMove();

        verify(printStream).println(contains("Make a move by entering an integer from 1-9"));

    }

    @Test
    public void shouldTakePlayersInputWhenPromptsPlayer() throws IOException {
        when(reader.readLine()).thenReturn("1");

        console.promptMove();

        verify(reader, times(1)).readLine();

    }

    @Test
    public void shouldRecordPlayersInputWhenPromptsPlayer() throws IOException {
        when(reader.readLine()).thenReturn("1");

        assertThat(console.promptMove(), is(0));
    }

    @Test
    public void shouldPrintNewBoardWhenPlayerMoves() throws IOException {
        when(reader.readLine()).thenReturn("1");

        console.makeMove();

        verify(game, times(1)).updateBoard(0);
    }

    @Test
    public void shouldPromptTwoMovesWhenStarts() throws IOException {
        when(reader.readLine()).thenReturn("1").thenReturn("2");
        when(game.updateBoard(anyInt())).thenReturn(true);

        console.run();

        verify(game, times(1)).updateBoard(0);
        verify(game, atLeast(1)).updateBoard(1);
    }

    @Test
    public void shouldPromptMovesUntilBoardIsFilled() throws IOException {
        when(reader.readLine()).thenReturn("1").thenReturn("2").thenReturn("3")
                .thenReturn("4").thenReturn("5").thenReturn("6").thenReturn("7")
                .thenReturn("8").thenReturn("9")
                .thenReturn("1");
        when(game.updateBoard(anyInt())).thenReturn(true);

        console.run();

        verify(game, times(9)).updateBoard(anyInt());

    }

    @Test
    public void shouldPrintGameOverWhenBoardIsFilled() throws IOException {
        when(reader.readLine()).thenReturn("1").thenReturn("2").thenReturn("3")
                .thenReturn("4").thenReturn("5").thenReturn("6").thenReturn("7")
                .thenReturn("8").thenReturn("9");
        when(game.updateBoard(anyInt())).thenReturn(true);

        console.run();

        verify(printStream).println("Game is a Draw");

    }
}
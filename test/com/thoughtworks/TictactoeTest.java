package com.thoughtworks;

import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class TictactoeTest {


    @Test
    public void shouldDrawBoardWhenStarts(){
        PrintStream printStream = mock(PrintStream.class);
        Tictactoe game = new Tictactoe(printStream);

        game.start();

        verify(printStream).print(contains("  |   |\n" +
                "---------\n" +
                "  |   |\n" +
                "---------\n" +
                "  |   |"));
    }


}
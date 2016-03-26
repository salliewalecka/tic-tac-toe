package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class BoardTest {

    private PrintStream printStream;
//    private final Character DEFAULT_SYMBOL = 'X';
    private List<Character> positions = asList(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ');
    private Board board;


    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        board = new Board(printStream, positions);
    }

    @Test
    public void shouldFormatBoardWhenPrintBoard() {

        board = new Board(printStream, asList('1', '2', '3', '4', '5', '6', '7', '8', '9'));
        board.printBoard();

        verify(printStream).println(contains(
                " 1| 2 |3\n" +
                        "---------\n" +
                        " 4| 5 |6\n" +
                        "---------\n" +
                        " 7| 8 |9"));
    }

//    @Test
//    public void shouldUpdatePositionsWhenUpdateBoard() {
//        board.updateBoard(0, DEFAULT_SYMBOL);
//        assertEquals(positions.get(0), DEFAULT_SYMBOL);
//    }
//
//    @Test
//    public void shouldNotUpdateWhenPlaceTaken() {
//        board.updateBoard(0, DEFAULT_SYMBOL);
//        assertFalse(board.updateBoard(0, DEFAULT_SYMBOL));
//    }
//
//    @Test
//    public void shouldAlertPlayerWhenInvalidChoice() {
//        board.updateBoard(1, DEFAULT_SYMBOL);
//        board.updateBoard(1, DEFAULT_SYMBOL);
//
//        verify(printStream).println("Location already taken. Try again!");
//    }
//
//    @Test
//    public void shouldReportDrawWhenBoardFilled() {
//        board = new Board(printStream, asList('1', '2', '3', '4', '5', '6', '7', '8', '9'));
//        assertTrue(board.filledBoard());
//    }
//
//    @Test
//    public void shouldNotReportDrawWhenBoardIsNotFilled() {
//        assertFalse(board.filledBoard());
//    }
//
//    @Test
//    public void shouldPrintDrawWhenBoardFilled() {
//        board = new Board(printStream, asList('1', '2', '3', '4', '5', '6', '7', '8', '9'));
//        board.filledBoard();
//        verify(printStream).println("Game is a Draw");
//    }
//
//    @Test
//    public void shouldNotPrintDrawWhenBoardIsNotFilled() {
//        board.filledBoard();
//        verify(printStream, never()).println();
//    }
//
//    @Test
//    public void shouldPrintNewBoardWhenUpdateBoard() {
//        board.updateBoard(0 , DEFAULT_SYMBOL);
//
//        //ASK
//
//    }
}
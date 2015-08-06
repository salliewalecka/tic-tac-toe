package com.thoughtworks;


import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Tictactoe {

    private PrintStream printStream;
    private char[] board= new char[9];

    public Tictactoe(PrintStream printStream) {
        this.printStream=printStream;
        Arrays.fill(board , ' ');
    }

    public void printBoard() {
        printStream.println(
                " "+board[0]+"| "+board[1]+" |"+board[2]+"\n" +
                "---------\n" +
                " "+board[3]+"| "+board[4]+" |"+board[5]+"\n" +
                "---------\n" +
                " "+board[6]+"| "+board[7]+" |"+board[8]+"\n");

    }


    public void updateBoard(int i) {
        board[i]='X';
        printBoard();
    }
}

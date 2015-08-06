package com.thoughtworks;


import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Tictactoe {

    private PrintStream printStream;
    private char[] board= new char[9];
    private int turn = 0;

    public Tictactoe(PrintStream printStream) {
        this.printStream=printStream;
        Arrays.fill(board, ' ');
    }

    public void printBoard() {
        printStream.println(
                " " + board[0] + "| " + board[1] + " |" + board[2] + "\n" +
                        "---------\n" +
                        " " + board[3] + "| " + board[4] + " |" + board[5] + "\n" +
                        "---------\n" +
                        " " + board[6] + "| " + board[7] + " |" + board[8] + "\n");

        printTurn();
    }

    public void printTurn(){
        printStream.println("Player "+(turn+1)+"'s Turn");
    }

    public void updateBoard(int i) {
        if(turn==0){
            board[i]='X';
        }
        else{
            board[i]='O';
        }
        turn= (turn+1)%2;
        printBoard();
    }

}

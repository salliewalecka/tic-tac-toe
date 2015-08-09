package com.thoughtworks;

import java.io.BufferedReader;
import java.io.PrintStream;

public class Game {

    private BufferedReader reader;
    private PrintStream printStream;
    private Board board;
    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2, Board board) {
        this.player1=player1;
        this.player2 = player2;
        this.board = board;
    }


    public void run() {
        int i=0;
        while(!board.filledBoard()){
            if(whoseTurn(i).makeMove()){
                i++;
            }
        }
    }

    public Player whoseTurn(int toggle){
        if(toggle%2==0){ return player1;}
        return player2;
    }
}


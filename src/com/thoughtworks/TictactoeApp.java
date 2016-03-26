package com.thoughtworks;


import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.util.Arrays.asList;

public class TictactoeApp {


    public static void main(String[] args) {

        Board board = new Board(System.out, asList(' ',' ',' ',' ',' ',' ',' ',' ',' '));
        Player player1=new Player(System.out, new BufferedReader(new InputStreamReader(System.in)), board, 'X');
        Player player2= new Player(System.out, new BufferedReader(new InputStreamReader(System.in)), board, 'O');
        Game game = new Game(player1, player2, board);
        board.printBoard();
//        game.run();

    }

}


package com.thoughtworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class Player {


    private PrintStream printStream;
    private BufferedReader reader;
    private Board game;
    private char symbol;

    public Player(PrintStream printStream, BufferedReader reader, Board game, char symbol) {
        this.printStream=printStream;
        this.reader=reader;
        this.game=game;
        this.symbol=symbol;
    }

    private int getMove() {
        printStream.println("Make a move by entering an integer from 1-9");

        try{
            String response= reader.readLine();
            int move= Integer.parseInt(response);
            return move-1;

        }
        catch (IOException e){
            printStream.print("IOException Found");

        }

        return -1;
    }

    public boolean makeMove() {
        return true;
    }
//    public boolean makeMove() {
//        return game.updateBoard(getMove(),symbol);
//    }


}

package com.thoughtworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class Consule {


    private BufferedReader reader;
    private PrintStream printStream;
    private Tictactoe game;

    public Consule(PrintStream printStream, BufferedReader reader, Tictactoe game) {
        this.game=game;
        this.printStream=printStream;
        this.reader=reader;
    }

    public int promptMove() {
        printStream.println("Player 1: make a move by entering an integer from 1-9");

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

    public void start() {
        game.printBoard();
    }

    public void makeMove() {
        game.updateBoard(promptMove());
    }
}

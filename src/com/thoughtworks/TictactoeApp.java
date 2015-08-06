package com.thoughtworks;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TictactoeApp {

    public static void main(String[] args) {

        Tictactoe game= new Tictactoe(System.out);
        Consule consule= new Consule(System.out,  new BufferedReader(new InputStreamReader(System.in)), game);
        consule.start();
        consule.makeMove();
    }


}

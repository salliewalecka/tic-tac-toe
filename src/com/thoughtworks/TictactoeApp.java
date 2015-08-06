package com.thoughtworks;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TictactoeApp {

    public static void main(String[] args) {

        Tictactoe game= new Tictactoe(System.out);
        Console console = new Console(System.out,  new BufferedReader(new InputStreamReader(System.in)), game);
        console.start();
        console.run();
    }

}


package com.thoughtworks;


import java.io.PrintStream;

public class Tictactoe {

    private PrintStream printStream;

    public Tictactoe(PrintStream printStream) {
        this.printStream=printStream;
    }

    public void start() {

        printStream.print("  |   |\n" +
                "---------\n" +
                "  |   |\n" +
                "---------\n" +
                "  |   |");

    }



}

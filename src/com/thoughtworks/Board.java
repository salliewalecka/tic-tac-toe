package com.thoughtworks;


import java.io.PrintStream;
import java.util.List;

public class Board {

    private PrintStream printStream;
    private List<Character> positions;
//    private int turn = 0;

    public Board(PrintStream printStream, List<Character> positions) {
        this.printStream = printStream;
        this.positions = positions;
    }

    //SHOULD BE PRIVATE BUT HOW TO TEST?
    public void printBoard() {
        printStream.println(
                " " + positions.get(0) + "| " + positions.get(1) + " |" + positions.get(2) + "\n" +
                        "---------\n" +
                        " " + positions.get(3) + "| " + positions.get(4) + " |" + positions.get(5) + "\n" +
                        "---------\n" +
                        " " + positions.get(6) + "| " + positions.get(7) + " |" + positions.get(8) + "\n");
    }

//    public boolean updateBoard(int i, char symbol) {
//        if (positions.get(i) == ' ') {
//            positions.set(i, symbol);
//            printBoard();
//            return true;
//        }
//        printStream.println("Location already taken. Try again!");
//        return false;
//    }
//
//
//    public boolean filledBoard() {
//        for (char c : positions) {
//            if (c == ' ') {
//                return false;
//            }
//        }
//        printStream.println("Game is a Draw");
//        return true;
//    }

   /* //-1 if no winner yet
    public int winner() {
        if (checkLeftDiag()!=-1) {
            return checkLeftDiag();
        }
        if (checkRightDiag()!=-1) {
            return checkRightDiag();
        }
        if (checkRows()!=-1) {
            return checkRows();
        }
        if (checkColumns()!=-1) {
            return checkColumns();
        }
        return -1;
    }

    private int checkLeftDiag() {
        if (positions[0] == positions[4] && positions[4] == positions[8]) {
            if (positions[0] == 'X') {
                return 1;
            } else {
                return 2;
            }
        }
        return -1;
    }

    private int checkRightDiag() {
        if (positions[2] == positions[4] && positions[4] == positions[6]) {
            if (positions[2] == 'X') {
                return 1;
            } else {
                return 2;
            }
        }

        return -1;
    }

    private int checkRows() {
        for (int i = 0; i < 3; i++) {
            if (positions[i * 3] == positions[i * 3 + 1] && positions[i * 3 + 1] == positions[i * 3 + 2]) {
                if (positions[i] == 'X') {
                    return 1;
                } else {
                    return 2;
                }
            }
        }
        return -1;
    }

    private int checkColumns() {
        for (int i = 0; i < 3; i++) {
            if (positions[i + 3] == positions[i + 3] && positions[i + 3] == positions[i + 6]) {
                if (positions[i] == 'X') {
                    return 1;
                } else {
                    return 2;
                }
            }
        }
        return -1;
    }
*/

}

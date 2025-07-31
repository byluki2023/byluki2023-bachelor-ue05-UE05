package se.jku.at.exercise;

import se.jku.at.inout.In;
import se.jku.at.inout.Out;

public class A06_TicTacToeConnectThree {
    public static final String DELIMITER_LINE = " +---+---+---+";
    public static final String DELIMITER_SYMBOL = " | ";
    public static final char EMPTY_CHAR = ' ';
    public static final char X_PLAYER = 'X';
    public static final char O_PLAYER = 'O';

    // variables of the coordinates
    public static char row1col1 = EMPTY_CHAR;
    public static char row1col2 = EMPTY_CHAR;
    public static char row1col3 = EMPTY_CHAR;
    public static char row2col1 = EMPTY_CHAR;
    public static char row2col2 = EMPTY_CHAR;
    public static char row2col3 = EMPTY_CHAR;
    public static char row3col1 = EMPTY_CHAR;
    public static char row3col2 = EMPTY_CHAR;
    public static char row3col3 = EMPTY_CHAR;

    public static char currentPlayer = X_PLAYER;

    public static void main(String[] args) {
        //TODO: Hier Code einfügen
    }

    /**
     * Places the current player character in the given column.
     */
    public static void putInColumn(int userColumn) {
        //TODO: Hier Code einfügen
    }

    /**
     * Determines if the given column is already full on the game grid
     */
    public static boolean isOccupied(int userColumn) {
        //TODO: Hier Code einfügen
        return false; //Änderbar
    }

    /**
     * Determines whether the board grid is completely filled
     */
    public static boolean boardIsFull() {
        //TODO: Hier Code einfügen
        return false; //Änderbar
    }

    /**
     * Determines whether there is a winner on the board and returns the character of the winner.
     * In case there is no winner, function returns the EMPTY_CHAR.
     */
    public static char getWinner() {
        //TODO: Hier Code einfügen
        return 'X'; //Änderbar
    }

    /**
     * Validates the input column number to be within the TicTacToe board range.
     */
    public static boolean isOutsideBoard(int inputColumn) {
        //TODO: Hier Code einfügen
        return false; //Änderbar
    }

    /**
     * Prints out the TicTacToe board with all the values.
     */
    public static void printBoard() {
        //TODO: Hier Code einfügen
    }
}

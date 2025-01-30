package gr.aueb.cf.ch10.revisionProjects;

import java.util.Scanner;

/**
 * Tic Tac Toe Game : Ανάπτυξη ενός παιχνιδιού Τρίλιζας (Tic-Tac-Toe) για δύο παίκτες που παίζουν Χ και Ο.
 * Το παιχνίδι πρέπει να ελέγχει τη νίκη, την ισοπαλία και να μην επιτρέπει διπλή τοποθέτηση συμβόλων.
 */
public class Project4 {

    private static final int SIZE = 3;
    private static final char[][] board = new char[SIZE][SIZE];
    private static char currentPlayer = 'X';

    public static void main(String[] args) {
        initializeBoard();
        playGame();
    }

    private static void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = ' ';
            }
        }
    }

    private static void playGame() {
        Scanner scanner = new Scanner(System.in);
        boolean gameOngoing = true;

        while (gameOngoing) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", enter your move (row [0-2] and column [0-2]): ");

            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (isValidMove(row, col)) {
                board[row][col] = currentPlayer;

                if (checkWin()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameOngoing = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("The game is a tie!");
                    gameOngoing = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
        scanner.close();
    }

    private static void printBoard() {
        System.out.println("---------");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(" " + board[i][j]);
                if (j < SIZE - 1) {
                    System.out.print(" |");
                }
            }
            System.out.println();
            if (i < SIZE - 1) {
                System.out.println("---|---|---");
            }
        }
        System.out.println("---------");
    }

    private static boolean isValidMove(int row, int col) {
        return row >= 0 && row < SIZE && col >= 0 && col < SIZE && board[row][col] == ' ';
    }

    private static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    private static boolean checkWin() {
        for (int i = 0; i < SIZE; i++) {
            // Check rows and columns
            if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) ||
                    (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {
                return true;
            }
        }
        // Check diagonals
        return (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
                (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer);
    }

    private static boolean isBoardFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}


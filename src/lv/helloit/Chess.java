package lv.helloit;

import lv.helloit.pieces.Figure;
import lv.helloit.pieces.Pawn;

public class Chess {
    private Figure[][] board = new Figure[8][8];

    public static void main(String[] args) {
        Chess c = new Chess();
        c.fillPawns(true);
        c.fillPawns(false);
        c.print();
    }

    private void print() {
        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    private void fillPawns(boolean isWhite) {
        int rowIndex = isWhite ? 1 : 6;

        for (int i = 0; i < 8; ++i) {
            board[rowIndex][i] = new Pawn(isWhite);
        }
    }
}
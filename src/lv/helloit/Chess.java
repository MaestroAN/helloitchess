package lv.helloit;

import lv.helloit.pieces.Pawn;

public class Chess {
    private Field[][] board;

    public Chess() {
        this.board = new Field[8][8];

        this.initBoard();
        this.fillPawns(true);
        this.fillPawns(false);
    }

    public void start() {
        this.print();
    }

    private void print() {
        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    private void initBoard() {
        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                board[i][j] = new Field();
            }
        }
    }
    private void fillPawns(boolean isWhite) {
        int rowIndex = isWhite ? 1 : 6;

        for (int i = 0; i < 8; ++i) {
            board[rowIndex][i] = new Field(new Pawn(isWhite));
        }
    }
}
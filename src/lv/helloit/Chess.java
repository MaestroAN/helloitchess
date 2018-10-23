package lv.helloit;

import lv.helloit.pieces.Pawn;

import java.util.Scanner;

public class Chess {
    private Field[][] board;
    private boolean whiteTurn;

    public void start() {
        this.board = new Field[8][8];
        this.whiteTurn = true;

        this.initBoard();
        this.fillPawns(true);
        this.fillPawns(false);

        this.startGameLoop();
    }

    private void startGameLoop() {
        while (true) {
            this.print();

            Move move = readPlayerMove();
            board[move.to.x][move.to.y] = board[move.from.x][move.from.y];
            board[move.from.x][move.from.y] = new Field();
        }
    }

    private Move readPlayerMove() {
        Scanner sc = new Scanner(System.in);

        System.out.printf("It's %s turn. Enter your move: \n From: \n", this.whiteTurn ? "white" : "black");
        String fromX = sc.nextLine();
        String fromY = sc.nextLine();

        System.out.println("To:");
        String toX = sc.nextLine();
        String toY = sc.nextLine();

        return new Move.Builder()
                .from(new Coords.Builder()
                        .x((byte) (Byte.parseByte(fromX) - 1))
                        .y((byte) (Byte.parseByte(fromY) - 1))
                        .build())
                .to(new Coords.Builder()
                        .x((byte) (Byte.parseByte(toX) - 1))
                        .y((byte) (Byte.parseByte(toY) - 1))
                        .build())
                .build();
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
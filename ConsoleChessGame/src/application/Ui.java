package application;

import chess.ChessPiece;

public class Ui {

    public static void printBoard(ChessPiece[][] pieces) {
        for (var i = 0; i < pieces.length; i++) {
            System.out.print((8 - i) + " ");
            for (var j = 0; j < pieces.length; j++) {
                printPiece(pieces[i][j]);
            }
            System.out.println();
        }
        System.out.print("  a b c d e f g h");
    }

    private static void printPiece(ChessPiece chessPiece) {
        if (chessPiece == null) {
            System.out.print("-");
        } else {
            System.out.print(chessPiece);
        }
        System.out.print(" ");
    }
}

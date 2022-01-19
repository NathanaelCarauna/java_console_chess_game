package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            Ui.printBoard(chessMatch.getPieces());
            System.out.println();

            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = Ui.readChessPosition(sc);

            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = Ui.readChessPosition(sc);

            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
        }
    }
}

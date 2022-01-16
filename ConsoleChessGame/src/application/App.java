package application;
import chess.ChessMatch;

public class App {

    public static void main(String[] args) throws Exception {
        ChessMatch chessMatch = new ChessMatch();
        Ui.printBoard(chessMatch.getPieces());
    }
}

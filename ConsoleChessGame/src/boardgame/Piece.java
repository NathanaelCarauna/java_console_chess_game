package boardgame;

public class Piece {
    protected Position position;
    private Board board;

    /**
     * @param board
     */
    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    /**
     * @return the board
     */
    protected Board getBoard() {
        return board;
    }

}

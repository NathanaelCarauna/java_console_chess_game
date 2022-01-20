package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {
    private Color color;

    /**
     * @param board
     * @param color
     */
    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Checks if there is an opponent at the specified position
     * @param position
     * @return
     */
    protected boolean isThereOpponentPiece(Position position){
        ChessPiece chessPiece = (ChessPiece) getBoard().piece(position);
        return chessPiece != null && chessPiece.getColor() != color;
    }
}

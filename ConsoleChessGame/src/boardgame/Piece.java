package boardgame;

public abstract class Piece {
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

    /**
     * Return a boolean matrix indicating what positions the piece can be moved to
     * @return boolean matrix
     */
    public abstract boolean[][] possibleMoves();

    /**
     * Return boolean value indicating if the piece can be moved to the specified position
     * @param position
     * @return if piece can be moved to position received
     */
    public boolean possibleMove(Position position){
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove(){
        boolean[][] possibleMovesMatrix = possibleMoves();
        for(int i = 0; i< possibleMovesMatrix.length; i++){
            for(int j = 0; j< possibleMovesMatrix.length; j++){
                if(possibleMovesMatrix[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
}

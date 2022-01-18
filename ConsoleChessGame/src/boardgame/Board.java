package boardgame;

public class Board {
    private int rows;
    private int columns;
    private Piece[][] pieces;

    /**
     * @param rows
     * @param columns
     */
    public Board(int rows, int columns) {
        if(rows < 1 || columns < 1){
            throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
        }
        this.rows = rows;
        this.columns = columns;
        this.pieces = new Piece[rows][columns];
    }

    /**
     * @return the rows
     */
    public int getRows() {
        return rows;
    }

    /**
     * @return the columns
     */
    public int getColumns() {
        return columns;
    }

    /**
     * Return piece at the specified row and column
     * @param row
     * @param column
     * @return
     */
    public Piece piece(int row, int column){
        return pieces[row][column];
    }

    /**
     * Return piece at the specified position
     * @param position
     * @return
     */
    public Piece piece(Position position){
        return pieces[position.getRow()][position.getColumn()];
    }

    /**
     * Places piece at the specified position of the board and set placed piece position to the position specified
     * @param piece
     * @param position
     */
    public void placePiece(Piece piece, Position position){
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    /**
     * Checks if given row and column exists on the board;
     * @param row
     * @param column
     * @return
     */
    public boolean positionExists(int row, int column){
        return row >= 0 && row < this.rows && column >=0 && column < columns;
    }

    /**
     * Check if position exists on the board;
     * @param position
     * @return
     */
    public boolean positionExists(Position position){
        return positionExists(position.getRow(), position.getColumn());
    }

    /**
     * Checks if there is a piece at the given position
     * @param position
     * @return
     */
    public boolean thereIsAPiece(Position position){
        return pieces[position.getRow()][position.getColumn()] != null;
    }
}

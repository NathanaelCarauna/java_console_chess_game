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
     * @param rows the rows to set
     */
    public void setRows(int rows) {
        this.rows = rows;
    }

    /**
     * @return the columns
     */
    public int getColumns() {
        return columns;
    }

    /**
     * @param columns the columns to set
     */
    public void setColumns(int columns) {
        this.columns = columns;
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
}

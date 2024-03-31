package pieces;

import Chess.Board;

public class Knight extends Pieces{
    public Knight(Board board, int columns ,int rows, boolean isWhite){
        super(board);
        this.columns = columns;
        this.rows = rows;
        this.isWhite = isWhite;
        this.xPos = columns*board.tileSize;
        

    }
}

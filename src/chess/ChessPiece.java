package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece{

	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	//only getter, bc the color can't be chenged, just acessed
	public Color getColor() {
		return color;
	}


	
	
}
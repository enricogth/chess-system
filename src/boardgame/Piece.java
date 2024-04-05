package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	//constructor only with board, bc position will start without value(null)
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	//proctected, bc only boardgame classes can acess it
	protected Board getBoard() {
		return board;
	}
	

	
	
	
	
}

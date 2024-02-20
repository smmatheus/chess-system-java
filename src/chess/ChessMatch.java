package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

	private Board board;
	
	public ChessMatch() {
		board = new Board (8, 8);
		initianSetup();
	}
	
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()] [board.getCollums()];
		for (int i=0; i<board.getRows(); i++) {
			for (int j=0; j<board.getCollums(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	private void initianSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
		board.placePiece(new King(board,Color.BLACK), new Position(0, 4));
		board.placePiece(new King(board,Color.WHITE), new Position(7, 4));
	}
}

package ch.polymorphie.chess;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<AbstractPiece> pieces = new ArrayList<>();
		
		pieces.add(new King(1, "Black"));
		pieces.add(new Queen(2, "Black"));
		pieces.add(new Rook(3, "Black"));
		pieces.add(new Knight(4, "Black"));
		pieces.add(new Bishop(5, "Black"));
		pieces.add(new Pawn(6, "Black"));
		pieces.add(new King(7, "White"));
		pieces.add(new Queen(8, "White"));
		pieces.add(new Rook(9, "White"));
		pieces.add(new Knight(10, "White"));
		pieces.add(new Bishop(11, "White"));
		pieces.add(new Pawn(12, "White"));
		
		for (AbstractPiece piece: pieces) {
			System.out.println("Piece: " + piece.getClass().getSimpleName());
			System.out.println("Color: " + piece.getColor());
			System.out.println("Possible Moves: " + piece.possibleMoves());
		}
	}
}

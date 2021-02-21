package ch.polymorphie.chess;

import java.util.ArrayList;

public class Queen extends AbstractPiece {
	
	public Queen (int position, String color) {
		this.color = color;
		this.position = position;
	}
	
	@Override
	public ArrayList<Integer> possibleMoves() {
		return null;
	}
}

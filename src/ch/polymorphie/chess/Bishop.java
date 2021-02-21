package ch.polymorphie.chess;

import java.util.ArrayList;

public class Bishop extends AbstractPiece {
	
	public Bishop (int position, String color) {
		this.color = color;
		this.position = position;
	}
	
	@Override
	public ArrayList<Integer> possibleMoves() {
		return null;
	}
}

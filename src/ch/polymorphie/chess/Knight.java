package ch.polymorphie.chess;

import java.util.ArrayList;

public class Knight extends AbstractPiece{
	
	public Knight (int position, String color) {
		this.color = color;
		this.position = position;
	}
	
	@Override
	public ArrayList<Integer> possibleMoves() {
		return null;
	}
}

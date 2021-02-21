package ch.polymorphie.chess;

import java.util.ArrayList;

public abstract class AbstractPiece {
	
	int position;
	String color;
	
	public abstract ArrayList<Integer> possibleMoves();
	
	public String getColor() {
		return color;
	}
}

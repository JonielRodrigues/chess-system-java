package application;

import chess.ChessPiece;

public class UI {
	
	public static void printBoard(ChessPiece[][] pieces) {
		for (int i=0; i<pieces.length; i++) {
			System.out.print((pieces.length - i) + " ");
			for (int j=0; j<pieces[i].length; j++) {
				printPiece(pieces[i][j]);
			}
			System.out.println();
			if((i + 1) == pieces.length) {
				System.out.print("  ");
				char letra = 'a';
				for (int j=0; j<pieces[i].length; j++) {		
					System.out.print(letra);
					System.out.print(" ");
					letra++;
				}
				System.out.println();
			}
		}
		
	}
	
	private static void printPiece(ChessPiece piece) {
		if(piece == null) {
			System.out.print("-");
		}
		else {
			System.out.print(piece);
		}
		System.out.print(" ");
	}
	
}

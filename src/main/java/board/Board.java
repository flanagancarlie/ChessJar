package board;

import board.pieces.Piece;

import java.util.ArrayList;

public class Board {
    ArrayList<Square> squares = new ArrayList<Square>();
    ArrayList<Piece> pieces = new ArrayList<Piece>();

    public Board(ArrayList<Square> squares, ArrayList<Piece> pieces) {
        this.squares = squares;
        this.pieces = pieces;
    }


    public void placePiece(Piece piece, Square square) {
        piece.setSquare(square);
    }

    public void removePiece(Piece piece) {
        pieces.remove(piece);
        piece.captured();
    }
}

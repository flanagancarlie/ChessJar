package board;

import board.pieces.Piece;
import javafx.scene.shape.Rectangle;

public class Square {
    Integer letterCoord;
    Integer numberCoord;
    String letter;
    String name;
    Boolean hasPiece;
    Piece piece;
    Rectangle visual;

    public Square(Integer letterCoord, Integer numberCoord) {
        this.letterCoord = letterCoord;
        this.numberCoord = numberCoord;
    }

    public Square(Integer letterCoord, Integer numberCoord, Rectangle visual) {
        this.letterCoord = letterCoord;
        this.numberCoord = numberCoord;
        this.letter = this.letterCoordToString(letterCoord);
        this.name = letter+ "" + numberCoord;
        this.hasPiece = false;
        this.visual = visual;
    }

    private void placePiece(Piece piece) {
        this.hasPiece = true;
        this.piece = piece;
        if (!piece.getSquare().equals(this)) {
            piece.setSquare(this);
        }
    }

    public Boolean getHasPiece() {
        return hasPiece;
    }

    public void setHasPiece(Boolean hasPiece) {
        this.hasPiece = hasPiece;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    private String letterCoordToString(Integer letterCoord) {
        switch (letterCoord) {
            case 1:
                letter = "a";
                break;
            case 2:
                letter = "b";
                break;
            case 3:
                letter = "c";
                break;
            case 4:
                letter = "d";
                break;
            case 5:
                letter = "e";
                break;
            case 6:
                letter = "f";
                break;
            case 7:
                letter = "g";
                break;
            case 8:
                letter = "h";
                break;
            default:
                letter = "Invalid";
                break;
        }
        return letter;
    }

}

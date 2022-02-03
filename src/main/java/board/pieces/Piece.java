package board.pieces;

import board.Square;
import javafx.scene.image.ImageView;

public abstract class Piece {
    Square square;
    Integer points;
    ImageView image;

    public Piece(Square square, ImageView image) {
        this.square = square;
        this.updateSquare(square);
        this.image = image;
    }

    public void setSquare(Square square) {
        this.square = square;
        }

    public void updateSquare(Square square) {
        if (square.getPiece() == null) {
            square.setPiece(this);
        }
        else if (!(square.getPiece().equals(this))) {
            square.setPiece(this);
        }
    }

    public void captured() {
        this.square = new Square(0,0);
    }

    public Square getSquare() {
        return this.square;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }


}

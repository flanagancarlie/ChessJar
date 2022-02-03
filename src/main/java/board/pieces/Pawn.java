package board.pieces;

import board.Square;
import javafx.scene.image.ImageView;


public class Pawn extends Piece {

    public Pawn(Square square, ImageView image) {
        super(square,image);
        super.points = 1;
    }
}

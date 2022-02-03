package board.pieces;

import board.Square;
import javafx.scene.image.ImageView;

public class Rook extends Piece {

    public Rook(Square square, ImageView image) {
        super(square,image);
        super.points = 5;
    }
}

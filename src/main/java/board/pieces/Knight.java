package board.pieces;

import board.Square;
import javafx.scene.image.ImageView;

public class Knight extends Piece {
    public Knight(Square square, ImageView image) {
        super(square,image);
        super.points = 3;
    }
}

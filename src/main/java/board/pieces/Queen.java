package board.pieces;

import board.Square;
import javafx.scene.image.ImageView;

public class Queen extends Piece {

    public Queen(Square square, ImageView image) {
        super(square,image);
        super.points = 9;
    }

}

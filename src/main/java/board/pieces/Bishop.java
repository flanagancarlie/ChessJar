package board.pieces;

import board.Square;
import javafx.scene.image.ImageView;

public class Bishop extends Piece {

    public Bishop(Square square,ImageView image) {
        super(square,image);
        super.points = 3;
    }


}

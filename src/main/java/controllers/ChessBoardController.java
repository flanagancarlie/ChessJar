package controllers;
import board.Square;
import board.pieces.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

import java.util.ArrayList;


public class ChessBoardController {
    ArrayList<Square> squares;

    @FXML
    private Rectangle a8;
    Square sA8 = new Square(1, 8, a8);
    @FXML
    private Rectangle b7;
    Square sB7 = new Square(2, 7, b7);
    @FXML
    private Rectangle d7;
    Square sD7 = new Square(4, 7, d7);
    @FXML
    private Rectangle h7;
    Square sH7 = new Square(8, 7, h7);
    @FXML
    private Rectangle f7;
    Square sF7 = new Square(6, 7, f7);
    @FXML
    private Rectangle g7;
    Square sG7 = new Square(7, 7, g7);
    @FXML
    private Rectangle a7;
    Square sA7 = new Square(1, 7, a7);
    @FXML
    private Rectangle c7;
    Square sC7 = new Square(3, 7, c7);
    @FXML
    private Rectangle e7;
    Square sE7 = new Square(5, 7, e7);
    @FXML
    private Rectangle b8;
    Square sB8 = new Square(2, 8, b8);
    @FXML
    private Rectangle g3;
    Square sG3 = new Square(7, 3, g3);
    @FXML
    private Rectangle d2;
    Square sD2 = new Square(4,2,d2);
    @FXML
    private Rectangle b2;
    Square sB2 = new Square(2,2,b2);
    @FXML
    private Rectangle c2;
    Square sC2 = new Square(3,2,c2);
    @FXML
    private Rectangle c8;
    Square sC8 = new Square(3,8,c8);
    @FXML
    private Rectangle e8;
    Square sE8 = new Square(5,8,e8);
    @FXML
    private Rectangle g8;
    Square sG8 = new Square(7,8,g8);
    @FXML
    private Rectangle d8;
    Square sD8 = new Square(4,8,d8);
    @FXML
    private Rectangle f8;
    Square sF8 = new Square(6,8,f8);
    @FXML
    private Rectangle h8;
    Square sH8 = new Square(8,8,h8);
    @FXML
    private Rectangle a6;
    Square sA6 = new Square(1,6,a6);
    @FXML
    private Rectangle b6;
    Square sB6 = new Square(2,6,b6);
    @FXML
    private Rectangle c6;
    Square sC6 = new Square(3,6,c6);
    @FXML
    private Rectangle d6;
    Square sD6 = new Square(4,6,d6);
    @FXML
    private Rectangle f6;
    Square sF6 = new Square(6,6,f6);
    @FXML
    private Rectangle h6;
    Square sH6 = new Square(8,6,h6);
    @FXML
    private Rectangle g6;
    Square sG6 = new Square(7,6,g6);
    @FXML
    private Rectangle e6;
    Square sE6 = new Square(5,6,e6);
    @FXML
    private Rectangle a5;
    Square sA5 = new Square(1,5,a5);
    @FXML
    private Rectangle c5;
    Square sC5 = new Square(3,5,c5);
    @FXML
    private Rectangle e5;
    Square sE5 = new Square(5,5,e5);
    @FXML
    private Rectangle g5;
    Square sG5 = new Square(7,5,g5);
    @FXML
    private Rectangle d4;
    Square sD4 = new Square(4,4,d4);
    @FXML
    private Rectangle b4;
    Square sB4 = new Square(2,4,b4);
    @FXML
    private Rectangle f4;
    Square sF4 = new Square(6,4,f4);
    @FXML
    private Rectangle h4;
    Square sH4 = new Square(8,4,h4);
    @FXML
    private Rectangle a3;
    Square sA3 = new Square(1,3,a3);
    @FXML
    private Rectangle c3;
    Square sC3 = new Square(3,3,c3);
    @FXML
    private Rectangle e3;
    Square sE3 = new Square(5,3,e3);
    @FXML
    private Rectangle f2;
    Square sF2 = new Square(6,2,f2);
    @FXML
    private Rectangle h2;
    Square sH2 = new Square(8,2,h2);
    @FXML
    private Rectangle a1;
    Square sA1 = new Square(1,1,a1);
    @FXML
    private Rectangle c1;
    Square sC1 = new Square(3,1,c1);
    @FXML
    private Rectangle e1;
    Square sE1 = new Square(5,1,e1);
    @FXML
    private Rectangle g1;
    Square sG1 = new Square(7,1, g1);
    @FXML
    private Rectangle b5;
    Square sB5 = new Square(2,5,b5);
    @FXML
    private Rectangle d5;
    Square sD5 = new Square(4,5,d5);
    @FXML
    private Rectangle f5;
    Square sF5 = new Square(6,5,f5);
    @FXML
    private Rectangle h5;
    Square sH5 = new Square(8,5,h5);
    @FXML
    private Rectangle a2;
    Square sA2 = new Square(1,2,a2);
    @FXML
    private Rectangle a4;
    Square sA4 = new Square(1,4,a4);
    @FXML
    private Rectangle b3;
    Square sB3 = new Square(2,3,b3);
    @FXML
    private Rectangle b1;
    Square sB1 = new Square(2,1,b1);
    @FXML
    private Rectangle c4;
    Square sC4 = new Square(3,4,c4);
    @FXML
    private Rectangle d3;
    Square sD3 = new Square(4,3,d3);
    @FXML
    private Rectangle d1;
    Square sD1 = new Square(4,1,d1);
    @FXML
    private Rectangle e2;
    Square sE2 = new Square(5,2,e2);
    @FXML
    private Rectangle e4;
    Square sE4 = new Square(5,4,e4);
    @FXML
    private Rectangle f3;
    Square sF3 = new Square(6,3,f3);
    @FXML
    private Rectangle f1;
    Square sF1 = new Square(6,1,f1);
    @FXML
    private Rectangle g4;
    Square sG4 = new Square(7,4,g4);
    @FXML
    private Rectangle g2;
    Square sG2 = new Square(7,2,g2);
    @FXML
    private Rectangle h3;
    Square sH3 = new Square(8,3,h3);
    @FXML
    private Rectangle h1;
    Square sH1 = new Square(8,1,h1);
    @FXML
    private ImageView Pa2;
    Pawn aPawnWhite = new Pawn(sA2, Pa2);
    @FXML
    private ImageView Pb2;
    Pawn bPawnWhite = new Pawn(sB2,Pb2);
    @FXML
    private ImageView Pc2;
    Pawn cPawnWhite = new Pawn(sC2,Pc2);
    @FXML
    private ImageView Pd2;
    Pawn dPawnWhite = new Pawn(sD2,Pd2);
    @FXML
    private ImageView Pe2;
    Pawn ePawnWhite = new Pawn(sE2,Pe2);
    @FXML
    private ImageView Pf2;
    Pawn fPawnWhite = new Pawn(sF2,Pf2);
    @FXML
    private ImageView Pg2;
    Pawn gPawnWhite = new Pawn(sG2,Pg2);
    @FXML
    private ImageView Ph2;
    Pawn hPawnWhite = new Pawn(sH2,Ph2);
    @FXML
    private ImageView Ra1;
    Rook aRookWhite = new Rook(sA1, Ra1);
    @FXML
    private ImageView Rh1;
    Rook hRookWhite = new Rook(sH1, Rh1);
    @FXML
    private ImageView Nb1;
    Knight bKnightWhite = new Knight(sB1, Nb1);
    @FXML
    private ImageView Ng1;
    Knight gKnightWhite= new Knight(sG1, Ng1);
    @FXML
    private ImageView Bc1;
    Bishop cBishopWhite = new Bishop(sC1, Bc1);
    @FXML
    private ImageView Bf1;
    Bishop fBishopWhite = new Bishop(sF1, Bf1);
    @FXML
    private ImageView Qd1;
    Queen queenWhite = new Queen(sD1, Qd1);
    @FXML
    private ImageView Ke1;
    King kingWhite = new King(sE1, Ke1);
    @FXML
    private ImageView Pb7;
    Pawn bPawnBlack = new Pawn(sB7,Pb7);
    @FXML
    private ImageView Pf7;
    Pawn fPawnBlack = new Pawn(sF7, Pf7);
    @FXML
    private ImageView Pa7;
    Pawn aPawnBlack = new Pawn(sA7, Pa7);
    @FXML
    private ImageView Pd7;
    Pawn dPawnBlack = new Pawn(sD7, Pd7);
    @FXML
    private ImageView Pc7;
    Pawn cPawnBlack = new Pawn(sC7, Pc7);
    @FXML
    private ImageView Pe7;
    Pawn ePawnBlack = new Pawn(sE7, Pe7);
    @FXML
    private ImageView Pg7;
    Pawn gPawnBlack = new Pawn(sG7, Pg7);
    @FXML
    private ImageView Ph7;
    Pawn hPawnBlack = new Pawn(sH7, Ph7);
    @FXML
    private ImageView Ra8;
    Rook aRookBlack = new Rook(sA8, Ra8);
    @FXML
    private ImageView Rh8;
    Rook hRookBlack = new Rook(sH8, Rh8);
    @FXML
    private ImageView Nb8;
    Knight bKnightBlack = new Knight(sB8, Nb8);
    @FXML
    private ImageView Ng8;
    Knight gKnightBlack = new Knight(sG8, Ng8);
    @FXML
    private ImageView Bc8;
    Bishop cBishopBlack = new Bishop(sC8, Bc8);
    @FXML
    private ImageView Bf8;
    Bishop fBishopBlack = new Bishop(sF8, Bf8);
    @FXML
    private ImageView Ke8;
    King kingBlack = new King(sE8, Ke8);
    @FXML
    private ImageView Qd8;
    Queen queenBlack = new Queen(sD8, Qd8);
    @FXML
    private Text blackTimer;

    @FXML
    private Text whiteTimer;


    @FXML
    public void initialize() {
        Stopwatch whiteStopWatch = new Stopwatch();
        Stopwatch blackStopWatch = new Stopwatch();
        double time = 300;
        whiteTimer.setText(whiteStopWatch.timeInText(time));
        blackTimer.setText(blackStopWatch.timeInText(time));
        whiteStopWatch.elapsedTime();
        blackStopWatch.elapsedTime();
    }

    public void getSquares() {
    }

    public void getWhitePieces() {

    }

    public void boardToArray() {

    }

    public void showAllMoves(ActionEvent event) {

       // Piece selectedPiece = .getSelectedItem().getValue();

    }
}

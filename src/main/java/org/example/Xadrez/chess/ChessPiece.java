package org.example.Xadrez.chess;

import org.example.Xadrez.boardgame.Board;
import org.example.Xadrez.boardgame.Piece;

public class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

}

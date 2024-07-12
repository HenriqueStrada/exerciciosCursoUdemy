package org.example.Xadrez.chess.piece;

import org.example.Xadrez.boardgame.Board;
import org.example.Xadrez.chess.ChessPiece;
import org.example.Xadrez.chess.Color;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "K";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
}

package org.example.Xadrez.chess;

import org.example.Xadrez.boardgame.Board;
import org.example.Xadrez.boardgame.Position;
import org.example.Xadrez.chess.piece.King;
import org.example.Xadrez.chess.piece.Rook;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
        initialSetup();
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRow()][board.getColumns()];
        for(int i = 0; i < board.getRow(); i++){
            for(int j = 0; j < board.getColumns(); j++){
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }

    private void initialSetup(){
        board.placePiece(new Rook(board, Color.WHITE), new Position(2,1));
        board.placePiece(new King(board, Color.BLACK), new Position(2,2));
    }
}
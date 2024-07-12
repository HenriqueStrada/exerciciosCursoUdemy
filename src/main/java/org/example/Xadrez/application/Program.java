package org.example.Xadrez.application;

import org.example.Xadrez.boardgame.Board;
import org.example.Xadrez.boardgame.Position;
import org.example.Xadrez.chess.ChessMatch;

public class Program {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }
}

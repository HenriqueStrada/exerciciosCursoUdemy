package org.example.Xadrez.application;

import org.example.Xadrez.boardgame.Board;
import org.example.Xadrez.boardgame.Position;
import org.example.Xadrez.chess.ChessException;
import org.example.Xadrez.chess.ChessMatch;
import org.example.Xadrez.chess.ChessPiece;
import org.example.Xadrez.chess.ChessPosition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while(true){
            try {
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces());
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(sc);

                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(sc);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
            }catch(ChessException e){
                System.out.println(e.getMessage());
                System.out.print("Press enter to continue");
                sc.nextLine();
            }catch(InputMismatchException e){
                System.out.println(e.getMessage());
                System.out.print("Press enter to continue");
                sc.nextLine();
            }
        }
    }
}

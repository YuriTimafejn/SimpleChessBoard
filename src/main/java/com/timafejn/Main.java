package com.timafejn;

import com.timafejn.chess.ChessMatch;

public class Main {
    public static void main(String[] args) {

        ChessMatch cm = new ChessMatch();
        UI.printBoard(cm.getPieces());
    }
}
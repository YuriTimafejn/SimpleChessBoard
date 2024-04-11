package com.timafejn.boardgame;

public class Position {
    private int row;
    private int column;

    public Position(int row, int column)
    {
        this.row = row;
        this.column = column;
    }

    public int getColumn() {
        return this.column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return this.row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    @Override
    public String toString() {
          return String.valueOf(this.row) + ", " + String.valueOf(this.column);
    }
}

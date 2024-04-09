package com.timafejn.boardgame;

public class Position {
    private int row;
    private int column;

    public Position(int row, int column)
    {
        this.row = row;
        this.column = column;
    }

    public String getColumn() {
        return String.valueOf(this.column);
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public String getRow() {
        return String.valueOf(this.row);
    }

    public void setRow(int row) {
        this.row = row;
    }

    @Override
    public String toString() {
          return getRow() + ", " + getColumn();
    }
}

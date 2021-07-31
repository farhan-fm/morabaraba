package com.example.myapplication;

public class Board {

    public static final int AI = 2;
    public static final int HUMAN = 1;

    public static final int ROWS = 7;
    public static final int COLS = 7;
    public static final int EMPTY_VAL = -1;
    public static final int DRAW = -2;
    public static final int LINKS = -3;

    public int[][] squares = new int[ROWS][COLS];




    public int getSquare(int i, int j) {
        return this.squares[i][j];
    }

    public void setSquare(int i, int j, int player) {
        this.squares[i][j] = player;
    }

    public void squareIsEmpty() {
        for (int i = 0; i < squares.length; i++) {
            for (int j = 0; j < squares[0].length; j++) {
                squares[i][j] = -1;
            }
        }
    }


    public int gameOver() {
        // Rows
        for (int i = 0; i < ROWS; ++i) {
            if (i == 0 || i == 6) {
                if (this.getSquare(i, 0) != -1 && this.getSquare(i, 3) != -1 && this.getSquare(i, 0) == this.getSquare(i, 3) && this.getSquare(i, 3) == this.getSquare(i, 6)) {
                    if (this.getSquare(i, 0) == Board.AI) {
                        return Board.AI;
                    } else {
                        return Board.HUMAN;
                    }
                }
            } else if (i == 1 || i == 5) {
                if (this.getSquare(i, 1) != -1 && this.getSquare(i, 3) != -1 && this.getSquare(i, 1) == this.getSquare(i, 3) && this.getSquare(i, 3) == this.getSquare(i, 5)) {
                    if (this.getSquare(i, 1) == Board.AI) {
                        return Board.AI;
                    } else {
                        return Board.HUMAN;
                    }
                }
            } else if (i == 2 || i == 4) {
                if (this.getSquare(i, 2) != -1 && this.getSquare(i, 3) != -1 && this.getSquare(i, 2) == this.getSquare(i, 3) && this.getSquare(i, 3) == this.getSquare(i, 4)) {
                    if (this.getSquare(i, 2) == Board.AI) {
                        return Board.AI;
                    } else {
                        return Board.HUMAN;
                    }
                }
            } else if (i == 3) {
                if ((this.getSquare(i, 0) != -1 && this.getSquare(i, 1) != -1 && this.getSquare(i, 0) == this.getSquare(i, 1) && this.getSquare(i, 1) == this.getSquare(i, 2)) || (this.getSquare(i, 4) != -1 && this.getSquare(i, 5) != -1 && this.getSquare(i, 4) == this.getSquare(i, 5) && this.getSquare(i, 5) == this.getSquare(i, 6))) {
                    if ((this.getSquare(i, 0) == Board.AI) || (this.getSquare(i, 4) == Board.AI)) {
                        return Board.AI;
                    } else {
                        return Board.HUMAN;
                    }
                }
            }

        }


        // Cols
        for (int i = 0; i < ROWS; ++i) {
            if (i == 0 || i == 6) {
                if (this.getSquare(0, i) != -1 && this.getSquare(3, i) != -1 && this.getSquare(0, i) == this.getSquare(3, i) && this.getSquare(3, i) == this.getSquare(6, i)) {
                    if (this.getSquare(0, i) == Board.AI) {
                        return Board.AI;
                    } else {
                        return Board.HUMAN;
                    }
                }
            } else if (i == 1 || i == 5) {
                if (this.getSquare(1, i) != -1 && this.getSquare(3, i) != -1 && this.getSquare(1, i) == this.getSquare(3, i) && this.getSquare(3, i) == this.getSquare(5, i)) {
                    if (this.getSquare(1, i) == Board.AI) {
                        return Board.AI;
                    } else {
                        return Board.HUMAN;
                    }
                }

            } else if (i == 2 || i == 4) {
                if (this.getSquare(2, i) != -1 && this.getSquare(3, i) != -1 && this.getSquare(2, i) == this.getSquare(3, i) && this.getSquare(3, i) == this.getSquare(4, i)) {
                    if (this.getSquare(2, i) == Board.AI) {
                        return Board.AI;
                    } else {
                        return Board.HUMAN;
                    }
                }
            } else if (i == 3) {
                if ((this.getSquare(0, i) != -1 && this.getSquare(1, i) != -1 && this.getSquare(0, i) == this.getSquare(1, i) && this.getSquare(1, i) == this.getSquare(2, i)) || (this.getSquare(4, i) != -1 && this.getSquare(5, i) != -1 && this.getSquare(4, i) == this.getSquare(5, i) && this.getSquare(5, i) == this.getSquare(6, i))) {
                    if ((this.getSquare(0, i) == Board.AI) || (this.getSquare(4, i) == Board.AI)) {
                        return Board.AI;
                    } else {
                        return Board.HUMAN;
                    }
                }
            }
        }

        // Left Diagonal 1
        if (this.getSquare(0, 0) != -1 && this.getSquare(1, 1) != -1 && this.getSquare(0, 0) == this.getSquare(1, 1) && this.getSquare(1, 1) == this.getSquare(2, 2)) {
            if (this.getSquare(0, 0) == Board.AI) {
                return Board.AI;
            } else {
                return Board.HUMAN;
            }
        }
        // Left Diagonal 2
        if (this.getSquare(4, 4) != -1 && this.getSquare(5, 5) != -1 && this.getSquare(4, 4) == this.getSquare(5, 5) && this.getSquare(5, 5) == this.getSquare(6, 6)) {
            if (this.getSquare(4, 4) == Board.AI) {
                return Board.AI;
            } else {
                return Board.HUMAN;
            }
        }


        // Right Diagonal 1
        if (this.getSquare(0, 6) != -1 && this.getSquare(1, 5) != -1 && this.getSquare(0, 6) == this.getSquare(1, 5) && this.getSquare(1, 5) == this.getSquare(2, 4)) {
            if (this.getSquare(0, 6) == Board.AI) {
                return Board.AI;
            } else {
                return Board.HUMAN;
            }
        }


        // Right Diagonal 2
        if (this.getSquare(4, 2) != -1 && this.getSquare(5, 1) != -1 && this.getSquare(4, 2) == this.getSquare(5, 1) && this.getSquare(5, 1) == this.getSquare(6, 0)) {
            if (this.getSquare(4, 2) == Board.AI) {
                return Board.AI;
            } else {
                return Board.HUMAN;
            }
        }

        //Top Vertical
        if (this.getSquare(0, 3) != -1 && this.getSquare(1, 3) != -1 && this.getSquare(0, 3) == this.getSquare(1, 3) && this.getSquare(1, 3) == this.getSquare(2, 3)) {
            if (this.getSquare(0, 3) == Board.AI) {
                return Board.AI;
            } else {
                return Board.HUMAN;
            }
        }

        //Down Vertical
        if (this.getSquare(4, 3) != -1 && this.getSquare(5, 3) != -1 && this.getSquare(4, 3) == this.getSquare(5, 3) && this.getSquare(5, 3) == this.getSquare(6, 3)) {
            if (this.getSquare(4, 2) == Board.AI) {
                return Board.AI;
            } else {
                return Board.HUMAN;
            }
        }

        return 0;
    }

}

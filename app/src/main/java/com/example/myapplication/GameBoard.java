package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class GameBoard extends AppCompatActivity {
    protected static int player1 = 6;
    int color1 = Color.WHITE;
    int color2 = Color.BLACK;
    ImageButton a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24;
    String A1 = "a1", A2 = "a2", A3 = "a3", A4 = "a4", A5 = "a5", A6 = "a6", A7 = "a7", A8 = "a8", A9 = "a9", A10 = "a10", A11 = "a11", A12 = "a12", A13 = "a13", A14 = "a14", A15 = "a15", A16 = "a16", A17 = "a17", A18 = "a18", A19 = "a19", A20 = "a20", A21 = "a21", A22 = "a22", A23 = "a23", A24 = "a24";
    public int currentPlayer = 1;
    //int depth = 0;
    //public Board board;
    // public int criterion;
    int LINK = -2;
    int[][] GameBead = new int[8][3];
    int currentValue = 0;
    int nextValue = 0;

    int location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_board);

        //board.squareIsEmpty();
        fillGameBeadArray();


        a1 = (ImageButton) findViewById(R.id.a1);
        a2 = (ImageButton) findViewById(R.id.a2);
        a3 = (ImageButton) findViewById(R.id.a3);
        a4 = (ImageButton) findViewById(R.id.a4);
        a5 = (ImageButton) findViewById(R.id.a5);
        a6 = (ImageButton) findViewById(R.id.a6);
        a7 = (ImageButton) findViewById(R.id.a7);
        a8 = (ImageButton) findViewById(R.id.a8);
        a9 = (ImageButton) findViewById(R.id.a9);
        a10 = (ImageButton) findViewById(R.id.a10);
        a11 = (ImageButton) findViewById(R.id.a11);
        a12 = (ImageButton) findViewById(R.id.a12);
        a13 = (ImageButton) findViewById(R.id.a13);
        a14 = (ImageButton) findViewById(R.id.a14);
        a15 = (ImageButton) findViewById(R.id.a15);
        a16 = (ImageButton) findViewById(R.id.a16);
        a17 = (ImageButton) findViewById(R.id.a17);
        a18 = (ImageButton) findViewById(R.id.a18);
        a19 = (ImageButton) findViewById(R.id.a19);
        a20 = (ImageButton) findViewById(R.id.a20);
        a21 = (ImageButton) findViewById(R.id.a21);
        a22 = (ImageButton) findViewById(R.id.a22);
        a23 = (ImageButton) findViewById(R.id.a23);
        a24 = (ImageButton) findViewById(R.id.a24);
        int[][] gamebead = new int[8][3];

        for (int i = 0; i < player1; i++) {
            // boolean t = true;
            //   while (t) {
            //Turn = turnPlayer(GameBead);
            // if (currentPlayer == 1) {


            a1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (currentPlayer == 1) {
                        if (GameBead[0][0] == -1) {
                            a1.setBackgroundColor(color1);
                            GameBead[0][0] = 1;

//                        for (int h = 0; h < 8; h++) {
//                            for (int j = 0; j < 3; j++) {
//                                gamebead[h][j] = GameBead[h][j];
//                            }
//                        }
                       // System.out.println(Result);
//                        System.out.println(GameBead[0][1]);
                            player1--;
                            switchPlayer();
                            AIPlayer(GameBead);
                            switchPlayer();
                        } else
                            Toast.makeText(GameBoard.this, "خانه مورد نظر قابل انتخاب نیست !", Toast.LENGTH_SHORT).show();
                    }

                }

            });
//                // System.out.println(a1.callOnClick());
            a2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (currentPlayer == 1) {
                        if (GameBead[0][1] == -1) {
                            a2.setBackgroundColor(color1);
                            GameBead[0][1] = 1;
//                                board.setSquare(0, 3, 1);
//                                board.gameOver();
                            switchPlayer();
                            AIPlayer(GameBead);
                            switchPlayer();
                        } else
                            Toast.makeText(GameBoard.this, "خانه مورد نظر قابل انتخاب نیست !", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            a3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (currentPlayer == 1) {
                        if (GameBead[0][2] == -1) {
                            a3.setBackgroundColor(color1);
                            GameBead[0][2] = 1;
//                                board.setSquare(0, 6, 1);
//                                board.gameOver();
                            switchPlayer();
                            AIPlayer(GameBead);
                            switchPlayer();
                            player1--;

                        } else
                            Toast.makeText(GameBoard.this, "خانه مورد نظر قابل انتخاب نیست !", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            a4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (currentPlayer == 1) {
                        if (GameBead[1][0] == -1) {
                            a4.setBackgroundColor(color1);
                            GameBead[1][0] = 1;
//                                board.setSquare(1, 1, 1);
//                                board.gameOver();
                            switchPlayer();
                            AIPlayer(GameBead);
                            switchPlayer();
                            player1--;

                        } else
                            Toast.makeText(GameBoard.this, "خانه مورد نظر قابل انتخاب نیست !", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            a5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (currentPlayer == 1) {
                        if (GameBead[1][1] == -1) {
                            a5.setBackgroundColor(color1);
                            GameBead[1][1] = 1;
//                                board.setSquare(1, 3, 1);
//                                board.gameOver();
                            switchPlayer();
                            AIPlayer(GameBead);
                            switchPlayer();
                            player1--;

                        } else
                            Toast.makeText(GameBoard.this, "خانه مورد نظر قابل انتخاب نیست !", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            a6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (currentPlayer == 1) {
                        if (GameBead[1][2] == -1) {
                            a6.setBackgroundColor(color1);
                            GameBead[1][2] = 1;
//                                board.setSquare(1, 5, 1);
//                                board.gameOver();
                            switchPlayer();
                            AIPlayer(GameBead);
                            switchPlayer();
                            player1--;

                        } else
                            Toast.makeText(GameBoard.this, "خانه مورد نظر قابل انتخاب نیست !", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            a7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (currentPlayer == 1) {
                        if (GameBead[2][0] == -1) {
                            a7.setBackgroundColor(color1);
                            GameBead[2][0] = 1;
//                                board.setSquare(2, 2, 1);
//                                board.gameOver();
                            switchPlayer();
                            AIPlayer(GameBead);
                            switchPlayer();
                            player1--;
                        } else
                            Toast.makeText(GameBoard.this, "خانه مورد نظر قابل انتخاب نیست !", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            a8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (currentPlayer == 1) {
                        if (GameBead[2][1] == -1) {
                            a8.setBackgroundColor(color1);
                            GameBead[2][1] = 1;
//                                board.setSquare(2, 3, 1);
//                                board.gameOver();
                            switchPlayer();
                            AIPlayer(GameBead);
                            switchPlayer();
                            player1--;

                        } else
                            Toast.makeText(GameBoard.this, "خانه مورد نظر قابل انتخاب نیست !", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            a9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (currentPlayer == 1) {
                        if (GameBead[2][2] == -1) {
                            a9.setBackgroundColor(color1);
                            GameBead[2][2] = 1;
//                                board.setSquare(2, 4, 1);
//                                board.gameOver();
                            switchPlayer();
                            AIPlayer(GameBead);
                            switchPlayer();
                            player1--;

                        } else
                            Toast.makeText(GameBoard.this, "خانه مورد نظر قابل انتخاب نیست !", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            a10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (currentPlayer == 1) {
                        if (GameBead[3][0] == -1) {
                            a10.setBackgroundColor(color1);
                            GameBead[3][0] = 1;
//                                board.setSquare(3, 0, 1);
//                                board.gameOver();
                            switchPlayer();
                            AIPlayer(GameBead);
                            switchPlayer();
                            player1--;

                        } else
                            Toast.makeText(GameBoard.this, "خانه مورد نظر قابل انتخاب نیست !", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            a11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (currentPlayer == 1) {
                        if (GameBead[3][1] == -1) {
                            a11.setBackgroundColor(color1);
                            GameBead[3][1] = 1;
//                                board.setSquare(3, 1, 1);
//                                board.gameOver();
                            switchPlayer();
                            AIPlayer(GameBead);
                            switchPlayer();
                            player1--;

                        } else
                            Toast.makeText(GameBoard.this, "خانه مورد نظر قابل انتخاب نیست !", Toast.LENGTH_SHORT).show();
                    }
                }

            });
            a12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (currentPlayer == 1) {
                        if (GameBead[3][2] == -1) {
                            a12.setBackgroundColor(color1);
                            GameBead[3][2] = 1;
//                                board.setSquare(3, 2, 1);
//                                board.gameOver();
                            switchPlayer();
                            AIPlayer(GameBead);
                            switchPlayer();
                            player1--;

                        } else
                            Toast.makeText(GameBoard.this, "خانه مورد نظر قابل انتخاب نیست !", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            a13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (currentPlayer == 1) {
                        if (GameBead[4][0] == -1) {
                            a13.setBackgroundColor(color1);
                            GameBead[4][0] = 1;
//                                board.setSquare(3, 4, 1);
//                                board.gameOver();
                            switchPlayer();
                            AIPlayer(GameBead);
                            switchPlayer();
                            player1--;

                        } else
                            Toast.makeText(GameBoard.this, "خانه مورد نظر قابل انتخاب نیست !", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            a14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (currentPlayer == 1) {
                        if (GameBead[4][1] == -1) {
                            a14.setBackgroundColor(color1);
                            GameBead[4][1] = 1;
//                                board.setSquare(3, 5, 1);
//                                board.gameOver();
                            switchPlayer();
                            AIPlayer(GameBead);
                            switchPlayer();
                            player1--;

                        } else
                            Toast.makeText(GameBoard.this, "خانه مورد نظر قابل انتخاب نیست !", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            a15.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (currentPlayer == 1) {
                        if (GameBead[4][2] == -1) {
                            a15.setBackgroundColor(color1);
                            GameBead[4][2] = 1;
//                                board.setSquare(3, 6, 1);
//                                board.gameOver();
                            switchPlayer();
                            AIPlayer(GameBead);
                            switchPlayer();
                            player1--;

                        } else
                            Toast.makeText(GameBoard.this, "خانه مورد نظر قابل انتخاب نیست !", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            a16.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (currentPlayer == 1) {
                        if (GameBead[5][0] == -1) {
                            a16.setBackgroundColor(color1);
                            GameBead[5][0] = 1;
//                                board.setSquare(4, 2, 1);
//                                board.gameOver();
                            switchPlayer();
                            AIPlayer(GameBead);
                            switchPlayer();
                            player1--;

                        } else
                            Toast.makeText(GameBoard.this, "خانه مورد نظر قابل انتخاب نیست !", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            a17.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (currentPlayer == 1) {
                        if (GameBead[5][1] == -1) {
                            a17.setBackgroundColor(color1);
                            GameBead[5][1] = 1;
//                                board.setSquare(4, 3, 1);
//                                board.gameOver();
                            switchPlayer();
                            AIPlayer(GameBead);
                            switchPlayer();
                            player1--;

                        } else
                            Toast.makeText(GameBoard.this, "خانه مورد نظر قابل انتخاب نیست !", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            a18.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (currentPlayer == 1) {
                        if (GameBead[5][2] == -1) {
                            a18.setBackgroundColor(color1);
                            GameBead[5][2] = 1;
//                                board.setSquare(4, 4, 1);
//                                board.gameOver();
                            switchPlayer();
                            AIPlayer(GameBead);
                            switchPlayer();
                            player1--;

                        } else
                            Toast.makeText(GameBoard.this, "خانه مورد نظر قابل انتخاب نیست !", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            a19.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (currentPlayer == 1) {
                        if (GameBead[6][0] == -1) {
                            a19.setBackgroundColor(color1);
                            GameBead[6][0] = 1;
//                                board.setSquare(5, 1, 1);
//                                board.gameOver();
                            switchPlayer();
                            AIPlayer(GameBead);
                            switchPlayer();
                            player1--;

                        } else
                            Toast.makeText(GameBoard.this, "خانه مورد نظر قابل انتخاب نیست !", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            a20.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (currentPlayer == 1) {
                        if (GameBead[6][1] == -1) {
                            a20.setBackgroundColor(color1);
                            GameBead[6][1] = 1;
//                                board.setSquare(5, 3, 1);
//                                board.gameOver();
                            switchPlayer();
                            AIPlayer(GameBead);
                            switchPlayer();
                            player1--;

                        } else
                            Toast.makeText(GameBoard.this, "خانه مورد نظر قابل انتخاب نیست !", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            a21.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (currentPlayer == 1) {
                        if (GameBead[6][2] == -1) {
                            a21.setBackgroundColor(color1);
                            GameBead[6][2] = 1;
//                                board.setSquare(5, 5, 1);
//                                board.gameOver();
                            switchPlayer();
                            AIPlayer(GameBead);
                            switchPlayer();
                            player1--;

                        } else
                            Toast.makeText(GameBoard.this, "خانه مورد نظر قابل انتخاب نیست !", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            a22.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (currentPlayer == 1) {
                        if (GameBead[7][0] == -1) {
                            a22.setBackgroundColor(color1);
                            GameBead[7][0] = 1;
//                                board.setSquare(6, 0, 1);
//                                board.gameOver();
                            switchPlayer();
                            AIPlayer(GameBead);
                             switchPlayer();
                            player1--;

                        } else
                            Toast.makeText(GameBoard.this, "خانه مورد نظر قابل انتخاب نیست !", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            a23.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (currentPlayer == 1) {
                        if (GameBead[7][1] == -1) {
                            a23.setBackgroundColor(color1);
                            GameBead[7][1] = 1;
//                                board.setSquare(6, 3, 1);
//                                board.gameOver();
                              switchPlayer();
                            AIPlayer(GameBead);
                               switchPlayer();
                            player1--;

                            //   whiteTurnPlay();
                        } else
                            Toast.makeText(GameBoard.this, "خانه مورد نظر قابل انتخاب نیست !", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            a24.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (currentPlayer == 1) {
                        if (GameBead[7][2] == -1) {
                            a24.setBackgroundColor(color1);
                            GameBead[7][2] = 1;
//                                board.setSquare(6, 6, 1);
//                                board.gameOver();
                            //switchPlayer();
                            AIPlayer(GameBead);
                            // switchPlayer();
                            player1--;
                            //    currentPlayer = 0;
                            //    whiteTurnPlay();
                        } else
                            Toast.makeText(GameBoard.this, "خانه مورد نظر قابل انتخاب نیست !", Toast.LENGTH_SHORT).show();
                    }

                }
            });


        }
//

        //    }
    }

//

    public void fillGameBeadArray() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 3; j++) {
                GameBead[i][j] = -1;
            }
        }
    }

    //
//
    public void AIPlayer(int[][] Board) {
        int[][] squares = new int[7][7];
        squares[0][0] = Board[0][0];
        squares[0][1] = LINK;
        squares[0][2] = LINK;
        squares[0][3] = Board[0][1];
        squares[0][4] = LINK;
        squares[0][5] = LINK;
        squares[0][6] = Board[0][2];

        squares[1][0] = LINK;
        squares[1][1] = Board[1][0];
        squares[1][2] = LINK;
        squares[1][3] = Board[1][1];
        squares[1][4] = LINK;
        squares[1][5] = Board[1][2];
        squares[1][6] = LINK;

        squares[2][0] = LINK;
        squares[2][1] = LINK;
        squares[2][2] = Board[2][0];
        squares[2][3] = Board[2][1];
        squares[2][4] = Board[2][2];
        squares[2][5] = LINK;
        squares[2][6] = LINK;

        squares[3][0] = Board[3][0];
        squares[3][1] = Board[3][1];
        squares[3][2] = Board[3][2];
        squares[3][3] = 0;
        squares[3][4] = Board[4][0];
        squares[3][5] = Board[4][1];
        squares[3][6] = Board[4][2];

        squares[4][0] = LINK;
        squares[4][1] = LINK;
        squares[4][2] = Board[5][0];
        squares[4][3] = Board[5][1];
        squares[4][4] = Board[5][2];
        squares[4][5] = LINK;
        squares[4][6] = LINK;

        squares[5][0] = LINK;
        squares[5][1] = Board[6][0];
        squares[5][2] = LINK;
        squares[5][3] = Board[6][1];
        squares[5][4] = LINK;
        squares[5][5] = Board[6][2];
        squares[5][6] = LINK;


        squares[6][0] = Board[7][0];
        squares[6][1] = LINK;
        squares[6][2] = LINK;
        squares[6][3] = Board[7][1];
        squares[6][4] = LINK;
        squares[6][5] = LINK;
        squares[6][6] = Board[7][2];

//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(GameBead[i][j] + "  ");
//            }
//            System.out.println();
//        }
//
//        System.out.println("AIPlayer method .. ..");
        AI(squares);

    }

    //
    public void AI(int[][] boards) {
        int moveRow = 0;
        int moveCol = 0;
        int AA = 2, BB = 2, CC = 2, DD = 2;
        System.out.println("AI method ...");
        Random random = new Random();
        int bead = random.nextInt(24);
        System.out.println(bead);
        // location = bead;
        ///selectBead();
//        String m = "a"+""+bead;
//        if(m.equals(a1)){
//            System.out.println("true");
//        }

        int I = Math.abs(bead / 3), J = 0, JJ = bead % 3;
        if (JJ == 0) {
            J = 2;
            if (I > 0) {
                I--;
            }

        } else if (JJ == 1) {
            J = 0;
        } else if (JJ == 2) {
            J = 1;
        }
        System.out.println("I =" + I);
        System.out.println("J =" + J);
        int K = 0, L = 0;
        if (GameBead[I][J] == -1) {

            if (I == 0) {
                System.out.println("I=0||I=7");
                K = I;
                L = J * 3;
            } else if (I == 7) {
                K = I - 1;
                L = J * 3;
            } else if (I == 1) {
                System.out.println("I=1||I=6");
                K = I;
                if (J == 0) {
                    L = J + 1;
                } else if (J == 1) {
                    L = J + 2;
                } else if (J == 2) {
                    L = J + 3;
                }

            } else if (I == 6) {
                K = I - 1;
                if (J == 0) {
                    L = J + 1;
                } else if (J == 1) {
                    L = J + 2;
                } else if (J == 2) {
                    L = J + 3;
                }
            } else if (I == 2) {
                System.out.println("I=2||I=5");
                K = I;
                L = J + 2;
            } else if (I == 5) {
                K = I - 1;
                L = J + 2;
            } else if (I == 3) {
                K = I;
                L = J;
            } else if (I == 4) {
                K = I - 1;
                L = J + 4;
            }
            System.out.println("K = " + K);
            System.out.println("L = " + L);
            //boards[K][L];
            moveRow = K;
            moveCol = L;
            //  for (int i = 0; i < 24; i++) {
            ArrayList<Integer> rowNeighbors = new ArrayList<>();
            ArrayList<Integer> cloNeighbors = new ArrayList<>();
            int V = 0;
            //  boards[K][L];
            //vertical to right
            for (int j = 1; j < AA; j++) {
                if (AA + L < 8) {
                    if (boards[K][L + j] == -2) {
                        AA++;
                    } else if (boards[K][L + j] == -1) {
                        int C = L + j;
                        rowNeighbors.add(K);
                        cloNeighbors.add(C);
                        V += 2;
                    } else if (boards[K][L + j] == 1 || boards[K][L + j] == 2) {
                        V += 10;
                    }
                }
            }

            //horizontal to top
            for (int j = 1; j < BB; j++) {
                if (BB < K + 2) {
                    if (boards[K - j][L] == -2) {
                        BB++;
                    } else if (boards[K - j][L] == -1) {
                        int C = L;
                        rowNeighbors.add(K);
                        cloNeighbors.add(C);
                        V += 2;
                    } else if (boards[K - j][L] == 1 || boards[K - j][L] == 2) {
                        V += 10;
                    }
                }
            }
            //horizontal to down
            for (int j = 1; j < CC; j++) {
                if (CC + K < 8) {
                    if (boards[K + j][L] == -2) {
                        CC++;
                    } else if (boards[K + j][L] == -1) {
                        int C = K + j;
                        rowNeighbors.add(C);
                        cloNeighbors.add(L);
                        V += 2;
                    } else if (boards[K + j][L] == 1 || boards[K + j][L] == 2) {
                        V += 10;
                    }
                }
            }
            //vertical to left
            for (int j = 1; j < DD; j++) {
                if (DD < L + 2) {
                    if (boards[K][L - j] == -2) {
                        DD++;
                    } else if (boards[K][L - j] == -1) {
                        int C = L - j;
                        rowNeighbors.add(K);
                        cloNeighbors.add(C);
                        V += 2;
                    } else if (boards[K][L - j] == 1 || boards[K][L - j] == 2) {
                        V += 10;
                    }
                }
            }
            utilitie(rowNeighbors, cloNeighbors, boards, moveRow, moveCol);
            currentValue = V;
            System.out.println("current value " + currentValue);
        }


        // }
        else {

            AI(boards);
        }

    }

    public void utilitie(ArrayList<Integer> row, ArrayList<Integer> col, int[][] boards, int moveRow, int moveCol) {

        System.out.println("utilitie method ...");
        ArrayList<Integer> rowNeighbors = new ArrayList<>();
        ArrayList<Integer> cloNeighbors = new ArrayList<>();
        ArrayList<Integer> rowNeighborss = new ArrayList<>();
        ArrayList<Integer> cloNeighborss = new ArrayList<>();
        int maxRowNeighbors = 0;
        int maxColNeighbors = 0;
        System.out.println(row);
        System.out.println(col);
        int AA = 2, BB = 2, CC = 2, DD = 2;
        for (int depth = 0; depth < 9; depth++) {
            //   System.out.println("repit ...");
            ArrayList<Integer> NV = new ArrayList<>();
            //if(depth<10) {
            for (int i = 0; i < row.size(); i++) {
                int ROW = row.get(i);
                int COL = col.get(i);
                int V = 0;
                //  boards[K][L];
                //vertical to right
                for (int j = 1; j < AA; j++) {
                    if (AA + COL < 8) {
                        if (boards[ROW][COL + j] == -2) {
                            AA++;
                        } else if (boards[ROW][COL + j] == -1) {
                            int C = COL + j;
                            rowNeighbors.add(ROW);
                            cloNeighbors.add(C);
                            V += 2;
                        } else if (boards[ROW][COL + j] == 1 || boards[ROW][COL + j] == 2) {
                            V += 10;
                        }
                    }
                }
                //horizontal to top
                for (int j = 1; j < BB; j++) {
                    if (BB < ROW + 2) {
                        if (boards[ROW - j][COL] == -2) {
                            BB++;
                        } else if (boards[ROW - j][COL] == -1) {
                            int C = ROW - j;
                            rowNeighbors.add(C);
                            cloNeighbors.add(COL);
                            V += 2;
                        } else if (boards[ROW - j][COL] == 1 || boards[ROW - j][COL] == 2) {
                            V += 10;
                        }
                    }
                }
                //horizontal to down
                for (int j = 1; j < CC; j++) {
                    if (CC + ROW < 8) {
                        if (boards[ROW + j][COL] == -2) {
                            CC++;
                        } else if (boards[ROW + j][COL] == -1) {
                            int C = ROW + j;
                            rowNeighbors.add(C);
                            cloNeighbors.add(COL);
                            V += 2;
                        } else if (boards[ROW + j][COL] == 1 || boards[ROW + j][COL] == 2) {
                            V += 10;
                        }
                    }
                }
                //vertical to left
                for (int j = 1; j < DD; j++) {
                    if (DD < COL + 2) {
                        if (boards[ROW][COL - j] == -2) {
                            DD++;
                        } else if (boards[ROW][COL - j] == -1) {
                            int C = COL - j;
                            rowNeighbors.add(ROW);
                            cloNeighbors.add(C);
                            V += 2;
                        } else if (boards[ROW][COL - j] == 1 || boards[ROW][COL - j] == 2) {
                            V += 10;
                        }
                    }
                }

                NV.add(V);
                //   findMax(NV);
                System.out.println("max col" + rowNeighbors);
                System.out.println("max col" + cloNeighbors);
                int max = NV.get(0);
                maxRowNeighbors = row.get(0);
                maxColNeighbors = col.get(0);
                for (int m = 0; m < NV.size(); m++) {
                    if (NV.get(m) > max) {
                        rowNeighborss.clear();
                        cloNeighborss.clear();
                        maxRowNeighbors = row.get(m);
                        maxColNeighbors = col.get(m);
                        rowNeighborss = rowNeighbors;
                        cloNeighborss = cloNeighbors;
                    }
                }
                rowNeighbors.clear();
                cloNeighbors.clear();

            }
            NV.clear();
            System.out.println("max col" + maxRowNeighbors);
            System.out.println("max row" + maxColNeighbors);
            row.clear();
            col.clear();
            row = rowNeighborss;
            col = cloNeighborss;
            //depth++;
            System.out.println(row);
            System.out.println(col);
        }
        moveRow = maxRowNeighbors;
        moveCol = maxColNeighbors;
        selectBead(moveRow, moveCol);
        System.out.println("moveRow is : " + moveRow);
        System.out.println("move col is : " + moveCol);
    }


//    void findMax(ArrayList<Integer> a) {
//        int max = a.get(0);
//        int index = 0;
//        for (int i = 0; i < a.size(); i++) {
//            if (a.get(i) > max) {
//                max = a.get(i);
//                ;
//                index = i;
//            }
//        }
//        nextValue = max;
//        if (nextValue > currentValue) {
//            currentValue = nextValue;
//            moveCol = index;
//            moveRow = index;
//        }
//
//    }

    void selectBead(int moveRow, int moveCol) {
        a1 = (ImageButton) findViewById(R.id.a1);
        a2 = (ImageButton) findViewById(R.id.a2);
        a3 = (ImageButton) findViewById(R.id.a3);
        a4 = (ImageButton) findViewById(R.id.a4);
        a5 = (ImageButton) findViewById(R.id.a5);
        a6 = (ImageButton) findViewById(R.id.a6);
        a7 = (ImageButton) findViewById(R.id.a7);
        a8 = (ImageButton) findViewById(R.id.a8);
        a9 = (ImageButton) findViewById(R.id.a9);
        a10 = (ImageButton) findViewById(R.id.a10);
        a11 = (ImageButton) findViewById(R.id.a11);
        a12 = (ImageButton) findViewById(R.id.a12);
        a13 = (ImageButton) findViewById(R.id.a13);
        a14 = (ImageButton) findViewById(R.id.a14);
        a15 = (ImageButton) findViewById(R.id.a15);
        a16 = (ImageButton) findViewById(R.id.a16);
        a17 = (ImageButton) findViewById(R.id.a17);
        a18 = (ImageButton) findViewById(R.id.a18);
        a19 = (ImageButton) findViewById(R.id.a19);
        a20 = (ImageButton) findViewById(R.id.a20);
        a21 = (ImageButton) findViewById(R.id.a21);
        a22 = (ImageButton) findViewById(R.id.a22);
        a23 = (ImageButton) findViewById(R.id.a23);
        a24 = (ImageButton) findViewById(R.id.a24);

        int K = 0, L = 0;

        if (moveRow == 0) {
            K = moveRow;
            L = moveCol / 3;
        } else if (moveRow == 7) {
            K = moveRow - 1;
            L = moveCol / 3;
        } else if (moveRow == 1) {
            K = moveRow;
            if (moveCol == 0) {
                L = moveCol - 1;
            } else if (moveCol == 3) {
                L = moveCol - 2;
            } else if (moveCol == 6) {
                L = moveCol - 3;
            }

        } else if (moveRow == 6) {
            K = moveRow - 1;
            if (moveCol == 0) {
                L = moveCol - 1;
            } else if (moveCol == 3) {
                L = moveCol - 2;
            } else if (moveCol == 6) {
                L = moveCol - 3;
            }
        } else if (moveRow == 2) {
            K = moveRow;
            L = moveCol - 2;
        } else if (moveRow == 5) {
            K = moveRow - 1;
            L = moveCol - 2;

        } else if (moveRow == 3) {
            K = moveRow;
            L = moveCol;
        } else if (moveRow == 4) {
            K = moveRow - 1;
            L = moveCol - 4;
        }
        System.out.println("Location is : " + K);
        System.out.println("Location is : " + L);
        location = K * L;
        System.out.println("Location is : " + location);
        String s = "a" + "" + location;
        System.out.println("String location : "+ s);
        if (A1.equals(s)) {
            a1.setBackgroundColor(color2);
        } else if (A2.equals(s)) {
            a2.setBackgroundColor(color2);
        } else if (A3.equals(s)) {
            a3.setBackgroundColor(color2);
        } else if (A4.equals(s)) {
            a4.setBackgroundColor(color2);
        } else if (A5.equals(s)) {
            a5.setBackgroundColor(color2);
        } else if (A6.equals(s)) {
            a6.setBackgroundColor(color2);
        } else if (A7.equals(s)) {
            a7.setBackgroundColor(color2);
        } else if (A8.equals(s)) {
            a8.setBackgroundColor(color2);
        } else if (A9.equals(s)) {
            a9.setBackgroundColor(color2);
        } else if (A10.equals(s)) {
            a10.setBackgroundColor(color2);
        } else if (A11.equals(s)) {
            a11.setBackgroundColor(color2);
        } else if (A12.equals(s)) {
            a12.setBackgroundColor(color2);
        } else if (A13.equals(s)) {
            a13.setBackgroundColor(color2);
        } else if (A14.equals(s)) {
            a14.setBackgroundColor(color2);
        } else if (A15.equals(s)) {
            a15.setBackgroundColor(color2);
        } else if (A16.equals(s)) {
            a16.setBackgroundColor(color2);
        } else if (A17.equals(s)) {
            a17.setBackgroundColor(color2);
        } else if (A18.equals(s)) {
            a18.setBackgroundColor(color2);
        } else if (A19.equals(s)) {
            a19.setBackgroundColor(color2);
        } else if (A20.equals(s)) {
            a20.setBackgroundColor(color2);
        } else if (A21.equals(s)) {
            a21.setBackgroundColor(color2);
        } else if (A22.equals(s)) {
            a22.setBackgroundColor(color2);
        } else if (A23.equals(s)) {
            a23.setBackgroundColor(color2);
        } else if (A24.equals(s)) {
            a24.setBackgroundColor(color2);
        }

    }


    public void switchPlayer() {
        if (currentPlayer == 1) {
            currentPlayer = 2;
        } else if (currentPlayer == 2) {
            currentPlayer = 1;
        }
    }
//    public void fillArray(int[][] a){
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[0].length; j++) {
//                a[i][j] = -1;
//            }
//        }
//    }
}

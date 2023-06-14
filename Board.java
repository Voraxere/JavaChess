public class Board {

  public static void main(String[] args) {
    Board board = new Board();
    int[][] finalBoard = board.createBoard();

    // Print the Matrix
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        System.out.print(finalBoard[i][j] + "\t");
      }
      System.out.println();
    }
  }

  private int[][] createBoard() {
    int size = 8;

    // Create the 2d array using the size
    int[][] board = new int[size][size];

    // Adding the Pawns
    for (int i = 0; i < size; i++) {
      board[1][i] = 7;
      board[6][i] = 1;
    }

    // add the Rooks, white as 2, and black as 8
    board[0][0] = 8;
    board[0][7] = 8;
    board[7][0] = 2;
    board[7][7] = 2;

    // Add the Knights, white as 3, and black as 9
    board[0][1] = 9;
    board[0][6] = 9;
    board[7][1] = 3;
    board[7][6] = 3;

    // Add the Bishops, white as 4, and black as 10
    board[0][2] = 10;
    board[0][5] = 10;
    board[7][2] = 4;
    board[7][5] = 4;

    // Add the Queens, white as 5, and black as 11
    board[0][3] = 11;
    board[7][3] = 5;

    // Add the Kings, white as 6, and black as 12
    board[0][4] = 12;
    board[7][4] = 6;

    return board;
  }
}

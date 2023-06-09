import java.util.Scanner;

public class Board {

  public static void main(String[] args) {
    Board board = new Board();
    int[][] finalBoard = board.createBoard();
    board.play(finalBoard, 'w');
    board.printBoard(finalBoard);
    System.out.println("/n");
    board.printBoard(finalBoard);
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

  private boolean isValidMove(
    int[][] board,
    char player,
    int move,
    int x1,
    int y1,
    int x2,
    int y2
  ) {
    //Check if the move is valid just by if it is black or white
    if (isBlack(board[x1][y1]) && player == 'w') {
      return false;
    } else if (!isBlack(board[x1][y1]) && player == 'b') {
      return false;
    }

    return true;
  }

  private void printBoard(int[][] board) {
    for (int i = 0; i < board.length; i++) {
      System.out.print("|");
      for (int j = 0; j < board[i].length; j++) {
        System.out.print(board[i][j] + "|");
      }
      System.out.println();
    }
  }

  private boolean isBlack(int piece) {
    if (piece > 6) {
      return true;
    } else {
      return false;
    }
  }

  private void play(int[][] board, char player) {
    int move = 1;
    Scanner inputs = new Scanner(System.in); // Create the Scanner object outside the loop
    while (true) {
      printBoard(board);
      System.out.println("Enter the x1 coordinate: ");
      int x1 = inputs.nextInt();
      System.out.println(x1);

      System.out.println("Enter the y1 coordinate: ");
      int y1 = inputs.nextInt();
      System.out.println(y1);

      System.out.println("Enter the x2 coordinate: ");
      int x2 = inputs.nextInt();
      System.out.println(x2);

      System.out.println("Enter the y2 coordinate: ");
      int y2 = inputs.nextInt();
      System.out.println(y2);

      if (isValidMove(board, player, move, x1, y1, x2, y2)) {
        board[x2][y2] = board[x1][y1];
        board[x1][y1] = 0;
      }
      else {
        System.out.println("Invalid Move");
        System.out.println(player);
      }
      // Check if the game is over
      // Switch the player
      move++;
      if (move % 2 == 0) {
        player = 'b';
      } else {
        player = 'w';
      }
    }
  }
}

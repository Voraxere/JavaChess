import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

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
    return board;
  }
}

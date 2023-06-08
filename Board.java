public class Board {

  public static void main(String[] args) {
    CreateBoard();
  }

  private static void CreateBoard() {
    int size = 8;

    //Create the 2d array using the size
    int board[][] = new int[size][size];

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        board[i][j] = i * j;
      }
    }

    // Print the Matrix
    for (int i=0; i<size; i++){
        for (int j=0; j<size; j++){
            System.out.print(board[i][j] + "\t");
        }
        System.out.println();
    }
  }
}

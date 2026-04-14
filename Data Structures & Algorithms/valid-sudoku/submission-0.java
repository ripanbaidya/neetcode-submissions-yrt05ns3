class Solution {
  public boolean isValidSudoku(char[][] board) {
    return isValidRow(board) && isValidColumn(board) && isValidSubBoxes(board);
  }

  private boolean isValidRow(char[][] board) {
    for (int i = 0; i < 9; i++) {
      HashSet<Integer> set = new HashSet<>();
      for (int j = 0; j < 9; j++) {
        if (board[i][j] == '.')
          continue;
        int num = board[i][j] - '0';

        if (set.contains(num))
          return false;

        set.add(num);
      }
    }

    return true;
  }

  private boolean isValidColumn(char[][] board) {
    for (int i = 0; i < 9; i++) {
      HashSet<Integer> set = new HashSet<>();
      for (int j = 0; j < 9; j++) {
        if (board[j][i] == '.')
          continue;
        int num = board[j][i] - '0';

        if (set.contains(num))
          return false;

        set.add(num);
      }
    }

    return true;
  }

  private boolean isValidSubBoxes(char[][] board) {
    for (int row = 0; row < 9; row += 3) {
      for (int col = 0; col < 9; col += 3) {

        HashSet<Integer> set = new HashSet<>();

        // Traverse each 3x3 box
        for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {

            char ch = board[row + i][col + j];

            if (ch == '.')
              continue;

            int num = ch - '0';

            if (set.contains(num))
              return false;

            set.add(num);
          }
        }
      }
    }

    return true;
  }

}
public boolean clearPair(int row, int col) {
  for (int i = 0; i < puzzle.length; i++) {
    for (int j = 0; j < puzzle[0].length; j++) {
      if ((i >= row && col != j) && (puzzle[i][j] == puzzle[row][col] || puzzle[i][j] + puzzle[row][col] == 10)) {
        puzzle[i][j] == 0;
        puzzle[row][col] == 0;
        return true;
      }
    return false;
    }
  }
}
      
      

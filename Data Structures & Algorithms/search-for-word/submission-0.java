class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Start backtracking if the first character matches
                if (board[i][j] == word.charAt(0)) {
                    if (backtrack(board, word, i, j, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean backtrack(char[][] board, String word, int row, int col, int index) {
        // Base case 1: Matched the whole word
        if (index == word.length()) {
            return true;
        }

        // Base case 2: Out of bounds or character mismatch
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col] != word.charAt(index)) {
            return false;
        }

        // Mark cell as visited in-place
        char temp = board[row][col];
        board[row][col] = '#';

        // Explore 4 directions
        boolean found = backtrack(board, word, row + 1, col, index + 1) ||
                        backtrack(board, word, row - 1, col, index + 1) ||
                        backtrack(board, word, row, col + 1, index + 1) ||
                        backtrack(board, word, row, col - 1, index + 1);

        // Backtrack: Restore original character
        board[row][col] = temp;

        return found;
    }
}
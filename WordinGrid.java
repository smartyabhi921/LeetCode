class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        // Iterate through each cell in the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // If the current cell matches the first character of the word, start DFS
                if (board[i][j] == word.charAt(0) && dfs(board, i, j, word, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(char[][] board, int i, int j, String word, int index) {
        // If all characters of the word have been matched, return true
        if (index == word.length()) {
            return true;
        }

        // Check if the current cell is within the bounds of the grid and matches the
        // current character of the word
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return false;
        }

        // Mark the current cell as visited by changing its character temporarily
        char temp = board[i][j];
        board[i][j] = '*';

        // Explore adjacent cells recursively
        boolean found = dfs(board, i + 1, j, word, index + 1) ||
                dfs(board, i - 1, j, word, index + 1) ||
                dfs(board, i, j + 1, word, index + 1) ||
                dfs(board, i, j - 1, word, index + 1);

        // Restore the original character of the current cell
        board[i][j] = temp;

        return found;
    }
}

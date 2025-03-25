// public class WordSearch {
//     public boolean exist(char[][] board, String word) {
//         int m = board.length;
//         int n = board[0].length;

//         boolean[][] visited = new boolean[m][n];
//         boolean result = false;

//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (board[i][j] == word.charAt(0)) {
//                     result = backtrack(board, word, visited, i, j, 0);
//                     if (result)
//                         return true;
//                 }
//             }
//         }
//         return false;
//     }

//     private boolean backtrack(char[][] board, String word, boolean[][] visited, int i, int j, int index) {
//         if (index == word.length()) {
//             return true;
//         }

//         if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j]
//                 || board[i][j] != word.charAt(index)) {
//             return false;
//         }

//         visited[i][j] = true;

//         if (backtrack(board, word, visited, i + 1, j, index + 1) ||
//                 backtrack(board, word, visited, i - 1, j, index + 1) ||
//                 backtrack(board, word, visited, i, j + 1, index + 1) ||
//                 backtrack(board, word, visited, i, j - 1, index + 1)) {
//             return true;
//         }

//         visited[i][j] = false;
//         return false;
//     }
// }

public class WordSearch {
    public static void main(String args[]) {
        char board[][] = new char[3][4];
        int m = board.length;
        int n = board[0].length;
        System.out.println(m);
        System.out.println(n);
    }

    public boolean wordFound(int n, String s) {
        if (n == s.length()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean visited[][] = new boolean[m][n];
        int rows = 0;
        int cols = 0;
        int wordPos = 0;

        if (board[rows][cols] == word.charAt(wordPos)) {
            wordPos++;
        }

        for (int i = 1; i < m * n; i++) {
            if (rows > 0 && board[rows - 1][cols] == word.charAt(wordPos) &&
                    !visited[rows - 1][cols]) {
                wordPos++;
                if (wordFound(wordPos, word)) {
                    return true;
                }
                rows--;
                visited[rows][cols] = true;
                continue;
            }
            if (cols > 0 && board[rows][cols - 1] == word.charAt(wordPos) &&
                    !visited[rows][cols - 1]) {
                wordPos++;
                if (wordFound(wordPos, word)) {
                    return true;
                }
                cols--;
                visited[rows][cols] = true;
                continue;
            }
            if (rows < m - 1 && board[rows + 1][cols] == word.charAt(wordPos) &&
                    !visited[rows + 1][cols]) {
                wordPos++;
                if (wordFound(wordPos, word)) {
                    return true;
                }
                rows++;
                visited[rows][cols] = true;
                continue;
            }
            if (cols < n - 1 && board[rows][cols + 1] == word.charAt(wordPos) &&
                    !visited[rows][cols + 1]) {
                wordPos++;
                if (wordFound(wordPos, word)) {
                    return true;
                }
                cols++;
                visited[rows][cols] = true;
                continue;
            }
            rows++;
            cols++;
        }
        return false;
    }
}
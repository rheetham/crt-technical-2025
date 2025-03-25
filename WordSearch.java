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
            if (rows > 0 && board[rows - 1][cols] == word.charAt(wordPos) && !visited[rows - 1][cols]) {
                wordPos++;
                if (wordFound(wordPos, word)) {
                    return true;
                }
                rows--;
                visited[rows][cols] = true;
                continue;
            }
            if (cols > 0 && board[rows][cols - 1] == word.charAt(wordPos) && !visited[rows][cols - 1]) {
                wordPos++;
                if (wordFound(wordPos, word)) {
                    return true;
                }
                cols--;
                visited[rows][cols] = true;
                continue;
            }
            if (rows < m - 1 && board[rows + 1][cols] == word.charAt(wordPos) && !visited[rows + 1][cols]) {
                wordPos++;
                if (wordFound(wordPos, word)) {
                    return true;
                }
                rows++;
                visited[rows][cols] = true;
                continue;
            }
            if (cols < n - 1 && board[rows][cols + 1] == word.charAt(wordPos) && !visited[rows][cols + 1]) {
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
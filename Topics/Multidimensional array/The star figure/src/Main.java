import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        char[][] board = new char[n][n];

        int center = n / 2;

        for (char[] row : board) {

            Arrays.fill(row, '.');
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i == j ||
                        (i + j == board.length - 1) ||
                        i == center ||
                        j == center) {
                    board[i][j] = '*';
                }
            }
        }

        for (char[] row : board) {
            for (char c : row) {
                System.out.printf("%c ", c);
            }
            System.out.println();
        }
    }
}
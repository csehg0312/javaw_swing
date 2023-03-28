import java.util.Random;

public class GameOfLife {
    private static final int ROWS = 20;
    private static final int COLS = 50;
    private static final int GENERATIONS = 50;

    public static void main(String[] args) throws InterruptedException {
        boolean[][] currentGen = new boolean[ROWS][COLS];
        boolean[][] nextGen = new boolean[ROWS][COLS];
        Random random = new Random();

        // Initialize the game board randomly
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                currentGen[row][col] = random.nextBoolean();
            }
        }

        // Run the game for a fixed number of generations
        for (int gen = 0; gen < GENERATIONS; gen++) {
            // Clear the screen between generations
            System.out.print("\033[H\033[2J");
            System.out.flush();

            // Print the current generation
            for (int row = 0; row < ROWS; row++) {
                for (int col = 0; col < COLS; col++) {
                    System.out.print(currentGen[row][col] ? "X " : "  ");
                }
                System.out.println();
            }

            // Update the next generation based on the current one
            for (int row = 0; row < ROWS; row++) {
                for (int col = 0; col < COLS; col++) {
                    int neighbors = countNeighbors(currentGen, row, col);
                    if (currentGen[row][col] && (neighbors == 2 || neighbors == 3)) {
                        nextGen[row][col] = true;
                    } else if (!currentGen[row][col] && neighbors == 3) {
                        nextGen[row][col] = true;
                    } else {
                        nextGen[row][col] = false;
                    }
                }
            }

            // Swap the current and next generations
            boolean[][] temp = currentGen;
            currentGen = nextGen;
            nextGen = temp;

            // Wait for a short period between generations
            Thread.sleep(100);
        }
    }

    private static int countNeighbors(boolean[][] currentGen, int row, int col) {
        int count = 0;
        for (int r = row - 1; r <= row + 1; r++) {
            for (int c = col - 1; c <= col + 1; c++) {
                if (r >= 0 && r < ROWS && c >= 0 && c < COLS && currentGen[r][c] && !(r == row && c == col)) {
                    count++;
                }
            }
        }
        return count;
    }
}

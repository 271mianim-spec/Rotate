public class Rotate {
//    public static int[][] grid;
//
//    public Rotate(int[][] grid) {
//        this.grid = grid;
//    }

    public static String printGrid(int[][] printGrid) {
        String gridString = "";
        for (int row = 0; row < printGrid.length; row++) {
            for (int col = 0; col < printGrid[row].length; col++) {
                gridString += printGrid[row][col];
            }
            gridString = gridString + "\n";
        }
        return gridString;
    }

    public static int[][] rotateArray(int[][] grid) {
        int[][] newGrid = new int[grid.length][grid[0].length];

        int newRow = 0;
        int newCol = 0;

        for (int row = 0; row < grid.length; row++) {
            for (int col = grid[row].length-1; col >= 0; col--) {
                newGrid[newCol][newRow] = grid[col][row];
                newRow++;
            }
            newRow=0;
            newCol++;
        }

        return newGrid;
    }
}

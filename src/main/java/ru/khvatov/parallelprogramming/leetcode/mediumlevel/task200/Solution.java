package ru.khvatov.parallelprogramming.leetcode.mediumlevel.task200;

/**
 * The task desc is available at <a href="https://leetcode.com/problems/number-of-islands/description/">200. Number of Islands</a>
 */
public class Solution {
    public int numIslands(char[][] grid) {
        int numOfRows = grid.length;
        int numOfColumns = grid[0].length;
        boolean[][] visited = new boolean[numOfRows][numOfColumns];

        int count = 0;
        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < numOfColumns; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    count++;
                    visitIslandCells(grid, visited, j, i, numOfRows, numOfColumns);
                }
            }
        }
        return count;
    }

    private void visitIslandCells(char[][] grid, boolean[][] visited, int x, int y, int numOfRows, int numOfColumns) {
        if (isOutOfGrid(x, y, numOfRows, numOfColumns) || grid[y][x] == '0' || visited[y][x]) {
            return;
        }
        visited[y][x] = true;

        visitIslandCells(grid, visited, x, y + 1, numOfRows, numOfColumns); // go up
        visitIslandCells(grid, visited, x, y - 1, numOfRows, numOfColumns); // go down
        visitIslandCells(grid, visited, x - 1, y, numOfRows, numOfColumns); // go left
        visitIslandCells(grid, visited, x + 1, y, numOfRows, numOfColumns); // go right
    }

    private boolean isOutOfGrid(int x, int y, int numOfRows, int numOfColumns) {
        boolean isWithinGrid = x >= 0 && y >= 0 && x < numOfColumns && y < numOfRows;
        return !isWithinGrid;
    }
}

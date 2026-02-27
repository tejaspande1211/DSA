
/*
 * Problem Statement:
 * Given a grid of size m*n, let us assume you are starting at (1,1) and your
 * goal is to reach (m,n). At any instance, if you are on (x,y), you can either
 * go to (x, y+1) or (x+1, y).
 * Now consider if some obstacles are added to the grid.
 * How many unique paths would there be?
 * An obstacle and space are marked as 1 and 0 respectively in the grid.
 *
 * Sample test case:
 * Input:
 * m=3, n=3
 * arr = [[0,0,0],
 *        [0,1,0],
 *        [0,0,0]]
 * Output: 2
 */
public class UniquePathsWithObstacles {
    public static void main(String[] args) {
        int[][] maze = {
                { 0, 0, 0 },
                { 0, 1, 0 },
                { 0, 0, 0 }
        };
        int m = 3;
        int n = 3;
        System.out.println(findWays(maze, m, n));
    }

    static int findWays(int[][] maze, int m, int n) {
        return findWaysRecursively(maze, m, n, 0, 0);
    }

    static int findWaysRecursively(int[][] maze, int m, int n, int curx, int cury) {
        if (curx >= m || cury >= n || maze[curx][cury] == 1)
            return 0;
        if (curx == m - 1 && cury == n - 1)
            return 1;
        return findWaysRecursively(maze, m, n, curx + 1, cury) +
               findWaysRecursively(maze, m, n, curx, cury + 1);
    }
}
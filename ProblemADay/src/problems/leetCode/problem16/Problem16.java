package problems.leetCode.problem16;

public class Problem16 {

    /*Max Area of Island
    You are given an m x n binary matrix grid. An island is a
    group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.

    The area of an island is the number of cells with a value 1 in the island.

    Return the maximum area of an island in grid.
    If there is no island, return 0.

    Input: grid = [[0,0,1,0,0,0,0,1,0,0,0,0,0],
                   [0,0,0,0,0,0,0,1,1,1,0,0,0],
                   [0,1,1,0,1,0,0,0,0,0,0,0,0],
                   [0,1,0,0,1,1,0,0,1,0,1,0,0],
                   [0,1,0,0,1,1,0,0,1,1,1,0,0],
                   [0,0,0,0,0,0,0,0,0,0,1,0,0],
                   [0,0,0,0,0,0,0,1,1,1,0,0,0],
                   [0,0,0,0,0,0,0,1,1,0,0,0,0]]
            Output: 6
Explanation: The answer is not 11, because the island must be connected 4-directionally.
*/
    // ref:- https://leetcode.com/problems/max-area-of-island/
    public static void main(String[] args) {
        int [][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
                         {0,0,0,0,0,0,0,1,1,1,0,0,0},
                         {0,1,1,0,1,0,0,0,0,0,0,0,0},
                         {0,1,0,0,1,1,0,0,1,0,1,0,0},
                         {0,1,0,0,1,1,0,0,1,1,1,0,0},
                         {0,0,0,0,0,0,0,0,0,0,1,0,0},
                         {0,0,0,0,0,0,0,1,1,1,0,0,0},
                         {0,0,0,0,0,0,0,1,1,0,0,0,0}};

        System.out.println(maxAreaOfIsland(grid));
    }

    private static int maxAreaOfIsland(int[][] grid) {

        boolean [][] visited = new boolean[grid.length][grid[0].length];
        int ans = 0;
        for(int i =0; i< grid.length; i++){
            for(int j =0; j< grid[0].length; j++){

                if (grid[i][j] != 1){
                    visited[i][j] = true;
                }
                else{

                    int ans_var = areaOfIsland(grid, i, j, visited);

                    if (ans < ans_var){
                        ans = ans_var;
                    }
                }
            }
        }
        return ans ;
    }

    private static int areaOfIsland(int[][] arr, int row, int col, boolean[][] visited) {

        if(row<0 || col<0 || col == arr[0].length || row == arr.length || arr[row][col] == 0 || visited[row][col])
        {
            return 0;
        }

        visited[row][col] = true;

        return (1 + areaOfIsland(arr, row -1, col, visited )
                  + areaOfIsland(arr, row, col -1, visited )
                   + areaOfIsland(arr, row + 1 , col, visited )
                  + areaOfIsland(arr, row, col +1, visited ));




    }

}

package problems.leetCode.problem19;

import java.util.LinkedList;
import java.util.Queue;

public class Problem19 {
    /*Given an m x n binary matrix mat, return the distance
    of the nearest 0 for each cell.

    Input: mat = [[0,0,0],[0,1,0],[0,0,0]]
`   Output: [[0,0,0],[0,1,0],[0,0,0]]
     */

    public static void main(String[] args) {
        int [][] mat = {
                            {0,0,0},
                            {0,1,0},
                            {0,0,0}
                        };

        Solution s = new Solution();
        int [][] ans = s.updateMatrix(mat);

        for (int i = 0; i< ans.length; i++){
            for (int j =0 ; j< ans[0].length; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    static class Solution {

        private final int[][] directions = {{1, 0},  {0, 1}, {-1, 0}, {0, -1}};

        public int[][] updateMatrix(int[][] mat) {

            int m = mat.length;
            int n = mat[0].length;

            int[][] distances = new int[m][n];

            Queue<int[]> queue = new LinkedList<>();

            for(int i=0;i<m;i++) {
                for(int j=0;j<n;j++) {
                    if(mat[i][j] == 0) {
                        queue.offer(new int[]{i, j});
                    } else {
                        distances[i][j] = Integer.MAX_VALUE;
                    }
                }
            }

            while(!queue.isEmpty()) {

                int[] polled = queue.poll();

                int x = polled[0];
                int y = polled[1];

                for(int[] direction: directions)

                {
                    int X = x + direction[0], Y = y + direction[1];

                    if(X >= 0 && Y >= 0 && X < m && Y < n && distances[X][Y] > distances[x][y] + 1)
                    {
                        queue.offer(new int[]{X, Y});
                        distances[X][Y] = distances[x][y] + 1;
                    }
                }
            }
            return distances;
        }
    }

}

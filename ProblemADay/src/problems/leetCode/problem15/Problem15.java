package problems.leetCode.problem15;

public class Problem15 {
    /*An image is represented by an m x n integer grid image where
    image[i][j] represents the pixel value of the image.

    You are also given three integers sr, sc, and newColor.
    You should perform a flood fill on the image starting from the pixel image[sr][sc].

    To perform a flood fill, consider the starting pixel, plus any pixels connected
    4-directionally to the starting pixel of the same color as the starting pixel,
    plus any pixels connected 4-directionally to those pixels (also with the same color),
    and so on. Replace the color of all of the aforementioned pixels with newColor.

    Return the modified image after performing the flood fill.

I   Input: image = [[1,1,1],[1,1,0],[1,0,1]], sr = 1, sc = 1, newColor = 2
    Output: [[2,2,2],[2,2,0],[2,0,1]]
    Explanation: From the center of the image with position (sr, sc) = (1, 1) (i.e., the red pixel), all pixels connected by a path of the same color as the starting pixel (i.e., the blue pixels) are colored with the new color.
    Note the bottom corner is not colored 2, because it is not 4-directionally connected to the starting pixel.

    */

    // ref :- https://leetcode.com/problems/flood-fill/

    public static void main(String[] args) {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1;
        int sc = 1;
        int newColor = 2;

        Solution s = new Solution();

        int [][] resImage = s.floodFill(image, sr, sc, newColor);

        for(int i =0; i < image.length; i++){
            for (int j =0; j< image[0].length; j++){
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
    }

    static class Solution {
        public int[][] floodFill(int[][] arr, int row, int col, int newColor)
        {

            int color = arr[row][col];
            if(color != newColor){
                dfs(arr, row, col, newColor, color);
            }
            return arr;

        }

        public void dfs(int[][] arr, int row, int col, int newColor, int color){

            if(row<0 || col<0 || col == arr[0].length || row == arr.length || arr[row][col] != color)
            {
                return;
            }

            arr[row][col] = newColor;

            dfs(arr, row - 1, col, newColor, color);
            dfs(arr, row, col - 1, newColor, color);
            dfs(arr, row + 1, col, newColor, color);
            dfs(arr, row, col + 1, newColor, color);
        }
    }
}

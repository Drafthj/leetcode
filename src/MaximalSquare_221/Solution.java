package MaximalSquare_221;
/**
 * Created by drafthj on 2016/11/17 14:02.
 */
public class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix == null||matrix.length==0||matrix[0].length==0)
            return 0;
        int height = matrix.length;
        int width = matrix[0].length;
        int [][]num = new int[height][width];
        int max = 0;
        for(int i = 0;i<height;i++){
            if(matrix[i][0]=='1'){
                num[i][0] = 1;
                max = 1;
            }
        }
        for (int j = 0;j<width;j++){
            if(matrix[0][j]=='1'){
                num[0][j] = 1;
                max = 1;
            }
        }
        for(int i = 1;i<height;i++){
            for(int j = 1;j<width;j++){
                if(matrix[i][j]=='1') {
                    num[i][j] = Math.min(Math.min(num[i - 1][j], num[i][j - 1]), num[i-1][j-1]) + 1;
                    max = Math.max(max, num[i][j]);
                }
            }
        }
        return max*max;
    }

    public static void main(String[] args) {
        char[][] matrix = new char[][]{{'1'}};
        System.out.println(new Solution().maximalSquare(matrix));
    }
}

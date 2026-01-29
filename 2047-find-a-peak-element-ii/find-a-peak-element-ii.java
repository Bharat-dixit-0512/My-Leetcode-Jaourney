class Solution {
    public int[] findPeakGrid(int[][] mat) {
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(checkPeak(mat,i,j)) return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
    boolean checkPeak(int[][] mat,int i,int j){
        int rows = mat.length;
        int cols = mat[0].length;
        int num = mat[i][j];

        // check up
        if (i > 0 && mat[i-1][j] >= num) return false;
        // check down
        if (i < rows-1 && mat[i+1][j] >= num) return false;
        // check left
        if (j > 0 && mat[i][j-1] >= num) return false;
        // check right
        if (j < cols-1 && mat[i][j+1] >= num) return false;

        return true;
    }
}
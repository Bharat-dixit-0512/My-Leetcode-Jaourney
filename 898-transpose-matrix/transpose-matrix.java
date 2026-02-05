class Solution {
    public int[][] transpose(int[][] matrix) {
        int result[][]=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                result[j][i]=matrix[i][j];
            }
        }
        for(int ar[]:result){
            System.out.println(Arrays.toString(ar));
        }
        return result;
    }
}
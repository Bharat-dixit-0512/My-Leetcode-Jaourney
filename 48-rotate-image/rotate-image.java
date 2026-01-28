class Solution {
    public void rotate(int[][] matrix) {
        //transpose krenge pehle matrix ko (row ko column m bdl do)
        //then reverse the row
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        // for(int arr[]:matrix){
        //     System.out.print(Arrays.toString(arr));
        // }
        for(int r[]:matrix){
            rev(r);
        }
    }
    void rev(int a[]){
        int left=0,right=a.length-1;
        while(left<=right){
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
    }
}
class Solution {
    public static void rotate(int[][] a) {
        int n=a.length;
        transpose(a,n);
        reverse(a,n);
        }

    public static void transpose(int a[][],int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
    }
    public static void reverse(int a[][],int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=a[i][j];
                a[i][j]=a[i][n-j-1];
                a[i][n-j-1]=temp;
            }
        }
    }
}
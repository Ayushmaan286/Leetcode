/*You are given an n x n 2D matrix representing an image, 
rotate the image by 90 degrees (clockwise).
You have to rotate the image in-place, which means you have to 
modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]*/
class Solution {
    public void rotate(int[][] matrix) {
        /*observe kro ki jo orginal matrix ka first column hai 
        wo final matrix ki first row hai reverse me 
        to phle transpose nikalo 
        and then har row ko reverse krdo */

        int r = matrix.length;// number of rows
        int c = matrix[0].length;// number of columns

        for(int i=0;i<r;i++) // transpose of matrix
        {
            for(int j=i+1;j<c;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for(int i=0;i<r;i++)//reversing all the rows
        {
            int left=0;
            int right=c-1;
             /* reversing the left and right elements untill middle one arrives*/
            while(left<right)
            {
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;

                left++;
                right--;
            }
            
        }
    }
}
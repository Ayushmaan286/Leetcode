/*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
 */
//      use two pointers

class Solution {
    public void moveZeroes(int[] nums) {
        int l=nums.length;
        int i=0;
        int j,temp;
        for(j=0;j<l;j++)
        {
            if(nums[j]!=0)
            {
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;

                i++;
            }
        }
        
    }
}
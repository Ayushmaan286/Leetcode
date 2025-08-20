/* Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]*/
//
// APPROACH:-ek reverse function bnao alag se 
//           pure array ko reverse krdo ek bar 
//           array ko reverse kro 0 se leke k index tak 
//           array ko reverse kro k se leke last index tak 
//

class Solution {
    public void rotate(int[] nums, int k) 
    {
        int l=nums.length;
        k=k%l;
        reverse(nums,0,l-1);
        reverse(nums,0,k-1);
        reverse(nums,k,l-1);
    }
    public void reverse(int [] nums, int start, int end)
    { 
        int temp;
        while(start<end)
        {
            temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;

            start++;
            end--;
        }
    }
}
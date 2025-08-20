/*Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1] */

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=-1;
        int last=-1;
        int l=nums.length;
        for(int i=0;i<l;i++)
        {
            if(nums[i]== target)
            {
                first=i;
                break;
            }
        }
        for(int i=l-1;i>=0;i--)
        {
            if(nums[i]== target)
            {
                last=i;
                 break;
            }
        }
        int arr[]={first,last};
        return arr;
        
    }
}

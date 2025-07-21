/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
  */

  /*ek loop lgao i ka jo 0 se length tak jaye  and uske andr ek or loop jo i+1 se length tak jaye fir dono ka sum krke dekhte rho if koi pair hai ki nhi 
SPECIAL THING IN THE PROBLEM IS TO RETURN A ARRAY IN A FUNCTION */


  class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l=nums.length;
        // int count=0;
        int i,j;
        for( i=0;i<l;i++)
        {
            for(j=i+1;j<l;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    return new int[]{i,j};
                    
                }
            }
        }
        return new int[]{};
        
    }
}
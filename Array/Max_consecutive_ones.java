/*Given a binary array nums, return the maximum number of consecutive 1's in the array.

Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2 */

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int l= nums.length;
        int largest =0;
        for(int i=0;i<l;i++)
        {
            if(nums[i]==1)
            count++;
            else
            {
                if(largest<count)
                largest=count;
                count=0;
            }
            if(largest<count) // last me agar maximum 1 aaye or uske bad agar koi zero nhi hua to else me jaega hi nhi isliye yaha check krna pda
             largest=count;
        }
        return largest;
    }
}
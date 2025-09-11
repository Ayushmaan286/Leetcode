/*You are given a 0-indexed integer array nums of even length consisting
 of an equal number of positive and negative integers.
You should return the array of nums such that the the array follows the given conditions:
Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.
Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

 

Example 1:

Input: nums = [3,1,-2,-5,2,-4]
Output: [3,-2,1,-5,2,-4]
Explanation:
The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] 
are incorrect because they do not satisfy one or more conditions.   */
//
//
// APPROACH:-   original array ko 2 array me divide krdo ek positive array and ek negative array 
//              fir original array me ek element positive array se or ek element negative array se   
//              daal do  
//
//

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int l=nums.length;

        int pos[]=new int[l];
        int pos1=0;
        int neg[]=new int[l];
        int neg1=0;
        for(int i=0;i<l;i++)
        {
            if(nums[i]>0)
            {
                pos[pos1]=nums[i];
                pos1++;
            }
            if(nums[i]<0)
            {
                neg[neg1]=nums[i];
                neg1++;
            }
        }
        int p=0;
        int q=0;

      for(int i=0;i<l;i++)
      {
        if(i%2==0)
        {
            nums[i]=pos[p++];
        }
        else
        {
            nums[i]=neg[q++];
        }
        
      }
       return nums;
        
    }
}
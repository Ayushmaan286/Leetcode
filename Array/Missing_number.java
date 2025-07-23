/*Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.*/

/* array ka sum calculate kro , then 0 se leke array ki length tk ka sum find kro fir dono ko subtract krdo , you will get the required missing number */


class Solution {
    public int missingNumber(int[] nums) {
     
     int l=nums.length;
     // array sum
     int sum=0;
     for(int i=0;i<nums.length;i++)
     {
        sum=sum+nums[i];
     }

     // sum of numbers from 0 to greatest
     int sum_number=0;
     for(int i=0;i<=l;i++)
     {
        sum_number=sum_number+i;

     }
     return (sum_number - sum);
    }
}
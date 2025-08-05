/*Given an integer array nums, find the subarray with the largest sum, and return its sum. */

// BRUTE -  ek i ka loop start element ke liye, ek j ka loop ending element ke liye  or ek k ka loop jo subarray nikalega
// i se leke j tak and fir subarray ka sum calculate krlo
//
//BETTER- ek i ka loop start element ke liye and ek j ka loop i se leke n-1 tak and fir har bar sum me arr[j] ko add krenge 
// jisse hme teesre loop ki need nhi hogi  
//
//OPTIMAL- kadane's algorithm(for finding maximum subarray problem)
//
//       isme ham single loop ki help se iterate krte hain and har ek element ko sum me add krte hain 
//       fir check krte hain ki wo max se bda hai kya agar bda hai to max ko replace krdete
//       but agar koi element sum ki value ko negative krdeta hai to waha ham apna subarray stop krdete hain
//       and fir se subarray start krdete hain {refer to notes for more details}
//

class Solution {
    public int maxSubArray(int[] nums) {
        
        int max=Integer.MIN_VALUE;
        int l=nums.length;
        int sum=0;
        for(int i=0;i<l;i++)
        {
            sum=sum+nums[i];
            if(max<sum)
            {
                max=sum;
            }
            if(sum<0)
            { 
                sum=0;
            }
        }
        return max;
        
    }
}
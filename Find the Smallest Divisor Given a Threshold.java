/*Given an array of integers nums and an integer threshold, we will choose a positive integer divisor, divide all the array by it, and sum the division's result. Find the smallest divisor such that the result mentioned above is less than or equal to threshold.
Each result of the division is rounded to the nearest integer greater than or equal to that element. (For example: 7/3 = 3 and 10/2 = 5).
The test cases are generated so that there will be an answer.

Example 1:
Input: nums = [1,2,5,9], threshold = 6
Output: 5
Explanation: We can get a sum to 17 (1+2+5+9) if the divisor is 1. 
If the divisor is 4 we can get a sum of 7 (1+1+2+3) and if the divisor is 5 the sum will be 5 (1+1+1+2). 

Example 2:
Input: nums = [44,22,33,11,1], threshold = 5
Output: 44 */


/*APROACH-(BRUTE FORCE) PHLE ARRAY KA MAXIMUM NUMBER DHUNDO FIR EK LOOP CHALAO 1 SE LEKE MAX TAK AND ARRAY KE NUMBERS KO DIVIDE KRO i KI VALUE SE AND SIMULTANEOUSLY SUM CALCULATE BI KRO FIR CHECK KRO YE SUM THRESHOLD KE BRABR HAI KI NHI  
 * 
 * [PROBLEM]- TIME LIMIT EXCEEDED
 * 
 * (OPTIMIZED)- MAXIMUM CALCULATE KRO AND AND BINARY SEARCH LGAO LEFT=0 OR RIGHT= MAX ASSIGN KRO OR FIR MID VALUE KO AS A DIVIDSOR CHOOSE KRO IF USKA SUM THRESHOLD KE BARABR ATA HAI TO RIGHTKO MID-1 KRDO AND OR CHOTA DIVISOR DHUNDO ELSE LEFT KO MID+1 KRDO 
*/



class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l=nums.length;
       
        int sum=0;
        // calculate maximum element in array 
        int max=nums[0];
        for(int i=0;i<l;i++)
        {
            if(max<nums[i])
            {
                max=nums[i];
            }
        }

        int left =1;
        int right=max;
        int answer=right;
        while(left<=right)
        {
            int mid = (left+right)/2;
             sum=0;

            for(int i=0;i<l;i++)
            {
                sum=sum+(int)Math.ceil((double)nums[i]/mid);
            }

            if(sum<=threshold)
            {//now check if there is any divisor less than that of mid
                right=mid-1;
                answer=mid;
            }
            else
            {
                left=mid+1;
            }
        }
        return answer;

        
    }
}
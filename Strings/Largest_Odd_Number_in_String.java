/*You are given a string num, representing a large integer.
 Return the largest-valued odd integer (as a string) that is a non-empty substring of num, 
 or an empty string "" if no odd integer exists.
A substring is a contiguous sequence of characters within a string.

Example 1:
Input: num = "52"
Output: "5"
Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.

Example 2:
Input: num = "4206"
Output: ""
Explanation: There are no odd numbers in "4206". */

class Solution {
    public String largestOddNumber(String num) {
        int l=num.length();
        int k=0;
        int count=0;
        for(int i=l-1;i>=0;i--)
        {
            char ch=num.charAt(i);
            int n=ch-'0';
            if(n%2!=0)
            {
                k=i;
                count=1;
                break;
            }
        }
        if(count==1)
        return num.substring(0,k+1);
        else
        return "";
    }
}
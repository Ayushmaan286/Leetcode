/*Given a valid parentheses string s, return the nesting depth of s. The nesting depth is the maximum number of nested parentheses.

Example 1:
Input: s = "(1+(2*3)+((8)/4))+1"
Output: 3
Explanation:
Digit 8 is inside of 3 nested parentheses in the string.*/

/*jab ye ( milega to counter + krenge or jab ) ye milega to counter - krenga isi beech big se compare bhi krlenge for finding maximum depth */

class Solution {
    public int maxDepth(String s) {
        int l=s.length();
        int count=0;
        int big=0;
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                count++;
                if(big<count)
                 big=count;

            }
            else if(ch==')')
             count--;
        }
        return big;
        
    }
}
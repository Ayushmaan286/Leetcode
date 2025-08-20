/*Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
A shift on s consists of moving the leftmost character of s to the rightmost position.
For example, if s = "abcde", then it will be "bcdea" after one shift.

Example 1:
Input: s = "abcde", goal = "cdeab"
Output: true

Example 2:
Input: s = "abcde", goal = "abced"
Output: false*/

class Solution {
    public boolean rotateString(String s, String goal) {
        int l=s.length();
        int counter=0;
        while(l!=0)
        {
            char ch=s.charAt(0);
            s=s.substring(1)+ch;
            if(s.equals(goal))
            {
                counter=1;
                break;
            }
            l--; /* string ko agar itni baar rotate kre jitni uski length ho
              to wo wapis se orgingal string bn jaegi */
        }
        if(counter==1)
        return true;
        else
        return false;
        
    }
}
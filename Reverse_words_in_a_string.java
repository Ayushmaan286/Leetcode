/*Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words. 
The returned string should only have a single space separating the words. Do not include any extra spaces.

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"

Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces. */

class Solution {
    public String reverseWords(String s) {
        int i;
        char ch;
        String str="";
        String finals="";
        s=s+" ";
        int l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            str=str+ch;
            else
            {
                if(str!="")
                {
                    finals=str+" "+finals;
                   str="";
                    
                }  
            }
        }
        return finals.trim();
        
    }
}
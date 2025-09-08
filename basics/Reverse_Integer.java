/*Given a signed 32-bit integer x, return x with its digits reversed.
 If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], 
then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:
Input: x = 123
Output: 321

Example 2:
Input: x = -123
Output: -321

Example 3:
Input: x = 120
Output: 21 */
// APPROACH:- element ka last number nikalo or check kro overflow or underflow ki 
//              condition check kro and then reverse number bnao .
//             Integer.MAX_VALUE = 2147483647
//             Integer.MIN_VALUE = -2147483648
//
//
//

class Solution {
    public int reverse(int x) {
        int rev=0;
        while (x!=0)
        {
            int t = x%10;
            
            if ((rev > Integer.MAX_VALUE/10) || ((rev==Integer.MAX_VALUE/10) && t>7)) // over flow conditon
             return 0; 
            if((rev < Integer.MIN_VALUE/10) || ((rev==Integer.MIN_VALUE/10) && t<-8)) // under flow condition
             return 0; 


            rev = rev*10+t;
            x=x/10;
        }
        return rev;
       
    }
}
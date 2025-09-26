/*An ugly number is a positive integer which does not have a prime factor other than 2, 3, and 5.
Given an integer n, return true if n is an ugly number. */
//Example 1:

// Input: n = 6 
// Output: true
// Explanation: 6 = 2 × 3
//
// Example 2:
// Input: n = 1
// Output: true
// Explanation: 1 has no prime factors.
//
//APPROACH:- check if the number is divisible by 2,3,5. 
//
//
//
class Solution {
    public boolean isUgly(int n) {

        if (n != 0) {
            while (n % 2 == 0) {
                n = n / 2;
            }
            while (n % 3 == 0) {
                n = n / 3;
            }
            while (n % 5 == 0) {
                n = n / 5;
            }

        }

        if (n == 1)
            return true;
        else
            return false;

    }
}
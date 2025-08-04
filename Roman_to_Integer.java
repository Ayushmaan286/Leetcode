/*Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer. */

// APPROACH
// har ek string ke character ko extract kro and uske next character ko bhi  
// agar next character current character se chota ho to current ko sum me add krdo
// agar next character current character se bda ho to current ko sum me subtract krdo
//
//
//
class Solution {
    public int romanToInt(String s) {

        int sum = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int current = value(s.charAt(i));
            int next = (i + 1 < n) ? value(s.charAt(i + 1)) : 0;

            if (current < next) {
                sum = sum - current;
            } else {
                sum = sum + current;
            }

        }
        return sum;
    }

    private int value(char ch) {
        if (ch == 'I') {
            return 1;
        }
        if (ch == 'V') {
            return 5;
        }
        if (ch == 'X') {
            return 10;
        }
        if (ch == 'L') {
            return 50;
        }
        if (ch == 'C') {
            return 100;
        }
        if (ch == 'D') {
            return 500;
        }
        if (ch == 'M') {
            return 1000;
        }
        return 0;
    }
}
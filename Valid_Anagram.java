/*Given two strings s and t, return true if t is an anagram of s, and false otherwise.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false

 */
class Solution {
    public boolean isAnagram(String s, String t) {
        int l1 = s.length();
        int l2 = t.length();

        if(l1!=l2)
        return false;
        else
        {
             char arr1[] = new char[l1];
          char arr2[] = new char[l2];

         for (int i = 0; i < l1; i++)
            arr1[i] = s.charAt(i);

         for (int i = 0; i < l2; i++)
            arr2[i] = t.charAt(i);
       
       
          Arrays.sort(arr1);
          Arrays.sort(arr2);
        

        String s1 = "";
        String s2 = "";
        for (int i = 0; i < l1; i++) {
            s1 = s1 + arr1[i];
        }
        for (int i = 0; i < l2; i++) {
            s2 = s2 + arr2[i];
        }
        if (s1.equals(s2))
            return true;
        else
            return false;
        }

       

    }
}
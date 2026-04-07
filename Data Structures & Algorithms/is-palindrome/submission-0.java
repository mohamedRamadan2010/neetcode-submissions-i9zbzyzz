class Solution {
    public boolean isPalindrome(String s) { 
        int left = 0; // pointer at the start
        int right = s.length() - 1; // pointer at the end
        
        while (left < right) { // loop until pointers meet
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) { // skip non-alphanumeric from left
                left++; // move left pointer forward
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) { // skip non-alphanumeric from right
                right--; // move right pointer backward
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) { // compare ignoring case
                return false; // not a palindrome
            }
            left++; // move left pointer forward
            right--; // move right pointer backward
        }
        return true; // all characters matched
    }
}
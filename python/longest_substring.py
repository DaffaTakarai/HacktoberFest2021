# Longest Substring Without Repeating Characters
# Medium

# 17731

# 830

# Add to List

# Share
# Given a string s, find the length of the longest substring without repeating characters.

 

# Example 1:

# Input: s = "abcabcbb"
# Output: 3
# Explanation: The answer is "abc", with the length of 3.
# Example 2:

# Input: s = "bbbbb"
# Output: 1
# Explanation: The answer is "b", with the length of 1.
# Example 3:

# Input: s = "pwwkew"
# Output: 3
# Explanation: The answer is "wke", with the length of 3.
# Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
# Example 4:

# Input: s = ""
# Output: 0


# Constraints:

# 0 <= s.length <= 5 * 104
# s consists of English letters, digits, symbols and spaces.


ans:-
  
 class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if not s:
            return 0
        maxs , sub = 0,''
        for i in s:
            if i not in sub:
                sub+=i       #adding char in substring
                maxs = max(maxs , len(sub)) #getting max length of substring 
            else:
                sub=sub[sub.index(i)+1:]+i  # slicing a subtring from which char repeats and add that char at the end
        return maxs

class Solution {
  // An anagram is a word or phrase formed by rearranging the letters
  // of a different word or phrase, using all the original letters exactly once.
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) 
      return false;
    
    int[] freq = new int[26]; // lowercase only
    for (char c : s.toCharArray()) {
      freq[c-'a'] ++;
    }

    for (char c : t.toCharArray()) {
      freq[c-'a'] --;

      // new character
      if (freq[c-'a'] < 0)
        return false;
    }

    for (int i = 0; i < 26; i ++) {
      if (freq[i] > 0)
        return false;
    }

    return true;
  }
}
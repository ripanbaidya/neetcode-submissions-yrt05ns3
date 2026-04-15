class Solution {
  private boolean isAlphanumeric(char c) {
    return Character.isDigit(c) || Character.isLetter(c);
  }

  public boolean isPalindrome(String s) {
    // Initializing the left and right pointer
    int l = 0;
    int r = s.length() - 1;

    while (l < r) {

      // skip all the non-alphanumeric characters
      while (l < r && !isAlphanumeric(s.charAt(l))) {
        l++;
      }
      while (l < r && !isAlphanumeric(s.charAt(r))) {
        r--;
      }

      // make sure both characters are in lowercase
      char leftChar = Character.toLowerCase(s.charAt(l));
      char rightChar = Character.toLowerCase(s.charAt(r));

      if (leftChar != rightChar)
        return false;

      l++;
      r--;
    }

    return true;
  }
}
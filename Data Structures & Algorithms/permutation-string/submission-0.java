class Solution {
  public boolean checkInclusion(String s1, String s2) {
    if (s1.length() > s2.length())
      return false;
    
    int k = s1.length(); // window size
    int[] f1 = new int[26];
    int[] f2 = new int[26];

    for (int i = 0; i < k; i ++) { 
      f1[s1.charAt(i) - 'a'] ++;
      f2[s2.charAt(i) - 'a'] ++;
    }

    if (isSame(f1, f2))
      return true;

    int i = 0;
    for (int j = k; j < s2.length(); j ++) {
      // shrink i
      f2[s2.charAt(i) - 'a'] --;
      i ++;

      // expand j
      f2[s2.charAt(j) - 'a'] ++;

      if (isSame(f1, f2))
        return true;
    }

    return false;
  }

  private boolean isSame(int[] f1, int[] f2) {
    for (int i = 0; i < 26; i ++) {
      if (f1[i] != f2[i])
        return false;
    }

    return true;
  }
}
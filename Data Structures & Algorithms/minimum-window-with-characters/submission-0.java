class Solution {
  public String minWindow(String s, String t) {
    if (t.length() > s.length())
      return "";

    HashMap<Character, Integer> mp = new HashMap<>();
    for (char c : t.toCharArray()) {
      mp.put(c, mp.getOrDefault(c, 0) + 1);
    }

    String res = "";
    int minLen = Integer.MAX_VALUE;

    for (int i = 0; i < s.length(); i++) {
      HashMap<Character, Integer> tmp = new HashMap<>(mp);

      for (int j = i; j < s.length(); j++) {
        char cur = s.charAt(j);

        if (tmp.containsKey(cur)) {
          tmp.put(cur, tmp.get(cur) - 1);
          if (tmp.get(cur) == 0)
            tmp.remove(cur);
        }

        if (tmp.isEmpty()) {
          int len = j - i + 1;

          if (len < minLen) {
            minLen = len;
            res = s.substring(i, j + 1);
          }
          break;
        }
      }
    }

    return res;
  }
}
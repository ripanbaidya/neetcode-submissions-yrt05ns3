class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        // [Hello, World]
        // 5#Hello5#World
        for (String str : strs) {
            sb.append(str.length() + "#");
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        
        while (i < str.length()) {
            int len = 0;
            // calculate the length
            while (str.charAt(i) != '#') {
                len = len * 10 + str.charAt(i)-'0';
                i ++;
            }
            // skip #
            i ++;
            
            // add word into list
            res.add(str.substring(i, len+i));

            // move pointer to next encoded word
            i += len;
        }
        return res;
    }
}

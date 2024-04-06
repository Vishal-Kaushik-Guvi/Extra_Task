public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        String prefix = strs[0]; // Initialize prefix with the first string
        
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1); // Reduce the prefix by one character
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;
    }

    public static void main(String[] args) {
       String[] strs = {"flower","flow","flight"};
       LongestCommonPrefix pre = new LongestCommonPrefix();
       String result = pre.longestCommonPrefix(strs);
       System.out.println(result);
    }
}

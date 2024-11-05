class Solution {
    
    public String longestCommonPrefix(String[] strs) {
        
        String result = "";
        boolean isPrefix = true;

        for (int i = 0; i < strs[0].length(); i++) {

            char target = strs[0].charAt(i);

            if (i == 0) {
                for (int j = 1; j < strs.length; j++) {
                    if (strs[j].length() > 0 && strs[j].charAt(0) != target) {
                        isPrefix = false;
                        break;
                    }
                }
            }

            if (isPrefix = false) {
                result = "";
                break;
            }

            boolean readyAdd = true;

            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != target) {
                    readyAdd = false;
                    break;
                } 
            }

            if (readyAdd == true) {
                result += target;
            } else {
                break;
            }
        }

        return result;
    }

}
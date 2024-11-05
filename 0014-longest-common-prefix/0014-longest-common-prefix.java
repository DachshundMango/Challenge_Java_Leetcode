class Solution {
    
    public String longestCommonPrefix(String[] strs) {
        
        String result = strs[0];
        boolean isPrefix = true;

        for (int i = 1; i < strs.length; i++) {

            if (result.length() == 0 || strs[i].length() == 0) {
                isPrefix = false;
                break;
            }

            String currentResult = "";

            for (int j = 0; j < strs[i].length(); j++) {
        
                if (result.charAt(0) != strs[i].charAt(0)) {
                    isPrefix = false;
                    break;
                }

                if (j < result.length() && strs[i].charAt(j) == result.charAt(j)) {
                    currentResult += strs[i].charAt(j);
                } else {
                    break;
                }
     
            }

            result = currentResult;
        
        }

        if (isPrefix == false) {
            return "";
        } else {
            return result;
        }

    }

}
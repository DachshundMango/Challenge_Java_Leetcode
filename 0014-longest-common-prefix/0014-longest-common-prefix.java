class Solution {
    
    public String longestCommonPrefix(String[] strs) {
        
        String target = strs[0];
        String result = "";
        boolean isPrefix = true;

        for (int i = 1; i < strs.length; i++) {

            if (target.length() == 0 || strs[i].length() == 0) {
                isPrefix = false;
                break;
            }

            String currentResult = "";

            for (int j = 0; j < strs[i].length(); j++) {
        
                if (target.charAt(0) != strs[i].charAt(0)) {
                    isPrefix = false;
                    break;
                }

                if (j < target.length() && strs[i].charAt(j) == target.charAt(j)) {
                    currentResult += strs[i].charAt(j);
                } else {
                    break;
                }
     
            }

            target = currentResult;
        
        }

        if (isPrefix == false) {
            return "";
        } else {
            return target;
        }

    }

}
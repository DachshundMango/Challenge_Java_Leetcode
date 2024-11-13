class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
            } 
        }
        
        String onlyAlpha = sb.toString().toLowerCase();
        boolean result = true;

        if (onlyAlpha.length() <= 1) {
            return result;

        } else {

            for (int i = 0; i < onlyAlpha.length(); i++) {
                if (onlyAlpha.charAt(i) != onlyAlpha.charAt(onlyAlpha.length()- 1 - i)) {
                    result = false;
                    break;
                }    
            }
            return result;   
        }    
        
    }
}
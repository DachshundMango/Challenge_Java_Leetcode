class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        } else {
            
            String target = String.valueOf(x);

            for (int i = 0; i < target.length(); i++) {
                if (target.charAt(i) != target.charAt(target.length() - 1 -i)) {
                    return false;
                }
            }

            return true;

        }

        
    }
}
class Solution {
    public String reverseWords(String s) {

        String result = "";

        String word = "";

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != ' ') {
                word += s.charAt(i);
                if (i == s.length() - 1) {
                    result = " " + word + result;
                    break;
                }
                continue;
            } else if (i >= 1 && s.charAt(i - 1) != ' '){
                result = " " + word + result;
                word = "";
                continue;
            }
        }

        return result.strip();

        
        
    }
}
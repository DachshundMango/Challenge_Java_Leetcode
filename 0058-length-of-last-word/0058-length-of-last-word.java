class Solution {
    public int lengthOfLastWord(String s) {

        int stringLength = s.length();

        int startIndex = 0;
        int finalIndex = 0;

        boolean isSpace = true;

        for (int i = 0; i < stringLength; i++) {


            if ((isSpace == false) && (s.charAt(i) ==  ' ')) {
                isSpace = true;
                continue;
            }

            if ((isSpace == true) && (s.charAt(i) !=  ' ')) {
                isSpace = false;
                startIndex = i - 1;
                finalIndex = startIndex + 1;
                continue;
            }

            if ((isSpace == false) && (s.charAt(i) !=  ' ')) {
                finalIndex++; 
            }
  
        }

       

        int result = finalIndex - startIndex;

        return result;
    }
}
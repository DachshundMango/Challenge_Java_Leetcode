class Solution {
    public int lengthOfLastWord(String s) {

        int stringLength = s.length();

        int startIndex = stringLength - 1;
        int finalIndex = stringLength - 1;

        boolean countStart = false;

        for (int i = (stringLength - 1); 0 <= i; i--) {


            if ((countStart == false) && (s.charAt(i) ==  ' ')) {
                startIndex--;
                finalIndex--;
                continue;
            }

            if ((countStart == false) && (s.charAt(i) !=  ' ')) {
                countStart = true;
                startIndex--;
                continue;
            }

            if ((countStart == true) && (s.charAt(i) !=  ' ')) {
                startIndex--;
                continue; 
            }

            if ((countStart == true) && (s.charAt(i) ==  ' ')) {
                break;
            }

  
        }

        int result = finalIndex - startIndex;

        return result;
    }
}
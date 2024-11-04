class Solution {
    public int lengthOfLastWord(String s) {

        int stringLength = s.length();

        int startIndex = stringLength - 1;
        int finalIndex = stringLength - 1;

        int result = 0;

        boolean countStart = false;

        for (int i = (stringLength - 1); 0 <= i; i--) {


            if ((countStart == false) && (s.charAt(i) ==  ' ')) {
                continue;
            }

            if ((countStart == false) && (s.charAt(i) !=  ' ')) {
                countStart = true;
                result = i + 1;
                continue;
            }

            if ((countStart == true) && (s.charAt(i) !=  ' ')) {
                continue; 
            }

            if ((countStart == true) && (s.charAt(i) ==  ' ')) {
                result -= (i + 1);
                break;
            }

  
        }

        return result;
    }
}
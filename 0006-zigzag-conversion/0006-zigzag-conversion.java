class Solution {
    public String convert(String s, int numRows) {


        if (numRows == 1) {
            return s;
        }
        
        
        String result = "";

        for (int i = 0; i < numRows; i++) {

            String subString = "";
            int subIndex = i;

            if (subIndex != 0 && subIndex != (numRows - 1)) {

                int routine1 = (numRows - 1) * 2 - (subIndex * 2);
                int routine2 = (subIndex * 2);

                while (subIndex < s.length()) {
                    subString += s.charAt(subIndex);
                    subIndex += routine1;
                    if(subIndex >= s.length()) {
                        break;
                    }
                    subString += s.charAt(subIndex);
                    subIndex += routine2;

                }
            } else {

                int routine1 = (numRows - 1) * 2;

                while (subIndex < s.length()) {
                    subString += s.charAt(subIndex);
                    subIndex += routine1;
                }

            }

            result += subString; 

        }

        return result;
        
    }
}
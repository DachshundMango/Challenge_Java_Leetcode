class Solution {
    public int romanToInt(String s) {


        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            
            if (s.charAt(i) == 'M') {
                if ((i >= 1) && s.charAt(i-1) == 'C') {
                    result += 800;
                    continue;
                }
                result += 1000;
                continue;

            } else if (s.charAt(i) == 'D') {
                if ((i >= 1) && s.charAt(i-1) == 'C') {
                    result += 300;
                    continue;
                }
                result += 500;
                continue;

            } else if (s.charAt(i) == 'C') {
                if ((i >= 1) && s.charAt(i-1) == 'X') {
                    result += 80;
                    continue;
                }
                result += 100;
                continue;

            } else if (s.charAt(i) == 'L') {
                if ((i >= 1) && s.charAt(i-1) == 'X') {
                    result += 30;
                    continue;
                }
                result += 50;
                continue;

            } else if (s.charAt(i) == 'X') {
                if ((i >= 1) && s.charAt(i-1) == 'I') {
                    result += 8;
                    continue;
                }
                result += 10;
                continue;

            } else if (s.charAt(i) == 'V') {
                if ((i >= 1) && s.charAt(i-1) == 'I') {
                    result += 3;
                    continue;
                }
                result += 5;
                continue;

            } else {
                result++;
                continue;
            }
        }
        
        return result;
    }
}
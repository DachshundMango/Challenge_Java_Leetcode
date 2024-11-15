class Solution {
    public boolean isValid(String s) {

        char[] stack = new char[s.length()];

        int stackIndex = 0;

        boolean result = true;

        for (int i = 0; i < s.length(); i++) {

            stack[stackIndex] = s.charAt(i);

            if ((s.charAt(i) == ')') || (s.charAt(i) == ']') || (s.charAt(i) == '}')) {
                
                if (1 <= stackIndex) {
                    
                    String brackets = String.valueOf(stack[stackIndex - 1]) + stack[stackIndex];

                    if ((brackets.equals("()")) || (brackets.equals("[]")) || (brackets.equals("{}"))) {
                        stack[stackIndex] = '\u0000';
                        stack[stackIndex - 1] = '\u0000';
                        stackIndex = stackIndex - 1;

                    } else {
                        result = false;
                        break;
                    }

                } else {
                    result = false;
                    break;
                }

            } else {

                stackIndex++;
                continue;
            }

        }

        if (stackIndex == 0) {
            return result;
        } else {
            result = false;
            return result;
        }

    }
}
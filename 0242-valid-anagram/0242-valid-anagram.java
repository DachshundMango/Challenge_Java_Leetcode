import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {

       if (t.length() != s.length()) {
            return false;
        }
        int commonLength = s.length();
        Map<Character, Integer> checkMap = new HashMap<>();

        for (int i = 0; i < commonLength; i++) {
            if (checkMap.containsKey(s.charAt(i))) {
                checkMap.put(s.charAt(i), checkMap.get(s.charAt(i)) + 1);
            } else {
                checkMap.put(s.charAt(i), 1);
            }
            if (checkMap.containsKey(t.charAt(i))) {
                checkMap.put(t.charAt(i), checkMap.get(t.charAt(i)) - 1);
            } else {
                checkMap.put(t.charAt(i), -1);
            }
            
            
        }
        
        boolean result = true;
        
        for (Integer value : checkMap.values()) {
            if (value != 0) {
                result = false;
                break;
            }
        }
        return result;

        
    }
}
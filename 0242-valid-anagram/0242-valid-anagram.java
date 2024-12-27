import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {

        if (t.length() != s.length()) {
            return false;
        }

        int commonLength = s.length();
        
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < commonLength; i++) {
            if (sMap.containsKey(s.charAt(i))) {
                sMap.put(s.charAt(i), sMap.get(s.charAt(i)) + 1);    
            } else {
                sMap.put(s.charAt(i), 1);
            }
            if (tMap.containsKey(t.charAt(i))) {
                tMap.put(t.charAt(i), tMap.get(t.charAt(i)) + 1);
            } else {
                tMap.put(t.charAt(i), 1);
            }
        }

        if (!sMap.keySet().equals(tMap.keySet())) {
            return false;
        }

        boolean result = true;
            
        for (Character key : sMap.keySet()) {
            if (!sMap.get(key).equals(tMap.get(key))) {
                result = false;
                break;
            }
        }

        return result;

        
    }
}
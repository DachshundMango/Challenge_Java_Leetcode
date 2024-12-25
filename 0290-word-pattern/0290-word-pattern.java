import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean wordPattern(String pattern, String s) {

        boolean result = true;

        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }


        Map<Character, String> patternMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            if (patternMap.containsKey(pattern.charAt(i))) {
                if (!patternMap.get(pattern.charAt(i)).equals(words[i])) {
                    result = false;
                    break;
                }
            }
            if (patternMap.containsValue(words[i])) {
                for (Map.Entry<Character, String> entry : patternMap.entrySet()) {
                    if (entry.getValue().equals(words[i]) && !entry.getKey().equals(pattern.charAt(i))) {
                        result = false;
                        break;
                    }
                }
            }
            patternMap.put(pattern.charAt(i), words[i]);
        }

        return result;                                                       
        
    }
}
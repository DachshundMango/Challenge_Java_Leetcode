class Solution {
    public boolean isIsomorphic(String s, String t) {

        boolean result = true;
        
        String[] sArray = s.split("");
        String[] tArray = t.split("");

        Map<String, String> isomorphicMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (isomorphicMap.containsKey(sArray[i])) {
                if (!isomorphicMap.get(sArray[i]).equals(tArray[i])) {
                    result = false;
                    break;
                }
            } else if (isomorphicMap.containsValue(tArray[i])) {
                result = false;
                break;
            }
            isomorphicMap.put(sArray[i], tArray[i]);
        }
        
        return result;

        
    }
}
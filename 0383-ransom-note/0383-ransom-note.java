class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        boolean result = true;
        StringBuilder sbMagazine = new StringBuilder(magazine);
        String[] ransomArray = ransomNote.split("");

        for (String string : ransomArray) {
            String sbCheck = sbMagazine.toString();
            if (!sbCheck.contains(string)) {
                result = false;
                break;
            }
            sbMagazine.deleteCharAt(sbMagazine.indexOf(string));
        }

        return result;

    }
}
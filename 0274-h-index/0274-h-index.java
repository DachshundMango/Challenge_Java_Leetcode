class Solution {
    public int hIndex(int[] citations) {
        
        int[] order = new int[citations.length];
        int result = 0;

        for (int i = 0; i < order.length; i++) {
            int citNumber = 0;
            int citIndex = 0;
            for (int j = 0; j < citations.length; j++) {
                if (citations[j] > citNumber) {
                    citNumber = citations[j];
                    citIndex = j;
                }
            }
            order[i] = citNumber;
            citations[citIndex] = -1;

            if ((i + 1) > order[i]) {
                result = i;
                break;
            }
            result = i + 1;

        }

        return result;

    }
}
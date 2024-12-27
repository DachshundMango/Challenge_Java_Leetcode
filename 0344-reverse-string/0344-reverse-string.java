class Solution {
    public void reverseString(char[] s) {

        for (int i = 0; i < s.length / 2; i++) {
            char front = s[i];
            char rear = s[s.length - 1 - i];
            s[i] = rear;
            s[s.length - 1 - i] = front;
        }
        
    }
}
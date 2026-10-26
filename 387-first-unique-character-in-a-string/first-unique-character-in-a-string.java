class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            freq[c-97]++;
        }

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(freq[c-97]==1)
                return i;
        }

        return -1;
    }
}
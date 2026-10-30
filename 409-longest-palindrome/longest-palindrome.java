class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==1)
            return 1;
        
        int[] freq = new int[128];
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            freq[c]++;
        }

        int count=0;
        boolean odd=false;
        for(int i=0; i<freq.length; i++){
            if(freq[i]%2==0)
                count+=freq[i];
            else{
                count+=freq[i]-1;
                odd=true;
            }
        }

        if(odd) count++;

        return count;
    }
}
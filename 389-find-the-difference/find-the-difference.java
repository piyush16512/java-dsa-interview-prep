class Solution {
    public char findTheDifference(String s, String t) {
        int[] freq = new int[26];

        //for s array
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-97]+=1;
        }

        //for t array
        for(int i=0; i<t.length(); i++){
            freq[t.charAt(i)-97]-=1;
        }

        for(int i=0; i<26; i++){
            if(freq[i]!=0)
                return (char)(97+i);
        }
        return 'a';
    }
}
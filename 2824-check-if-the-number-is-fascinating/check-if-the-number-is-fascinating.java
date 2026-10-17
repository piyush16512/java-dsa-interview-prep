class Solution {
    public boolean isFascinating(int n) {
        String num = n + "" + 2*n + 3*n;
        int[] freq = new int[10];
        for(int i=0; i<num.length(); i++){
            char c = num.charAt(i);
            freq[c - 48]++;
        }
            //79815962394
        if(freq[0]!=0) return false;
        for(int i=1; i<10; i++){
            if(freq[i]!=1)
                return false;
        }

        return true;
    }
}
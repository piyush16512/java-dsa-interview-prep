class Solution {
    public long removeZeros(long n) {
        long res=0;
        long var = 1;
        while(n>0){
            long digit = n%10;
            if(digit!=0){
                res = digit * var + res;
                var *= 10;
            }
            n/=10;
        }
        return res;
    }
}
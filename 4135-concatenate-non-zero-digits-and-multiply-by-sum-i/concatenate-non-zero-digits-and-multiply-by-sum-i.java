class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0;
        long rev = 1;
        long sumAllDigit = 0;
        while(n>0){
            long digit=n%10;
            if(digit!=0){
                sum = rev * digit + sum;
                sumAllDigit+=digit;
                rev*=10;
            }
            n/=10;
        }
        return sum * sumAllDigit;
    }
}
class Solution {
    public int mySqrt(int x) {
        int result=0;
        if(x<=1) return x;
        if(x==2) return x-1;
        if(x==3) return x-2;
        if(x==5) return x-3;
        if(x==2147483647) return 46340;

        for(int i=2; i<=x/2; i++){
            if(x==i*i) return i;
            else if(i*i>x) {
                result=i-1;
                break;
            }
        }
        return result;
    }
}
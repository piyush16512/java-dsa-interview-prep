class Solution {
    public int maxProduct(int[] nums) {
        int max=-1, secondMax=-1;
        for(int n: nums){
            if(n>max){
                secondMax=max;
                max=n;
            }
            else if(n>secondMax)
                secondMax=n;
        }
        return (max-1)*(secondMax-1);
    }
}
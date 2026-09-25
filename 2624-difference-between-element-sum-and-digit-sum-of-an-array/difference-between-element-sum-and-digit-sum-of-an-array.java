class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0, digitSum=0;
        for(int n: nums){
            sum+=n;
            while(n>0){
                digitSum+=n%10;
                n/=10;
            }
        }
        int result = sum - digitSum;
        if(result<0) result=-result;
        return result;
    }
}
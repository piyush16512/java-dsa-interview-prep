class Solution {
    public int thirdMax(int[] nums) {
        long max=Long.MIN_VALUE, sMax=Long.MIN_VALUE, tMax=Long.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==max || nums[i]==sMax || nums[i]==tMax) continue;
            if(nums[i]>max){
                tMax=sMax;
                sMax=max;
                max = nums[i];
            }
            else if(nums[i]>sMax){
                tMax = sMax;
                sMax = nums[i];
            }
            else if(nums[i]>tMax){
                tMax = nums[i];
            }
        }
        if(tMax == Long.MIN_VALUE) return (int)max;
        else return (int)tMax;
    }
}
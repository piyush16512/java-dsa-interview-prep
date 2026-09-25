class Solution {
    public boolean isMonotonic(int[] nums) {
        int count=0; int sount = 0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] < nums[i+1]){
                count++;
            }
            else if(nums[i] > nums[i+1]){
                sount++;
            }
            else if(nums[i]==nums[i+1]) {
                count++; 
                sount++;
            }
        }
        if(count == nums.length-1 || sount == nums.length-1) return true;
        else return false;
    }
}
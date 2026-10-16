class Solution {
    public int singleNumber(int[] nums) {
        int min=nums[0], max=nums[0];
        for(int n: nums){
            if(n>max)
                max=n;
            else if(n<min)
                min=n;
        }

        int[] freq = new int[max-min+1];

        for(int i=0; i<nums.length; i++){
            freq[nums[i]-min]++;
        }

        for(int i=0; i<freq.length; i++){
            if(freq[i]==1)
                return i+min;
        }

        return -1;
    }
}
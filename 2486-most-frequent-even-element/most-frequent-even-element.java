class Solution {
    public int mostFrequentEven(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        for(int n: nums){
            if(n>max)
                max=n;
            else if(n<min)
                min=n;
        }

        int[] freq = new int[max-min+1];
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                freq[nums[i]-min]++;
            }
        }
        int count=0;
        int j=0;
        for(int i=0; i<freq.length; i++){
            if(freq[i]>count){
                count=freq[i];
                j=i;
            }
        }

        if(count>0)
            return j+min;
        else
            return -1;
    }
}
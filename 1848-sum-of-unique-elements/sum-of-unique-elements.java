class Solution {
    public int sumOfUnique(int[] nums) {
        int min=nums[0], max=nums[0];
        for(int n: nums){
            if(n>max)
                max=n;
            else if(n<min)
                min=n;
        }

        int[] freq = new int[max-min+1];

        for(int n: nums){
            freq[n-min]++;
        }

        int sum=0;
        
        for(int i=0; i<freq.length; i++){
            if(freq[i]==1)
                sum+=(i+min);
        }

        return sum;
    }
}
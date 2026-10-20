class Solution {
    public int maxProduct(int[] nums) {
        int product=nums[0];
        int max=nums[0];
        int min=nums[0];

        for(int i=1; i<nums.length; i++){
            int temp=max;
            max=Math.max(nums[i], Math.max(nums[i]*temp, nums[i]*min));
            min=Math.min(nums[i], Math.min(nums[i]*temp, nums[i]*min));

            if(max>product)
                product=max;
        }
        return product;
    }
}
class Solution {
    public int[] sortedSquares(int[] nums) {
        //1st step to replace each element to their respective squares
        //2nd step is to sort them
        for(int i=0; i<nums.length; i++){
            nums[i]= nums[i]*nums[i];
        }

        for(int i=0; i<nums.length-1; i++){
            boolean isSorted=true;
            for(int j=0; j<nums.length-1-i; j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    isSorted=false;
                }
            }
            if(isSorted)
                break;
        }
        return nums;
    }
}
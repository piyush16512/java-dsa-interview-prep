class Solution {
    public int trap(int[] height) {
        int maxWater=0;
        int start=0, end=height.length-1, maxLeft=height[start], maxRight=height[end];
        while(start<end){
            if(height[start]<height[end]){
                if(height[start]<maxLeft)
                    maxWater+=(maxLeft-height[start]);
                else
                    maxLeft=height[start];
                start++;
            }
            else{
                if(height[end]<maxRight)
                    maxWater+=(maxRight-height[end]);
                else
                    maxRight=height[end];
                end--;
            }
        }
        return maxWater;
    }
}
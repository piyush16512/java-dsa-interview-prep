class Solution {
    public int maxArea(int[] height) {
        int start=0, end=height.length-1, maxArea=0;
        while(start<end){
            int area;
            int size=end-start;

            if(height[start]<height[end]){
                area = height[start] * size;
                start++;
            }

            else{
                area = height[end] * size;
                end--;
            }

            if(area>maxArea)
                maxArea=area;
        }
        return maxArea;
    }
}
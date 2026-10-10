class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        int n=nums.length;
        for(int x: nums){
            int value=m.getOrDefault(x, 0)+1;
            if(value>n/2)
                return x;
            m.put(x, value);
        }
        return -1;
    }
}
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int min=arr[0];
        int max=arr[0];
        for(int n: arr){
            if(n>max)
                max=n;
            else if(n<min)
                min=n;
        }

        int[] freq = new int[max-min+1];

        for(int n: arr){
            freq[n-min]++;
        }

        HashSet<Integer> set = new HashSet<>();
        for(int n: freq){
            if(n!=0){
                if(set.contains(n))
                return false;
            
            set.add(n);
            }
        }

        return true;
    }
}
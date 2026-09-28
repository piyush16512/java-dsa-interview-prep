class Solution {
    public void reverseString(char[] s) {
        int start=0;
        int end=s.length-1;
        while(start<end){
            swap(s, start, end);
            start++;
            end--;
        }
    }

    public static void swap(char[] a, int start, int end){
        char temp = a[start];
        a[start] = a[end];
        a[end] = temp;
    }
}
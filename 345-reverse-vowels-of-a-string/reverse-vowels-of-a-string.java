class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int start=0;
        int end=arr.length-1;
        while(start<end){
            if(isVowel(arr[start]) && isVowel(arr[end])){
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            else if(isVowel(arr[start])){
                end--;
            }
            else{
                start++;
            }
        }
        return new String(arr);
    }
    public boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
               ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U';
    }
}
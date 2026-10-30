class Solution {
    public String reverseOnlyLetters(String s) {
        char[] c = s.toCharArray();
        int start=0;
        int end=c.length-1;
        while(start<end){
            if((c[start]>=65 && c[start]<=90 || c[start]>=97 && c[start]<=122) && 
               (c[end]>=65 && c[end]<=90 || c[end]>=97 && c[end]<=122))
                reverse(c, start++, end--);
            else if(c[start]>=65 && c[start]<=90 || c[start]>=97 && c[start]<=122)
                end--;
            else
                start++;
        }

        return new String(c);
    }

    public void reverse(char[] c, int start, int end){
        char temp = c[start];
        c[start] = c[end];
        c[end] = temp;
    }
}
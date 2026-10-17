class Solution {
    public boolean isPalindrome(String s) {
        String original="";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if((c>='a' && c<='z')||(c>='A' && c<= 'Z')||(c>='0' && c<='9')){
                original+=c;
            }
        }

        String reverse = "";
        for(int i=0; i<original.length(); i++){
            reverse = original.charAt(i) + reverse;
        }

        return original.equalsIgnoreCase(reverse);
    }
}
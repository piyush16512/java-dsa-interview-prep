class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='(' || c=='{' || c=='[')
                stack.push(c);
            else{
                if(stack.size()==0)
                    return false;
                char op=stack.pop();
                if(c==')' && op!='(' || c=='}' && op!='{' || c==']' && op!='[')
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
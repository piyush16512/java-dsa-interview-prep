class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1 = getResult(s);
        String s2 = getResult(t);
        return s1.equals(s2);
    }

    public String getResult(String str){
        //we can use Stack also but 
        //here we have used StringBuilder
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c!='#')
                sb.append(c);
            else{
                if(sb.length()>0)
                    sb.deleteCharAt(sb.length()-1);
            }
        }
        return sb.toString();
    }
}
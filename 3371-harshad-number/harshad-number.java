class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int num=x; int sum=0;
        while(x>0){
            int digit=x%10;
            sum+=digit;
            x/=10;
        }

        return num%sum==0?sum:-1;
    }
}
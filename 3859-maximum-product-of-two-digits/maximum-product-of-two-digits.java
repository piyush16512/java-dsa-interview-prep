class Solution {
    public int maxProduct(int n) {
        int num1 = n;
        int num2;
        int maxProduct=Integer.MIN_VALUE;
        while(num1 > 0) {
            int lastDigit = num1%10;
            num1/=10;
            num2 = num1;
            while(num2>0){
                int secondDigit = num2%10;
                int product = lastDigit*secondDigit;
                maxProduct = Math.max(maxProduct, product);
                num2/=10;
            }
        }
        return maxProduct;
    }
}
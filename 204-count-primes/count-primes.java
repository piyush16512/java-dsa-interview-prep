class Solution {
    public int countPrimes(int n) {
        int count = 0;
        
        for(int i=1; i<n; i++){
            if(isPrime(i))
                count+=1;
        }

        return count;
    }

    public boolean isPrime(int num){
        if(num<2)
            return false;
        
        else if(num==2 || num==3)
            return true;

        else if(num%2==0)
            return false;
        
        for(int i=3; i*i<=num; i+=2){
            if(num%i==0)
                return false;
        }

        return true;
    }
}
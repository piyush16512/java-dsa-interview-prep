class Solution {
    public int maximum69Number (int num) {
        if(num>1 && num<10){
            if(num==6)
                num=9;
        }

        else if(num>10 && num<100){
            if(num/10==6) num+=30;
            else if(num%10==6) num+=3;
        }

        else if(num>100 && num<1000){
            if(num/100==6) num+=300;
            else if(num/10%10==6) num+=30;
            else if(num%10==6) num+=3;
        }

        else if(num>1000 && num<10000){
            if(num/1000==6) num+=3000;
            else if(num/100%10==6) num+=300;
            else if(num/10%10==6) num+=30;
            else if(num%10==6) num+=3;
        }

        return num;
    }
}
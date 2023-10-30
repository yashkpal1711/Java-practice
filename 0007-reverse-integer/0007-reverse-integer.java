class Solution {
    public int reverse(int x) {
        int ans =0;
        
        int flag =0;
      if(x<0) {flag=1;
              x *=-1;}
        int temp = x;
        int pow=0;
        while(temp>0){
            pow++;
            temp/=10;
            
            }
        temp=x;
        while(temp>0){
            int a = temp%10;
            if(a==0){ 
                temp/=10;
                pow--;
                continue;}
            else{
                ans += a* Math.pow(10,pow-1);
                pow--;
            }
            temp/=10;
        }
        if(ans<2147483647 && ans > (-2147483648)){
        
        if(flag==1) return ans*-1;
        return ans;}
        else return 0;
            
        
     
    }
}
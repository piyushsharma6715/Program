public class PrimeOptimised{
  int getPrime(int val){
        int count =1,i,j;
        if(count ==1)
            return 2;
        for(i=3;count!=val;i+=2){
            int flag = 0;
            for(j=3;j<=Math.sqrt(i);j+=2){
                if(i%j==0){
                    flag =1;
                    break;
                }
            }
            if(flag == 0){
                count++;
                if(count == val){
                    return i;
                }
            }
        }
        
       public static void main(String []args){
            int n = getPrime(9);    // n will get 9th prime number
       }
   }

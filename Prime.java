isPrime or not chedcking
--------------------------------------
class Prime {
    static boolean isPrime(int n) {
       for(int i=2;i*i<=n;i++)
       {
           if(n%i==0)
           {
               return false;
           }
       }
        return true;
    }
}

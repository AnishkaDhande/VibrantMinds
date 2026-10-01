class Prime
{
  boolean checkPrime(int n)
   {
     boolean p=false;
     if(n==1 || n==0)
       p=true;
     else
       {
          for(int i=2;i<=n/2;i++)
            {
              if(n%i==0)
                 p=true;
                 break;
            }
       }
     return !p;
   }
}
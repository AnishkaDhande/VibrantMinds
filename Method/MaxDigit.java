class MaxDigit
{
  int maxDigit(int n)
    {
      int max=0;//79318
      while(n!=0)
       {
          int rem=n%10;//8
         if(rem>max)
           {
           max=rem; 
           }
          n=n/10;
       }
     return max;
    }
}
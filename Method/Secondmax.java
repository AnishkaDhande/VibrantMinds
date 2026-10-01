class Secondmax
{
 int secondMax(int n)
  {
    int max=0,smax=0;
    while(n!=0)//8237
     {
       int rem=n%10;//
        if(rem>max)
          {
            smax=max;
            max=rem;
          }
        else
         {
           if(rem>smax && rem !=max)
              smax=rem;
         }
        n=n/10;     
     }   
   return smax;
   }
}

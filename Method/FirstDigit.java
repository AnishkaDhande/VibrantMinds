class FirstDigit
{
  int firstDigit(int n)
    {
     while(n>9)
       n=n/10;
     return n;
    }
}
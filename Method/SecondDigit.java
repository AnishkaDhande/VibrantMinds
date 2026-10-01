class SecondDigit
{
  int secondDigit(int n)
  {
     while(n>99)//6324
      {
        n=n/10;
      }
       int sec=n%10;
     return sec;
  }
}
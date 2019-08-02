#include<stdio.h>
int main()
{
  //Type your code here
  int n,i,fib,t1=0,t2=1;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    fib=fib+t1;
    t1=t2;
    t2=fib;
    printf("%d " ,fib);
  }
  
  return 0;
}
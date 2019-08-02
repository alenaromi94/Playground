#include <stdio.h>
 
void main()
{
  long temp,sum=0,num,digit;
  scanf("%ld",&num);
  temp=num;
  while(num>0)
  {
    digit=num%10;
    sum =sum+digit;
    num /=10;
  }
    printf("  %ld\n", sum);
  
}
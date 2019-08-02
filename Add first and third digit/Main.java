#include<stdio.h>
int main()
{
  int num,sum,a,b;
  scanf("%d",&num);
  a= (num%10);
  b=(num/100);
  sum = a+b;
  printf("%d",sum);
  //Type your code here
  return 0;
}
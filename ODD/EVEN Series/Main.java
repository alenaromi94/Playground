#include<stdio.h>
#include<math.h>
int main()
{
int input;
scanf("%d", &input);
if(input % 2 == 0)
{
int number, output;
number = (input/2);
int x = (number - 1);
output = x ;
printf("%d ",output);
}
else
{
int number, output;
number = (input + 1)/2 ;
int x = (number - 1) ;
output = 2 * x ;
printf("%d", output) ;
}
return 0;
}
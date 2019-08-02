#include<stdio.h>
#include<math.h>
int main()
{
float r,ang,l;
scanf("%f %f",&r,&ang);
l= (ang/360)*2*3.14*r;
printf("%.2f",l);
 return 0;
}
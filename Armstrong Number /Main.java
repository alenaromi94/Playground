#include <stdio.h>
int main() {
	int num,orgn,rem,res=0,n=0;
  scanf("%d",&num);
  orgn=num;
  while(orgn !=0)
  {
   orgn= orgn/10;
    ++n;
  }
  orgn=num;
   while(orgn!=0)
   {
     rem=orgn%10;
     res=pow(rem,n)+res;
     orgn/=10;
   }
  if(res==num)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
  
  
    
	return 0;
}
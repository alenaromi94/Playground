#include <stdio.h>
int main() {
	int i,j=0,n;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    if(i%2!=0)
    printf("%d\n",i);
  }
	return 0;
}
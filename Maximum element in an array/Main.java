#include<stdio.h>
int main()
{
  int n,max,i;
  scanf("%d",&n);
  int arr[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  max = arr[0];
  for(i=1;i<n;i++)
  {
    if(arr[i]>max)
    {
      max = arr[i];
    }
  }
      printf("%d",max);
    
  
  	//type your code here
}
#include<stdio.h>
int main()
{
  char c;
  int lowerCase,upperCase;
  scanf("%c",&c);
  lowerCase = (c=='a'|| c == 'e'|| c == 'i' || c == 'o' || c == 'u'); 
  upperCase= ( c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
  if(lowerCase || upperCase)
    printf("Vowel");
  else
    printf("Consonant");
  //type your code here
  return 0;
}
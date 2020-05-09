#include <iostream>
#include<string.h>
int main()
{
  char str[100];
  int i,j;
  std::cin.getline(str,100);
  j=strlen(str);
  for(i=j-1;i>=0;i--){
    std::cout<<str[i];
  }


}

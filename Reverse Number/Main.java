#include <iostream>
int main() 
{
  int n,r,rev;
  std::cin>>n;
  rev=0;
  while(n!=0)
  {
    r=n%10;
    rev=rev*10+r;
    n=n/10;
    }
  std::cout<<rev;
  return 0;
}
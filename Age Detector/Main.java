#include<iostream>
using namespace std;
int main()
{
  int bir,curr,a;
  std::cin>>bir;
  std::cin>>curr;
  if(curr<bir)
  {
    bir=100-bir;
    a=bir+curr;
    std::cout<<a;
}
  else
  {
    a=curr-bir;
    std::cout<<a;
  }
}
#include<iostream>
using namespace std;
int main()
{
  int r,a,dia;
  std::cin>>r;
  std::cin>>a;
  dia=2*r;
  if(dia==a)
    std::cout<<"circle can be inside a square";
  else
    std::cout<<"circle cannot be inside a square";
  
}
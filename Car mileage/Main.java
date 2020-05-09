#include<iostream>
using namespace std;
int main()
{
  float mil;
  int p,d;
  std::cin>>mil;
  std::cin>>p;
  std::cin>>d;
  if(mil*p>=d)
    std::cout<<"Can reach";
  else
    std::cout<<"Cannot reach";
}
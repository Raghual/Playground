#include<iostream>
using namespace std;
int main()
{
  int x,y,z,u;
  std::cin>>x;
  y=x%10;
  z=x/1000;
  u=y+z;
  std::cout<<u;
}
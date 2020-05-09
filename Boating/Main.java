#include<iostream>
using namespace std;
int main()
{
  int x,y,z,a,b,c;
  std::cin>>x;
  std::cin>>y;
  std::cin>>z;
  a=y*75;
  b=z*30;
  c=a+b;
  if(x>=c)
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
}
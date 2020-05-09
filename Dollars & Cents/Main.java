#include<iostream>
using namespace std;
int main()
{
  int d1,c1,d2,c2,x,y,d,e,td,tc;
  std::cin>>d1;
  std::cin>>c1;
  std::cin>>d2;
  std::cin>>c2;
  x=d1+d2;
  y=c1+c2;
  d=y%100;
  e=y/100;
  td=x+e;
  tc=d;
  std::cout<<td<<"\n";
  std::cout<<tc;
  
  
}
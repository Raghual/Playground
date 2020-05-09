#include<iostream>
using namespace std;
int main()
{
  int p,r,n;
  float si,a,dis,finl;
  std::cin>>p;
  std::cin>>r;
  std::cin>>n;
  si=(p*n*r)/100;
  a=p+si;
  dis=(si*2)/100;
  finl=a-dis;
  std::cout<<si<<"\n";
  std::cout<<a<<"\n";
  std::cout<<dis<<"\n";
  std::cout<<finl<<"\n";
  
  
}
#include<iostream>
using namespace std;
int main()
{
  int r,c,n,a,b;
  std::cin>>r;
  std::cin>>c;
  std::cin>>n;
  a=c-1;
  b=c-2;
  if((n>r && n<=2*c) || (n>=r*b && n<=c*a))
     std::cout<<"It is a mango tree";
  else
     std::cout<<"It is not a mango tree";
  
}
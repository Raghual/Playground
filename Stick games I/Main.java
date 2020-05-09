#include<iostream>
using namespace std;
int main()
{
  int n,m,s;
  std::cin>>n;
  std::cin>>m;
  if(n<m)
    s=n;
  else
    s=m;
  if(s%2==0)
    std::cout<<"Mani Iyer";
  else
    std::cout<<"Arun Gupta";
}
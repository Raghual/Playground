#include<iostream>
using namespace std;
int main()
{
  int w,x,y,p,tp,sp,cp;
  std::cin>>w;//Type your code here.
  std::cin>>x;
  std::cin>>y;
  sp=w*x;
  cp=w*y;
  p=sp-cp;
  tp=p-100;
  std::cout<<tp;
}
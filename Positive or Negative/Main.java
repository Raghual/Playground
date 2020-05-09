#include<iostream>
int main()
{
  int x,a;
  std::cin>>x;
  a=abs(x);
  if(a==x)
    std::cout<<x<<" "<<"is a positive number.";
  else
    std::cout<<x<<" "<<"is a negative number.";
}
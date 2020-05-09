#include<iostream>
#include<math.h>
using namespace std;
int fun(int);
int main()
{
  int a;
  std::cout<<"Enter the value of a"<<"\n";
  std::cin>>a;
  int x,s,i;
  std::cout<<"Enter the value of n"<<"\n";
  std::cin>>x;
  for(i=1;i<=x;i++){
    s=pow(a,i);}
  std::cout<<"The value of"<<" "<<a<<" "<<"power"<<" "<<x<<" "<<"is"<<" "<<s;}
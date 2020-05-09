#include<iostream>
#include<math.h>
int main()
{
  int m,a;
  int n;
  int req;
  std::cin>>m;
  std::cin>>n;
  std::cin>>req;
  a=pow(m,n);
  if(a>=req){
    std::cout<<"Doctor, you can proceed with your experiment.";}
  else
    std::cout<<"Sorry Doctor! You need more bacteria.";
}
  
  
#include<iostream>
using namespace std;
int main()
{
  int n;
  std::cin>>n;
  int i,a;
  for(i=0;i<n;i++){
    a=(11+(i*4))*(11+(i*4));
    std::cout<<a<<" ";
}
}
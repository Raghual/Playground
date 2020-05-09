#include<iostream>
using namespace std;
int main()
{
  int n,sum,i;
  std::cin>>n;
  sum=0;
  for(i=0;i<n;i++){
    sum=sum+i;
}
  std::cout<<sum;
}
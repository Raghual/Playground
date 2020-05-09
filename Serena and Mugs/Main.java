#include<iostream>
using namespace std;
int main()
{
  int n,s,i,sum=0;
  int a;
  std::cin>>n;
  std::cin>>s;
  for(i=0;i<n;i++){
    std::cin>>a;
    sum=sum+a;}
    
  if(sum<=s)
    std::cout<<"YES";
  else
    std::cout<<"NO";
}
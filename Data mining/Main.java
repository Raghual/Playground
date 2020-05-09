#include<iostream>
using namespace std;
int main()
{
  int n,odd,even,temp,r;
  odd=0;
  even=0;
  std::cin>>n;
  temp=n;
  while(n!=0){
    r=n%10;
    if(r%2!=0){
      odd=odd+r;
    }
    else
      even=even+r;
    n/=10;
  }
  if(odd==even){
    std::cout<<"Yes";
  }
  else
    std::cout<<"No";
}

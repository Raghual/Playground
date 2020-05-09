#include<iostream>
using namespace std;
int main()
{
  int n,count;
  std::cin>>n;
  count=0;
  if(n==1){
      std::cout<<"1"<<"\n";
      goto koop;
      }
  std::cout<<n<<"\n";
  while(n>1){
    if(n%2==0){
      n/=2;
      std::cout<<n<<"\n";
      count++;
    }
    else{
      n=3*n+1;
      std::cout<<n<<"\n";
      count++;
    }
  }
  koop:
      std::cout<<count;
  }
    
  
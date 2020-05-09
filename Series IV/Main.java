#include<iostream>
using namespace std;
int main()
{
  int n,a;
  std::cin>>n;
  int i;
  for(i=1;i<=n;i++){
    if(i%2!=0){
      a=(i*i)-1;
      std::cout<<a<<" ";}
    
    else{
      a=(i*i)-2;
       std::cout<<a<<" ";

    }}
}
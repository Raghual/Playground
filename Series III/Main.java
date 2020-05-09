#include<iostream>
int main(){
  int n,sum,i;
  sum=6;
  std::cin>>n;
  for(i=1;i<=n;i++){
    std::cout<<sum<<" ";
    sum=sum+(5*i);
  }
}
    
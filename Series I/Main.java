#include<iostream>
int main(){
  int n;
  float sum;
  std::cin>>n;
  sum=0.5;
  while(n--){
    std::cout<<sum<<" ";
    sum=sum*3;
  }
}
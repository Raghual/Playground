#include<iostream>
int main(){
  int n,r,r1,sum1;
  std::cin>>n;
  int sum=0;
  while(n!=0){
    r=n%10;
    sum=sum+r;
    n=n/10;
  }
  while(sum!=0){
    r1=sum%10;
    sum1=sum1+r1;
    sum=sum/10;}
  std::cout<<sum1;}
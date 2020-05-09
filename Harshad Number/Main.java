#include<iostream>
using namespace std;
int main()
{
  int n,sum,temp,r;
  sum=0;
  std::cin>>n;
  temp=n;
  while(n>0){
    r=n%10;
    sum=sum+r;
    n=n/10;
}
  if((temp%sum)==0){
    std::cout<<"Harshad Number";
  }
  else
    std::cout<<"Not Harshad Number";

}
  
    
    
    
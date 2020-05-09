#include<iostream>
#include<math.h>
int main(){
  int n,sum,a,b,c,d,e,temp;
  std::cin>>n;
  a=n*n;
  temp=n;
  while(n!=0){
    n=n/10;
    sum=sum+1;
  }
  b=pow(10,sum);
  c=a%b;
  d=a/b;
  e=c+d;
  if(e==temp){
    std::cout<<"Kaprekar Number";
  }
  else
    std::cout<<"Not a Kaprekar Number";
    
}
  
    
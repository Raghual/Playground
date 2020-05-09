#include<iostream>
int main(){
  int a,f,s,n,i;
  std::cin>>a;
  f=0;
  s=1;
  for(i=0;i<a-1;i++){
    n=f+s;
    f=s;
    s=n;
  }
  std::cout<<"The term"<<" "<<a<<" "<<"in the fibonacci series is"<<" "<<f;
}
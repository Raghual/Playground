#include<iostream>
using namespace std;
int main()
{
  int n,f,s,next,i,sum;
  f=0;
  s=1;
  next=0;
  i=0;
  sum=0;
  std::cin>>n;
  while(i<n-1){
    
    next=f+s;
    f=s;
    s=next;
    i++;
    
    
}
  std::cout<<f;
  
}
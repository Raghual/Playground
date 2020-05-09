#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  string a,c;
  int b,d;
  std::cin>>a;
  std::cin>>b;
  c="front";
  d=c.compare(a);
  if(d==0){
    if(b==1)
      std::cout<<"Left Handed";
    else
      std::cout<<"Right Handed";
  }
  else
  {
     if(b==1)
      std::cout<<"Right Handed";
    else
      std::cout<<"Left Handed";
  }
}
    

    
      
      
      
    

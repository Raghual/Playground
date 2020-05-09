#include<iostream>
using namespace std;
int main()
{
  int x,y;
  std::cin>>x;
  if(x<=200)
  {
    y=x*0.5;
    std::cout<<"Rs."<<y;
  }
  else if(x<=400)
  {
    y=x*0.65+100;
    std::cout<<"Rs."<<y;
  }
  else if(x<=600)
  {
    y=x*0.80+200;
    std::cout<<"Rs."<<y;
  }
  else if(x>600)
  {
    y=x*1.25+425;
    std::cout<<"Rs."<<y;
  }
  
  
}
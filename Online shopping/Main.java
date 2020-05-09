#include<iostream>
using namespace std;
int main()
{
  int f1,f2,f3;
  int s1,s2,s3;
  int a1,a2,a3;
  int x,y,z,c,d,f;
  
  std::cin>>f1;
  std::cin>>f2;
  std::cin>>f3;
  std::cin>>s1;
  std::cin>>s2;
  std::cin>>s3;
  std::cin>>a1;
  std::cin>>a2;
  std::cin>>a3;
  x=f1-(f1*f2)/100;
  y=s1-(s1*s2)/100;
  z=a1-(a1*a2)/100;
  c=x+f3;
  d=y+s3;
  f=z+a3;
  std::cout<<"In Flipkart Rs."<<c<<"\n";
  std::cout<<"In Snapdeal Rs."<<d<<"\n";
  std::cout<<"In Amazon Rs."<<f<<"\n";
  if((c<=d) &&(c<=f))
    std::cout<<"He will prefer Flipkart";
  else if((d<=c) &&(d<=f))
    std::cout<<"He will prefer Snapdeal";
  else
    std::cout<<"He will prefer Amazon";
  
  
}
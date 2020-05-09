#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
  int a,b,c;
  std::cin>>a;
  std::cin>>b;
  std::cin>>c;
  if(a<=b && a<=c)
  {
    if(b>=a && b<=c)
      std::cout<<"The treasure is in box which has number"<<" "<<b<<"\n";
    else
      std::cout<<"The treasure is in box which has number"<<" "<<c<<"\n";
    if(b%a==0 && c%a==0)
      std::cout<<"The code to open the box is"<<" "<<a;
    else
       std::cout<<"The code to open the box is 1";
      
  }
  else if(b<=a and b<=c)
  {
    if(a>=b && a<=c)
      std::cout<<"The treasure is in box which has number"<<" "<<a<<"\n";
    else 
      std::cout<<"The treasure is in box which has number"<<" "<<c<<"\n";
     if(a%b==0 && c%b==0)
      std::cout<<"The code to open the box is"<<" "<<b;
    else
       std::cout<<"The code to open the box is 1";
  }
  else
  {
    if(a>=c && a<=c)
      std::cout<<"The treasure is in box which has number"<<" "<<c<<"\n";
    else
      std::cout<<"The treasure is in box which has number"<<" "<<b<<"\n";
    if(a%c==0 && b%c==0)
      std::cout<<"The code to open the box is"<<" "<<c;
    else
       std::cout<<"The code to open the box is 1";
  }
}

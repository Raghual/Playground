#include<iostream>
int main()
{
  int a,b,c;
  int d,i;
  std::cin>>a;
  std::cin>>b;
  if(a<b)
    c=a;
  else
    c=b;
 for(i=1;i<=c;i++){
   if(a%i==0 and b%i==0)
     d=i;
}
  std::cout<<"G.C.D of"<<" "<<a<<" "<<"and"<<" "<<b<<" "<<"="<<" "<<d;
 
  
}
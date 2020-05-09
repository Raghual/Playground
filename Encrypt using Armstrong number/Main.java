#include<iostream>
#include<math.h>
int main()
{
  int n,i,count,r,sum,a,b;
  std::cin>>n;
  sum=0;
  a=n;
  b=n;
  while(n!=0){
    n=n/10;
    count++;}
  while(a!=0){
    r=a%10;
    sum=sum+pow(r,count);
    a=a/10;
   
}
  if(sum==b){
    std::cout<<"Kindly proceed with encrypting";}
  else
    std::cout<<"It is not an Armstrong number";
}
  
  
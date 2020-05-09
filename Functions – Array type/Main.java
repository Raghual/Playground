#include<iostream>
using namespace std;
int main()
{
  int n,a[20],i,flag=0,flags=0;
  std::cout<<"Enter the number of elements in the array"<<"\n";
  std::cin>>n;
  std::cout<<"Enter the elements in the array"<<"\n";
  for(i=0;i<n;i++){
    std::cin>>a[i];}
  for(i=0;i<n;i++){
    if(a[i]%2==0)
      flag=1;
    else
      flags=2;
  }
  if(flag==1&&flags==0)
    std::cout<<"The array is Even";
  else if(flags==2 && flag==1)
    std::cout<<"The array is Mixed";
  else
    std::cout<<"The array is Odd";


}

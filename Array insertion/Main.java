#include<iostream>
using namespace std;
int main()
{
  int n,a[10],i,pos,num;
  std::cout<<"Enter the number of elements in the array"<<"\n";
  std::cin>>n;
  std::cout<<"Enter the elements in the array"<<"\n";
  for(i=0;i<n;i++){
    std::cin>>a[i];}
  std::cout<<"Enter the location where you wish to insert an element"<<"\n";
  std::cin>>pos;
  if(pos>n-1)
    std::cout<<"Invalid Input";
  else{
    std::cout<<"Enter the value to insert"<<"\n";
    std::cin>>num;
    n++;
    std::cout<<"Array after insertion is"<<"\n";
    for(i=n;i>pos-1;i--){
      a[i]=a[i-1];}
    a[pos-1]=num;
    for(i=0;i<n;i++){
      std::cout<<a[i]<<"\n";}
  }

  
}
#include<iostream>
using namespace std;
int main()
{
  int n,a[20],i;
  std::cin>>n;
  int sun,moon;
  sun=0;
  moon=0;
  for(i=0;i<n;i++){
    std::cin>>a[i];}
  for(i=0;i<n;i++){
    if(a[i]%2!=0){
      sun=sun+a[i];}
    else
      moon=moon+a[i];}
  std::cout<<"The sum of the even numbers in the array is "<<moon<<"\n";
  std::cout<<"The sum of the odd numbers in the array is "<<sun<<"\n";
}
#include<iostream>
int main()
{
  int n,i,arr[50],max;
  std::cin>>n;
  for(i=0;i<n;i++){
    std::cin>>arr[i];}
  max=arr[0];
  for(i=1;i<n;i++){
    if(arr[i]>max)
      max=arr[i];}
    std::cout<<max;

}
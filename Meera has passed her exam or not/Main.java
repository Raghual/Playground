#include<iostream>
int main()
{
  int n,a,i,flag=0;
  std::cin>>n;
  int arr[50];
  for(i=0;i<n;i++){
    std::cin>>arr[i];}
  std::cin>>a;
  for(i=0;i<n;i++){
    if(arr[i]==a){
      flag=1;
      break;}
    else
      flag=0;
  }
  if(flag==1)
    std::cout<<"She passed her exam";
  else
    std::cout<<"She failed";
}
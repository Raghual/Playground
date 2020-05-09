#include<iostream>
using namespace std;
int main()
{
  int n,i,a[10];
  std::cin>>n;
  int k=0;
  int b[10]={1};
  for(i=0;i<n;i++){
    std::cin>>a[i];}
  for(i=0;i<n;i++){
    if(a[i+1]<a[i]){
      b[i+1]=1;}
    else{
      k+=2;
      b[i+1]=k;}}
  for(i=0;i<n;i++){
    std::cout<<b[i]<<"\n";}}
  
  
  
  

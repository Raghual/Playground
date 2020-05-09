#include<iostream>
int main(){
  int n,i,flag;
  std::cin>>n;
  for(i=2;i<n;i++){
    if(n%i==0){
      flag=1;
      break;}
    else
      flag=2;
     
  }
  if(flag==2)
    std::cout<<"Eligible";
  else
    std::cout<<"Not eligible";
}
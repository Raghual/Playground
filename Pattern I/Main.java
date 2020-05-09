#include<iostream>
int main()
{
  int n;
  int i,j;
  std::cin>>n;
  for(i=0;i<=3;i++){
    for(j=0;j<=i;j++){
      std::cout<<n;
    }
    n++;
    std::cout<<"\n";
  }
  n--;
  for(i=3;i>=0;i--){
    for(j=0;j<=i;j++){
      std::cout<<n;}
    n--;
    std::cout<<"\n";
  }
}
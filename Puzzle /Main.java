#include<iostream>
int main()
{
    int r,c,i,j;
  int a[10][10];
  int b[10][10];
  std::cin>>r;
  std::cin>>c;
  for(i=0;i<r;i++){
    for(j=0;j<c;j++){
      std::cin>>a[i][j];}}
  for(i=0;i<c;i++){
    for(j=0;j<r;j++){
      std::cout<<a[j][i]<<" ";}
    std::cout<<"\n";}
  
}


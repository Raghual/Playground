#include<iostream>
int main()
{
    int r,c,i,j;
  int a[10][10];
  int b[10][10];
  int d[10][10];
  std::cin>>r;
  std::cin>>c;
  for (i=0;i<r;i++){
    for(j=0;j<c;j++){
      std::cin>>a[i][j];}}
  for (i=0;i<r;i++){
    for(j=0;j<c;j++){
      std::cin>>b[i][j];}}
  for (i=0;i<r;i++){
    for(j=0;j<c;j++){
      d[i][j]=a[i][j]+b[i][j];
      std::cout<<d[i][j]<<" ";
    }
    std::cout<<"\n";}
}


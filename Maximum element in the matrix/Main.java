#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,a[10][10],maxi;
  std::cin>>r;
  std::cin>>c;
  for(i=0;i<r;i++){
    for(j=0;j<c;j++){
      std::cin>>a[i][j];
    }
  }
  maxi=a[0][0];
  for(i=0;i<r;i++){
    for(j=0;j<c;j++){
      if(a[i][j]>maxi)
        maxi=a[i][j];
     
    }
  }
  std::cout<<"The maximum element is "<<maxi;
}
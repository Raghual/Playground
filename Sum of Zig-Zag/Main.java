#include<iostream>
int main()
{
  int r,c,i,j,a[10][10],sum,row,row1,row2,b;
  std::cin>>r;
  std::cin>>c;
  sum=0;
  for(i=0;i<r;i++){
    for(j=0;j<c;j++){
      std::cin>>a[i][j];
    }
  }
  for(i=0;i<=0;i++){
    for(j=0;j<c-1;j++){
      sum=sum+a[i][j];
    }
    row=sum;
  }
 
  sum=0;
  for(i=r-1;i<=r-1;i++){
    for(j=1;j<=c-1;j++){
      sum=sum+a[i][j];
    }
    row1=sum;
  }
  sum=0;
  for(i=0;i<r;i++){
    for(j=0;j<c;j++){
      if(i+j==r-1){
        sum=sum=sum+a[i][j];}
    }
    row2=sum;
  }
  b=row+row1+row2;
  std::cout<<"Sum of Zig-Zag pattern is "<<b;
}
  
      
#include<iostream>
int main()
{
  int start,end,sum,j;
  std::cin>>start;
  std::cin>>end;
  while(start<=end){
    sum=0;
    j=1;
    while(j<start){
      if(start%j==0){
        sum=sum+j;
      }
      j++;}
      if(sum==start){
        std::cout<<start<<" ";
      }
    start++;
  }
}
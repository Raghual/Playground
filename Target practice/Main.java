#include<iostream>
using namespace std;
int main()
{
  int n,i,count,sum;
  std::cin>>n;
  i=1;
  count=0;
  sum=0;
  while(sum<n){
    std::cin>>i;
    sum=sum+i;
    count++;
  }
  std::cout<<"The number of turns is"<<" "<<count;
}
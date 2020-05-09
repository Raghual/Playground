#include<iostream>
using namespace std;
int main()
{
  int row,col,a,treenum;
  std::cin>>row;
  std::cin>>col;
  std::cin>>treenum;
  a=treenum+(col-1);
  if(treenum<=col)
    std::cout<<"Yes";
  else if(a%col==0)
    std::cout<<"Yes";
  else if(treenum%col==0)
    std::cout<<"Yes";
  else
    std::cout<<"No";
}
    
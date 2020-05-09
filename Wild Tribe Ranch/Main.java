#include<iostream>
int main()
{
  int x,y;
  std::cin>>x;
  std::cin>>y;
  if(x==y)
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  else if(x<y)
    std::cout<<"Sorry, you can't enter";
  else
    std::cout<<"Yes, you can enter.";
}
  
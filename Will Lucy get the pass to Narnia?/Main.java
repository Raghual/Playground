#include<iostream>
int main()
{
  int x,y,z,c,d,e,f,g;
  std::cin>>x;
  std::cin>>y;
  std::cin>>z;
  std::cout<<"Enter first number : Enter second number : Menu"<<"\n"<<"1.Addition"<<"\n"<<"2.Subtraction"<<"\n"<<"3.Multiplication"<<"\n"<<"4.Division"<<"\n"<<"5.Remainder"<<"\n";
  switch (z)
  {
    case 1:
      c=x+y;
      std::cout<<c;
      break;
    case 2:
      d=x-y;
      std::cout<<d;
      break;
    case 3:
      e=x*y;
      std::cout<<e;
      break;
    case 4:
      f=x/y;
      std::cout<<f;
      break;
    case 5:
      g=x%y;
      std::cout<<g;
      break;
    default:
      std::cout<<"Invalid operation";
  }
}
  

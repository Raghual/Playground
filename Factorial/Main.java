#include <iostream>
long factorial(long);
int main ()
{
  long number,a;
  std::cin>>number;
  a= factorial (number);
  std::cout<<"The factorial of"<<" "<<number<<" "<<"is"<<" "<<a;
  return 0;
}
long factorial (long a)
{
  long fact=1;
  for(int i=1;i<=a;i++)
        fact=fact*i;
  return fact;
        
  

}
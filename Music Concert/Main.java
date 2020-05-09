#include<iostream>
#include<cstdlib>
int main(){
  int n,i,mc,fc;
  std::cin>>n;
  mc=0;
  fc=0;
  int *p;
  p=(int *)malloc(n*sizeof(int));
  for(i=0;i<n;i++){
    std::cin>>*(p+i);}
  for(i=0;i<n;i++){
    if(*(p+i)%2==0){
      fc+=1;}
    else
      mc+=1;}
  std::cout<<mc<<"\n";
  std::cout<<fc<<"\n";
  return 0;
}
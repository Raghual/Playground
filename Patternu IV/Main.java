#include <iostream>
using namespace std;
int main() {
  int n;
  std::cin>>n;
  int i,j,k;
  k=1;
  for(i=1;i<=n;i++){
    if(i%2!=0){
      for(j=1;j<n;j++){
        std::cout<<k;}
      k++;
      std::cout<<k<<"\n";
    }
    else{
      k++;
      std::cout<<k;
      k--;
      for(j=2;j<=n;j++){
        std::cout<<k;}
      std::cout<<"\n";
      k++;
      
    }
    
     
}
}
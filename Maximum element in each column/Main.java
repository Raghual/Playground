#include<iostream>
using namespace std;
int main ()
{
    int m, n, i, j, A[10][10],maxi;
    cin >> m;
    cin >> n;
    for (i = 0; i < m; i++)
        for (j = 0; j < n; j++)
            cin >> A[i][j];
    for(i=0;i<n;i++){
    maxi=A[0][i];

    for(j=1;j<m;j++){

      if(maxi<A[j][i])
        maxi=A[j][i];

    }
    std::cout<<maxi<<"\n";



}}

#include<iostream>
using namespace std;
int main()
{
  		int m,n;
  		cin>>n>>m;
        int m1[n][m], m2[n][m], i, j, m3[n][m];
        for(i=0; i<n; i++)
        {
                for(j=0; j<m; j++)
                {
                        cin>>m1[i][j];
                }
        }
        for(i=0; i<n; i++)
        {
                for(j=0; j<m; j++)
                {
                      
                        cin>>m2[i][j];
                }
        }
  		for(i=0; i<n; i++)
        {
                for(j=0; j<m; j++)
                {
                        m3[i][j]=m1[i][j]+m2[i][j];
                }
        }
        for(i=0; i<n; i++)
        {

                for(j=0; j<m; j++)
                {
                        cout<<m3[i][j]<<" ";
                }
                cout<<"\n";
        }
        return 0;
}
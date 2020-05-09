#include<iostream>
using namespace std;
int main()
{
  int m,n,req;
  cin>>m>>n>>req;
  int pow=1;
  for(int i=1;i<=n;i++)
      pow=pow*m;
  if(pow >= req )
     cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}
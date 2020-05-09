#include<iostream>
using namespace std;
int main()
{
  int n,sum=0;
  cin>>n;
  cout<<n<<"\n";
  while(n!=1)
  {
    if(n%2==0)
    {
      cout<<n/2<<"\n";
      n=n/2;
      sum=sum+1;
    }
    else
    {
      cout<<3*n+1<<"\n";
      n=3*n+1;
      sum=sum+1;
    }}
    cout<<sum<<"\n";
  }

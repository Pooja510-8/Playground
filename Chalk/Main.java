#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int c,t;
  int sum=0;
  cin>>c;
  for(int i=c;i>=1;i--)
    sum=sum+sqrt(c);
  sum=sum/c;
  cout<<c+sum+1;
}
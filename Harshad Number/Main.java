#include<iostream>
using namespace std;
int main()
{
  int i,n,sum=0,f;
  cin>>n;
  f=n;
  while(n>0)
  {
    sum=sum+n%10;
    n=n/10;
  }
  if(f%sum==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}
#include<iostream>
using namespace std;
int main()
{
int a,t3,t1=0,t2=1,i;
  cin>>a;
  for(i=3;i<=a;i++)
  {
    t3=t1+t2;
    t1=t2;
    t2=t3;
  }
  cout<<t3;
  
}
#include<iostream>
using namespace std;
int main()
{
  int num;
  cin>>num;
  int s1=0,s2=0,s;
  while(num>0)
  {
    s=num%10;
    num=num/10;
    if(s%2==0)
      s1=s1+s;
    else
      s2=s2+s;
  }
  if(s1==s2)
    cout<<"Yes";
  else
    cout<<"No";
}



#include<iostream>
using namespace std;
int main()
{
  int d1,c1,d2,c2,td,tc;
  cin>>d1>>c1>>d2>>c2;
  td=d1+d2;
  td=td+(c1+c2)/100;
  tc=(c1+c2)%100;
  cout<<td<<"\n"<<tc;
}
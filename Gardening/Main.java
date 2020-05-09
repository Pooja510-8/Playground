#include<iostream>
using namespace std;
int main()
{
  int r,c,m,total;
  cin>>r>>c>>m;
  total=r*c;
  if((m>r && m<=2*r) ||(m<=(total-r) && m>total-2*r))
    cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";
}
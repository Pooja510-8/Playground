#include<iostream>
using namespace std;
int main()
{
  int r,c,no;
  cin>>r>>c>>no;
  int total=r*c;
  if((no>1 && no<=c)||(no%c==1)||(no%c==0))
  {
    cout<<"Yes";
  }
  else
    cout<<"No";
 

}
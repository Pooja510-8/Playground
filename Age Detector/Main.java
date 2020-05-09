#include<iostream>
using namespace std;
int main()
{
 	int b,c;
  cin>>b>>c;
  if(b>=c)
    cout<<100+c-b;
  else
    cout<<c-b;
}
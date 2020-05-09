#include<iostream>
using namespace std;
int main()
{
  int a,c,total,max;
  cin>>max>>a>>c;
  total=a*75+c*30;
  if(max>=total)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
}
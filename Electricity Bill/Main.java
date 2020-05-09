#include<iostream>
using namespace std;
int main()
{
  int unit,final;
  cin>>unit;
  if(unit<=200)
  {
    final=0.5*unit;
    	cout<<"Rs."<<final;
  }
  else if(unit>200 &&unit<=400)
  {
    final=unit*0.65+100;
    	cout<<"Rs."<<final;
  }
  else if(unit>400 &&unit<=600)
  {
    final=unit*0.80+200;
    	cout<<"Rs."<<final;
  }
  else
  {
        final=unit*1.25+425;
    	cout<<"Rs."<<final;
  }
  
}
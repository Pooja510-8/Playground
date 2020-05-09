#include<iostream>
using namespace std;
int main()
{
  int p,i,n;
  float in,amt,dis,fin;
  cin>>p>>i>>n;
  in=(p*n*i)/100;
  amt=in+p;
  dis=(in*2)/100;
  fin=amt-dis;
  cout<<in<<"\n"<<amt<<"\n"<<dis<<"\n"<<fin;

}
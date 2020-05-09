#include<iostream>
using namespace std;
int main()
{
  int fa,fd,fs,sa,sd,ss,aa,ad,as,flip,snap,ama;
  cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as;
  flip=fa-(fa*fd/100)+fs;
  snap=sa-(sa*sd/100)+ss;
  ama=aa-(aa*ad/100)+as;
  cout<<"In Flipkart Rs."<<flip<<"\n";
  cout<<"In Snapdeal Rs."<<snap<<"\n";
  cout<<"In Amazon Rs."<<ama<<"\n";
  int max;
  max=flip;
  if(flip<=snap && flip<ama)
    cout<<"He will prefer Flipkart";
  else if(snap<flip && snap<ama)
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
}
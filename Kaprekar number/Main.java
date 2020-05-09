#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int num,l,a,b,ans=1,sq,f;
  int sum=0;
  cin>>num;
  f=num;
  num=num*num;
  sq=num;
  while(num>0)
  {
    num=num/10;
    sum=sum+1;
  }
  if(sum%2==0)
    l=sum/2;
  else
    l=sum/2+1;
  for(int i=1;i<=l;i++)
    ans=ans*10;
  a=sq%ans;
  b=sq/ans;
  if(a+b==f)
    cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
}

  

#include<iostream>
using namespace std;
int main()
{
  int a,b,c,mid,low,i;
  cin>>a>>b>>c;
  if((a<b && a>c)||(a>b &&a<c))
  {
	mid=a;
    cout<<"The treasure is in box which has number "<<a<<"\n";
  }
  else if((b<a && b>c)||(b>a &&b<c))
  {
	mid=b;
    cout<<"The treasure is in box which has number "<<b<<"\n";
  }
    else
    {
      mid=c;
       cout<<"The treasure is in box which has number "<<c<<"\n";
    }
   if(a>b && c>b)
     low=b;
    else if(b>c && a>c)
      low=c;
   else
     low=a;
  for(i=low;i>=1;i--)
  {
    if(a%i==0 && b%i==0 &&c%i==0)
    {
      cout<<"The code to open the box is "<<i;
       break;
    }
  }
  }


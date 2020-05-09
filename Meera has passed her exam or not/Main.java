#include<iostream>
int main()
{
  int n,i,cnt=0;
  std::cin>>n;
  int a[n];
  for( i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  int m;
  std::cin>>m;
  for(i=0;i<n;i++)
  {
    if(a[i]==m)
    {
      cnt=1;
      break;
    }
  }
  if(cnt==0)
  {
    std::cout<<"She failed";
  }
  else
    std::cout<<"She passed her exam";
}

#include<iostream>
int main()
{
  int n,max,i;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
 max=a[0];
  for(i=0;i<n;i++)
  {
    if(max<a[i])
      max=a[i];
}
  std::cout<<max;
}
#include<iostream>
#include <bits/stdc++.h>
using namespace std;
void printPattern(int n)
{
  int j,k = 0;
  for(int i=1; i<=n; i++)
  {
    if(i%2 != 0)
    {
      for(j=k+1; j<k+i; j++)
        std::cout<< j << "*";
      std::cout<< j++ <<endl;
      k = j;
    }
    else
    {
       k = k+i-1;
      for(j=k; j>k-i+1; j--)
        std::cout<< j << "*";
      std::cout<< j <<endl;
    }
  }
}
int main()
{
  int n;
  std::cin>>n;
  printPattern(n);
  return 0;
}
#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char str1[50];
  char str2[50];
  cin>>str1;
  cin>>str2;
  int comp=memcmp(str1,str2,5);
  if(comp==0)
    std::cout<<"It is correct";
  else
    std::cout<<"It is wrong";
}
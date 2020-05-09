#include<iostream>
using namespace std;
int power_of_number(int a, int n)
{
  if(n!=0)
    return(a*power_of_number(a,n-1));
  else
    return 1;
}
int main()
{
  int a,n;
  cout<<"Enter the value of a";
  cin>>a;
  cout<<"\nEnter the value of n";
  cin>>n;
  cout<<"\nThe value of "<<a<<" power "<<n<<" is "<<power_of_number(a,n);
}
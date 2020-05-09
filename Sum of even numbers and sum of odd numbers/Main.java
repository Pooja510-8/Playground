#include<iostream>
using namespace std;
int main()
{
   int Size,i,a[10];
   int Even_sum=0,Odd_sum=0;
  cin>>Size;
 for(i=0;i<Size;i++) 
 {
   cin>>a[i];
 }
  for(i=0;i<Size;i++)
  {
    if(a[i]%2 == 0)
    {
      Even_sum=Even_sum+a[i];
    }
    else
    {
      Odd_sum=Odd_sum+a[i];
    }
  }
    cout<<"The sum of the even numbers in the array is "<<Even_sum;
    cout<<"\nThe sum of the odd numbers in the array is "<<Odd_sum;
    return 0;
    
}
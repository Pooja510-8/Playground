#include<iostream>
 
using namespace std;
 
int main()
{
    int i,a[20],no,pos,size;
    cout<<"Enter the number of elements in the array ";
    cin>>size;
	cout<<"\nEnter the elements in the array";
 
	for(i=0; i<size; i++)
	{
	   
		cin>>a[i];
	}
 
  /*cout<<"\nStored Data in Array :: \n\n";
 
  for(i=0;i<size;i++)
  {
  cout<<" "<<a[i]<<" ";
  }
 */
  cout<<"\nEnter the location where you wish to insert an element";
  cin>>pos;
 
  if(pos>size)
  {
    cout<<"\nInvalid Input\n";
  }
  else
  {
    cout<<"\nEnter the value to insert ";
    cin>>no;
    --pos;
 
  for(i=size;i>=pos;i--)
  {
    a[i+1]=a[i];
  }
  a[pos]=no;
 
  cout<<"\nArray after insertion is";
 
  for(i=0;i<size+1;i++)
  {
    cout<<"\n"<<a[i];
  }
 
  }
  //cout<<"\n";
 
  return 0;
 
  }


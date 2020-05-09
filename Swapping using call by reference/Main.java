#include <bits/stdc++.h> 
using namespace std; 
  
int main() 
{ 
    int x , y ;
  std::cin>>x>>y;
  std::cout<<"Before swapping a= "<<x<<" and b="<<y;
    // Code to swap 'x' and 'y' 
    x = x + y; // x now becomes 15 
    y = x - y; // y becomes 10 
    x = x - y; // x becomes 5 
    cout << "\nAfter swapping a= " << x << " and b=" << y; 
} 
  
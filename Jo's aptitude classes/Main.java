#include<iostream>
using namespace std;
int main()
{
    int n,m,o,p;
    cin>>n>>m>>o>>p;
    if( m % p== 0 && n % p ==0 && o % p==0 )
    cout<<"Answer is correct.";
    else
    cout<<"Answer is wrong.";
}
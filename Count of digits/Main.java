#include<iostream>
using namespace std;
int main()
{
    int num,digit=0;
    
    //user input
    cin>>num;
    //loop to find number digits
    do
    {
            num=num/10;
            digit++;
    }while(num!=0);
    //output
    cout<<digit;
    return 0;
}
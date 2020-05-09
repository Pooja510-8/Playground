#include<iostream>
#include<math.h>
using namespace std;
int main ()
{ 
	int x1=3,y1=4,x2,y2;
	int power,power1,power2,sqr;
	std::cin>>x2;
    std::cin>>y2;
	power1=pow((x2-x1),2);
	power2=pow((y2-y1),2);
	power=power1+power2;
	sqr=sqrt(power);
	std::cout<<sqr;
	return 0;
}
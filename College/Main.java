#include<iostream>
#include<string.h>
using namespace std;
struct Student
{
  char name[30];
  char city[20];
  int yr;
  float per;
};

int main()
{
  struct Student s1[1000];
  struct Student t;
  int i,j,n;
 // scanf("%d",&n);
  cout<<"Enter the number of colleges";
  cin>>n;
/*Enter the details of college 
Enter name
Enter city
Enter year of establishment
Enter pass percentage*/
  for(i=0;i<n;i++)
  {
    cout<<"\nEnter the details of college "<<i+1;
    cout<<"\nEnter name";
    cin>>s1[i].name;
    cout<<"\nEnter city";
    cin>>s1[i].city;
    cout<<"\nEnter year of establishment";
    cin>>s1[i].yr;
    cout<<"\nEnter pass percentage";
    cin>>s1[i].per;
    /*scanf("%s",S1[i].name);
    scanf("%s",S1[i].department);
    scanf("%d",&S1[i].yearOfStudy);
    scanf("%f",&S1[i].cgpa);*/
  }
  for(i=0;i<n;i++)
  {
    for(j=i+1;j<n;j++)
    {
      if(strcmp(s1[i].name,s1[j].name)>0)
      {
        t=s1[i];
        s1[i]=s1[j];
        s1[j]=t;
      }
    }
  }
  
     cout<<"\nDetails of colleges";   
  for(i=0;i<n;i++)
  {//cout<<"Details of Colleges";
    cout<<"\nCollege:"<<i+1;
    printf("\nName:%s\n",s1[i].name);
    printf("City:%s\n",s1[i].city);
    printf("Year of establishment:%d\n",s1[i].yr);
    cout<<"Pass percentage:"<<s1[i].per;
  }
  return 0;
}


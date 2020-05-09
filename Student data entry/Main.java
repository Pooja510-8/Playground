#include <iostream>
using namespace std;

struct student
{
    char name[50];
    int roll;
    float marks;
} s[0];

int main()
{
    //cout << "Student Details" << endl;
    for(int i = 0; i < 1; ++i)
    {
        //s[i].roll = i+1;
        cin.getline(s[i].name,50);
        cin>> s[i].roll;
        cin >> s[i].marks;
    }

    cout << "\nStudent Details " << endl;

    // Displaying information
    for(int i = 0; i < 1; ++i)
    {
      	cout << "Name: " << s[i].name << endl;
        cout << "Roll: " << s[i].roll << endl;
        cout << "Marks: " << s[i].marks << endl;
    }
return 0;
}
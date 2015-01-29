#include <iostream>
#include <fstream>

using namespace std;

void string_reverse1(char*); 

int main()
{
	char test[] = "millerlite"; 
	string_reverse1(test); 
	cout << test << endl; 
}


void string_reverse1(char *string)
{
	
	char temp;
	int end = 0, beginning = 0;
	while (string[end] != NULL)
	{
		end++;
	}
	end--; 
	while (beginning < end)
	{
		temp = string[end];
		string[end] = string[beginning];
		string[beginning] = temp;
		beginning++;
		end--;
	}


}
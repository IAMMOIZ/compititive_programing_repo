/*
//row basis
A
BB
CCC
DDDD
EEEEE

*/
#include<stdio.h>
int main()
{
    int row , column;
    char a='A';
    for(row = 1; row <= 5; row++)
    {
        for(column = 1; column <= row; column++)
        {
            printf("%c",a);
        }
        a++;
        printf("\n");
    }
}
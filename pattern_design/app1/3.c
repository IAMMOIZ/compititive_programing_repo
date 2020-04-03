/*
//row basis
5
44
333
2222
11111

*/
#include<stdio.h>
int main()
{
    int row , column;
    for(row = 1; row <= 5; row++)
    {
        for(column = 1; column <= row; column++)
        {
            printf("%d",6-row);
        }
        printf("\n");
    }
}
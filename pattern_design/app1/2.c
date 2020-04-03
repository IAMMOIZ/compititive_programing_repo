/*
//row basis
1
22
333
4444
55555

*/
#include<stdio.h>
int main()
{
    int row , column;
    for(row = 1; row <= 5; row++)
    {
        for(column = 1; column <= row; column++)
        {
            printf("%d",row);
        }
        printf("\n");
    }
}